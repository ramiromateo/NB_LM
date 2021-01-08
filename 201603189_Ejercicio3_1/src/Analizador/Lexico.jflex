package Analizador;
import java.util.LinkedList;


import java_cup.runtime.Symbol;
%%


%cup
%class scanner
%public
%line
%char
%column
%full

%ignorecase
%unicode

%init{ 
    yyline = 1; 
    yychar = 1; 
%init} 
 
BLANCOS=[ \r\t]+

D=[0-9]+
Tkn_Coma=","
Tkn_CorA="["
Tkn_CorC="]"



%%




\n {yychar=1;}

{BLANCOS} {} 

{Tkn_Coma} {return new Symbol(sym.Tkn_Coma,yyline,yychar, yytext());} 
{Tkn_CorA} {return new Symbol(sym.Tkn_CorA,yyline,yychar, yytext());} 
{Tkn_CorC} {return new Symbol(sym.Tkn_CorC,yyline,yychar, yytext());} 
{D} {return new Symbol(sym.ENTERO,yyline,yychar, yytext());} 




<YYINITIAL> . {
       System.out.println("Error léxico : Lexema"+yytext()+", Línea: "+(yyline+1)+"Columna: "+yycolumn+" El caracter No pertenece al lenguaje\n");       
}

