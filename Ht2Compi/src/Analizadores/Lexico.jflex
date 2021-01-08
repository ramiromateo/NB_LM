package Analizadores;
import java.util.LinkedList;


import java_cup.runtime.Symbol;
%%

%{
    String cadena= "";
%}

%cup
%class scannerCli
%public
%line
%char
%column
%full
%state CADENA
%ignorecase
%unicode

//simbolos y reservados
Tkn_igual="="
Tkn_coma=","
Tkn_parA="("
Tkn_parC=")"
Tkn_panel="panel"
Tkn_coA="["
Tkn_coC="]"
Tkn_dibujar="dibujar"


//expresiones
Tkn_entero= [0-9]+(\.[0-9]+)?  
Tkn_id= [A-Za-zñÑóáéíóú][_0-9A-Za-zñÑóáéíóú.@]*

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%
<YYINITIAL> {Tkn_igual}    { return new Symbol(sym.Tkn_igual, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_coma}    { return new Symbol(sym.Tkn_coma, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_parA}    { return new Symbol(sym.Tkn_parA, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_parC}    { return new Symbol(sym.Tkn_parC, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_panel}    { return new Symbol(sym.Tkn_panel, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_coA}    { return new Symbol(sym.Tkn_coA, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_coC}    { return new Symbol(sym.Tkn_coC, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_dibujar}    { return new Symbol(sym.Tkn_dibujar, yyline, yycolumn,yytext());}

<YYINITIAL> {Tkn_entero}    { return new Symbol(sym.Tkn_entero, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_id}    { return new Symbol(sym.Tkn_id, yyline, yycolumn,yytext());}
<YYINITIAL> [\"]        { yybegin(CADENA); cadena=""; }

<YYINITIAL> {SPACE}     { }
<YYINITIAL> {ENTER}     { }


<YYINITIAL> . {
        //Inicio.lisErrores.add("Error léxico : Lexema"+yytext()+", Línea: "+(yyline+1)+"Columna: "+yycolumn+" El caracter No pertenece al lenguaje\n");       
}

<CADENA> {
        [\"] { String tmp=cadena; cadena="";
               yybegin(YYINITIAL); 
               return new Symbol(sym.Tkn_cadena, yyline,yycolumn,tmp);
             }
        [\n] {String tmp=cadena; cadena="";  
               // Inicio.lisErrores.add("Error léxico : Lexema"+"Salto de linea"+", Línea: "+(yyline+1)+"Columna: "+yycolumn+" Se esperaba \" \n");       
                yybegin(YYINITIAL);
            }
        [^\"] { cadena+=yytext();}
}