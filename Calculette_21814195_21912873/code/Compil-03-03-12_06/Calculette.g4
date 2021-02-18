grammar Calculette;

@parser::members {
    private TablesSymboles tablesSymboles = new TablesSymboles();
    private int _cur_label = 0;
    /** générateur de nom d'étiquettes */
    private int nextLabel() { return _cur_label++; }
    private String evalexpr (String x, String op, String y) {
        if ( op.equals("*")){
            String ch =  ""+x+ ""+y+"MUL \n";
            return ch;
        } else if ( op.equals("+") ){
          String ch =  ""+x+ ""+y+"ADD \n";
          return ch;
        }else if ( op.equals("-") ){
          String ch =  ""+x+ ""+y+"SUB \n";
          return ch;
        }else if ( op.equals("/") ){
          String ch =  ""+x+ ""+y+"DIV \n";
          return ch;
        }
         else {
           System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
           throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
        }
    }
}
start :
calcul EOF;

calcul returns [ String code ]
@init{ $code = new String(); }   //On initialise code, pour ensuite l'utiliser comme accumulateur
@after{ System.out.println($code); }
    :   (decl { $code += $decl.code; })*

        NEWLINE*

        { int entry = nextLabel(); $code += "  JUMP " + entry + "\n"; }
        NEWLINE*

       (fonction { $code += $fonction.code+"\n"; })*
        NEWLINE*


        { $code += "LABEL " + entry + "\n"; }
        (instruction { $code += $instruction.code+"\n"; })

        (instruction { $code += $instruction.code+"\n"; })*

        { $code += "  HALT \n"; }
    ;

decl returns [ String code ]
  :
      TYPE IDENTIFIANT finInstruction
      {
          // a completer
          tablesSymboles.putVar($IDENTIFIANT.text, "int");
          $code = "PUSHI 0\n"; //$TYPE.text+$IDENTIFIANT.text;
      }
      |
      TYPE IDENTIFIANT '=' expr finInstruction
      {
          // a completer
          tablesSymboles.putVar($IDENTIFIANT.text, "int");
          $code =  $expr.code;
      }
  ;

    expr returns [ String code ]
       : '-' a=expr {$code= "PUSHI 0\n"+$a.code+"SUB \n";}
       | a=expr op=('*'|'/') b=expr {$code=evalexpr($a.code,$op.text,$b.code);}
       | a=expr op=('+'|'-') b=expr {$code=evalexpr($a.code,$op.text,$b.code);}
       | '('a=expr')' {$code = $a.code;}
       | ENTIER {$code=" PUSHI "+$ENTIER.text+"\n";}
       |IDENTIFIANT
        {

          AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
          if(at.adresse>=0){
              $code ="PUSHG "+ at.adresse+"\n";
          }else{
              $code ="PUSHL "+ at.adresse+"\n";
          }
        }
        |IDENTIFIANT '(' args ')'                  // appel de fonction
            {
             $code = "PUSHI 0 \n"+$args.code+" CALL "+tablesSymboles.getFunction($IDENTIFIANT.text).adresse+"\n";
                for(int i = 0; i<$args.size; i=i+1)
                {
                  $code+="POP \n";
                }
            }
       ;

 instruction returns [ String code ]
     : expr finInstruction
         {
             $code = $expr.code;
         }
     | assignation finInstruction
         {

             $code = $assignation.code;
         }
     | finInstruction
         {
             $code="";
         }
    | lecture finInstruction
    {
        $code = $lecture.code;
    }
    | ecriture finInstruction
    {
       $code  = $ecriture.code;
    }
    | boucle
    {
      $code = $boucle.code;
    }
    | branchement
    {
      $code = $branchement.code;
    }
    | bloc finInstruction
    {
        $code = $bloc.code;
    }
    |  RETURN expr finInstruction
        {
          // ajout
          AdresseType at = tablesSymboles.getAdresseType("return");
          $code = $expr.code + "STOREL " + at.adresse  + "\n   RETURN\n";
        }
     ;




finInstruction : ( NEWLINE | ';')+ ;

 assignation returns [ String code ]
     : IDENTIFIANT '=' expr (finInstruction)?
         {
           AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
           if(at.adresse>=0){
           $code = $expr.code + "STOREG " + at.adresse  + "\n";
         }else{
           $code = $expr.code + "STOREL " + at.adresse  + "\n";
         }
      }
     ;
    lecture returns [String code]
    :
        'read' '(' IDENTIFIANT ')'
        {
          AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
          $code = "READ\n";
          $code += "STOREG " + at.adresse  + "\n";

        }
    ;
    ecriture returns [String code]
    :
       'write' '(' expr ')'
       {
         $code = $expr.code;
          $code += "WRITE\n";
          $code += "POP\n";
        }
    ;

    boucle returns [String code]
    :
    'while' '(' condition ')' i = instruction
    {
      int outputLabel = nextLabel();
      int inputLabel = nextLabel();
      $code = "LABEL " + inputLabel +"\n" + $condition.code + "JUMPF " + outputLabel + "\n" + $i.code + "JUMP " + inputLabel + "\n LABEL " + outputLabel+"\n";
    }
    |'for' '(' a=assignation c=condition ';' b=assignation ')' i=instruction
    {
      int outputLabel = nextLabel();
      int inputLabel = nextLabel();
      $code = $a.code+"LABEL " + inputLabel +"\n" + $c.code + "JUMPF " + outputLabel + "\n "+ $i.code+$b.code  + "JUMP " + inputLabel +
      "\n LABEL " + outputLabel+"\n";
    }
    |'repeat' i=instruction 'until' '(' c=condition ')'
    {
      int outputLabel = nextLabel();
      int inputLabel = nextLabel();
      $code = "LABEL " + inputLabel +"\n" + $i.code +$c.code+ "JUMPF " + inputLabel + "\n";
    }
    ;


    branchement returns [String code]
     :'if' '(' c=condition ')' i=instruction
      {
        int outputLabel = nextLabel();
          $code = $c.code+ "JUMPF " + outputLabel+ "\n"+$i.code +"\n LABEL "+ outputLabel +"\n";
      }
      |'if' '(' c=condition ')' i=instruction 'else' j=instruction
      {
        int outputLabel = nextLabel();
        int inputLabel = nextLabel();
        $code = $c.code+"JUMPF "+outputLabel+"\n"+$i.code+"JUMP "+ inputLabel+"\n LABEL "+outputLabel+"\n "+$j.code+"\n LABEL "+inputLabel+"\n";
      }
    ;

    condition returns [String code]
    : 'true'  { $code = "  PUSHI 1\n"; }
    | 'false' { $code = "  PUSHI 0\n"; }
    |e1=expr '==' e2=expr {$code = $e1.code+$e2.code+"EQUAL \n";}
    |e1=expr '!=' e2=expr {$code = $e1.code+$e2.code+"NEQ\n";}
    |e1=expr '<>' e2=expr {$code = $e1.code+$e2.code+"NEQ\n";}
    |e1=expr '<' e2=expr  {$code = $e1.code+$e2.code+"INF\n";}
    |e1=expr '>' e2=expr  {$code = $e1.code+$e2.code+"SUP\n";}
    |e1=expr '<=' e2=expr {$code = $e1.code+$e2.code+"INFEQ\n";}
    |e1=expr '>=' e2=expr {$code = $e1.code+$e2.code+"SUPEQ\n";}
    |a=condition '&&' b=condition {$code  = $a.code+$b.code+"MUL\n";}
    |a=condition '||' b=condition {$code = $a.code+$b.code+"ADD\n"; }
    |'!' b=condition {$code = $b.code+"PUSHI 0\n"+"EQUAL\n";}
    ;
   bloc returns [String code]
   @init{ $code = new String(); }
    :'{' (instruction { $code += $instruction.code+"\n"; })* '}' NEWLINE*
    ;

    // fonction
    fonction returns [ String code ]
    @init{tablesSymboles.newTableLocale();}
    @after{tablesSymboles.dropTableLocale();}
    :TYPE {tablesSymboles.putVar("return", $TYPE.text);}

      IDENTIFIANT '('  params? ')'
        {
          int labFn = nextLabel();
          tablesSymboles.newFunction($IDENTIFIANT.text, labFn , $TYPE.text);
          $code = "LABEL "+labFn+"\n";
        }
        bloc
        {
          $code += $bloc.code+"RETURN\n";
        }
/*
       IDENTIFIANT '('')'
          {
            int labFn = nextLabel();
            tablesSymboles.newFunction($IDENTIFIANT.text, labFn , $TYPE.text);
            $code = "LABEL "+labFn+"\n";
          }
          bloc
          {
            $code += $bloc.code+"RETURN\n";
          }
          |IDENTIFIANT '(' params ')'
            {
              int labFn = nextLabel();
              tablesSymboles.newFunction($IDENTIFIANT.text, labFn , $TYPE.text);
              $code = "PUSHL "+$params.code+"\n LABEL "+labFn+"\n";
            }
            bloc
            {
              $code += $bloc.code+"RETURN\n";
            }
            */
    ;
params
    : TYPE IDENTIFIANT
        {
            // code java gérant la déclaration de "la variable" de retour de la fonction
            tablesSymboles.putVar($IDENTIFIANT.text, $TYPE.text);

        }
        (',' TYPE IDENTIFIANT
            {
                // code java gérant une variable locale (argi)
                tablesSymboles.putVar($IDENTIFIANT.text, $TYPE.text);

            }
        )*
    ;

 // init nécessaire à cause du ? final et donc args peut être vide (mais $args sera non null)
args returns [ String code, int size] @init{ $code = new String(); $size = 0; }
    : ( expr
    {
        // code java pour première expression pour arg
      $code+= $expr.code;
      $size+=1;
    }
    ( ',' expr
    {
     $code+= $expr.code;
     $size+=1;
        // code java pour expression suivante pour arg
    }
    )*
      )?
    ;


// lexer
RETURN: 'return';
TYPE : 'int' | 'float' ;
COMMENTAIRES
       :  ('//')~'\n'* ->skip
       ;
COMMENTAIRESMULTILIGNE
        : '/*'.*?'*/' -> skip
        ;

IDENTIFIANT
    :   ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*

    ;
NEWLINE : '\r'? '\n' ;

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;

UNMATCH : . -> skip ;


/*
  1 comment placer les commentaires dans notre code pour le cas general
      un commentaire est soit avant une instruction ou après une instruction
  2 l'idee de la fonction des operateurs logique && || !
*/
