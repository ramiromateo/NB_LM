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
DD=[0-9]+("."[  |0-9]+)?
ID=[A-Za-z]+["_"0-9A-Za-z]*


%%


"Imprimir" {return new Symbol(sym.RIMPRIMIR,yyline,yychar, yytext());} 
"int" {return new Symbol(sym.RInt,yyline,yychar, yytext());} 
"double" {return new Symbol(sym.RDouble,yyline,yychar, yytext());} 

";" {return new Symbol(sym.PTCOMA,yyline,yychar, yytext());} 
"(" {return new Symbol(sym.PARIZQ,yyline,yychar, yytext());} 
")" {return new Symbol(sym.PARDER,yyline,yychar, yytext());} 
"+" {return new Symbol(sym.MAS,yyline,yychar, yytext());} 
"-" {return new Symbol(sym.MENOS,yyline,yychar, yytext());} 
"*" {return new Symbol(sym.POR,yyline,yychar, yytext());} 
"/" {return new Symbol(sym.DIVIDIDO,yyline,yychar, yytext());} 

"!" {return new Symbol(sym.DIFERENTE,yyline,yychar, yytext());} 
"&&" {return new Symbol(sym.YLOGICO,yyline,yychar, yytext());} 
"||" {return new Symbol(sym.OLOGICO,yyline,yychar, yytext());} 
"<" {return new Symbol(sym.MENQUE,yyline,yychar, yytext());} 
">" {return new Symbol(sym.MAYQUE,yyline,yychar, yytext());} 
"=" {return new Symbol(sym.IGUAL,yyline,yychar, yytext());} 

\n {yychar=1;}

{BLANCOS} {} 
{ID} {return new Symbol(sym.IDENTIFICADOR,yyline,yychar, yytext());} 
{D} {return new Symbol(sym.ENTERO,yyline,yychar, yytext());} 
{DD} {return new Symbol(sym.DECIMAL,yyline,yychar, yytext());}



<YYINITIAL> . {
       System.out.println("Error léxico : Lexema"+yytext()+", Línea: "+(yyline+1)+"Columna: "+yycolumn+" El caracter No pertenece al lenguaje\n");       
}

