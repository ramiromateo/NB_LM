package Analizador;

import java_cup.runtime.Symbol;



%%

%{
    //Código de usuario
    String cadena= "";
%}

%cup
%class scanner
%public
%line
%char
%column
%full
%state CADENA
%ignorecase

//simbolos

COMA    = ","
PYCOMA  = ";"

PAR_A   = "("
PAR_C   = ")" 
LLA_A   = "{"
LLA_C   = "}" 


SUMA  = "+"
MUL  = "*"
DIV  = "/"
RES  = "-"
Tkn_Rq="Rq"
Tkn_Ptn="Ptn"

//palabras reservadas

EXTRAER     = "Extraer"

//expresiones

ENTERO  = [0-9]+(\.[0-9]+)?
ID      = [A-Za-zñÑ][_0-9A-Za-zñÑ]*

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%

<YYINITIAL> {SUMA}      { return new Symbol(sym.SUMA, yyline, yycolumn,yytext());}
<YYINITIAL> {MUL}      { return new Symbol(sym.MUL, yyline, yycolumn,yytext());}
<YYINITIAL> {DIV}      { return new Symbol(sym.DIV, yyline, yycolumn,yytext());}
<YYINITIAL> {RES}      { return new Symbol(sym.RES, yyline, yycolumn,yytext());}
<YYINITIAL> {EXTRAER}      { return new Symbol(sym.EXTRAER, yyline, yycolumn,yytext());}

<YYINITIAL> {PAR_A}     {return new Symbol(sym.PAR_A, yyline, yycolumn,yytext());}
<YYINITIAL> {PAR_C}     {return new Symbol(sym.PAR_C, yyline, yycolumn,yytext());}
<YYINITIAL> {LLA_A}     {return new Symbol(sym.LLA_A, yyline, yycolumn,yytext());}
<YYINITIAL> {LLA_C}     {return new Symbol(sym.LLA_C, yyline, yycolumn,yytext());}
<YYINITIAL> {COMA}      {return new Symbol(sym.COMA, yyline, yycolumn,yytext());}
<YYINITIAL> {PYCOMA}    {return new Symbol(sym.PYCOMA, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_Rq}      {return new Symbol(sym.Tkn_Rq, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_Ptn}    {return new Symbol(sym.Tkn_Ptn, yyline, yycolumn,yytext());}


<YYINITIAL> {ENTERO}    { return new Symbol(sym.ENTERO, yyline, yycolumn,yytext());}
<YYINITIAL> {ID}        { return new Symbol(sym.ID, yyline, yycolumn,yytext());}
<YYINITIAL> {SPACE}     { }
<YYINITIAL> {ENTER}     { }


<YYINITIAL> . {
        String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1);
        System.out.println(errLex);
}
