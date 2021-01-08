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
Tkn_mas="+"
Tkn_asterisco="*"
Tkn_menos="-"
Tkn_div ="/"
Tkn_And="&&"
Tkn_Or="||"
Tkn_menor="<"
Tkn_mayor=">"
Tkn_igualigual="=="
Tkn_diferente="!="
Tkn_PuntoComa=";"

Tkn_si="si"
Tkn_llaA="{"
Tkn_llaC="}"

Tkn_enteroR="entero"
Tkn_Boleano="booleano"
Tkn_Cad="cadena"

Tkn_dibujar="dibujar"


//expresiones
Tkn_entero= [0-9]+(\.[0-9]+)?  
Tkn_id= [A-Za-zñÑóáéíóú][_0-9A-Za-zñÑóáéíóú.@]*

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%
<YYINITIAL> {Tkn_enteroR}    { return new Symbol(sym.Tkn_enteroR, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_Boleano}    { return new Symbol(sym.Tkn_Boleano, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_Cad}    { return new Symbol(sym.Tkn_Cad, yyline, yycolumn,yytext());}

<YYINITIAL> {Tkn_llaC}    { return new Symbol(sym.Tkn_llaC, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_llaA}    { return new Symbol(sym.Tkn_llaA, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_si}    { return new Symbol(sym.Tkn_si, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_mas}    { return new Symbol(sym.Tkn_mas, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_asterisco}    { return new Symbol(sym.Tkn_asterisco, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_menos}    { return new Symbol(sym.Tkn_menos, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_div}    { return new Symbol(sym.Tkn_div, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_And}    { return new Symbol(sym.Tkn_And, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_Or}    { return new Symbol(sym.Tkn_Or, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_menor}    { return new Symbol(sym.Tkn_menor, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_mayor}    { return new Symbol(sym.Tkn_mayor, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_diferente}    { return new Symbol(sym.Tkn_diferente, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_PuntoComa}    { return new Symbol(sym.Tkn_PuntoComa, yyline, yycolumn,yytext());}

<YYINITIAL> {Tkn_igualigual}    { return new Symbol(sym.Tkn_igualigual, yyline, yycolumn,yytext());}
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
               System.out.println("Error léxico : Lexema"+"Salto de linea"+", Línea: "+(yyline+1)+"Columna: "+yycolumn+" Se esperaba \" \n");       
                yybegin(YYINITIAL);
            }
        [^\"] { cadena+=yytext();}
}