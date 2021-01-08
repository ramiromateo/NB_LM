package Analizador;
import java.util.LinkedList;
import c1.practica1.Inicio;

import java_cup.runtime.Symbol;
%%

%{
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
%unicode

//simbolos y reservados

ENCAB  = "Encabezado" 
CUERP    = "Cuerpo"
ESTUD  = "Estudiante"
POND   = "Ponderacion"
REPOR   = "Reportes"
ESTIL   = "Estilo"
ETI_A   = "<"
ETI_C   = ">"
DIAG    = "/"
IGUAL  = "="
DOSP  = ":"
COMA  = ","
PORCE  = "%"
SI = "Superior-Izq"
SD = "Superior-Der"
CI = "Centro-Izq"
CD = "Centro-Der"
II = "Inferior-Izq"
IDE = "Inferior-Der"
CT = "Color-T"
CV = "Color-V"
CN = "Color-N" 
CNA = "Color-NA"
CNR = "Color-NR"
FINA = FINAL|EF

//expresiones
TAREA = Tarea_[0-9]+
HT = HT_[0-9]+
EC = EC_[0-9]+
PRA = PRA_[0-9]+
PRO = PRO_[0-9]+

ENTERO  = [0-9]+   
ID      = [A-Za-zñÑóáéíóú][_0-9A-Za-zñÑóáéíóú]*

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%
<YYINITIAL> {FINA}      { return new Symbol(sym.FINA, yyline, yycolumn,yytext());}
<YYINITIAL> {TAREA}      { return new Symbol(sym.TAREA, yyline, yycolumn,yytext());}
<YYINITIAL> {HT}      { return new Symbol(sym.HT, yyline, yycolumn,yytext());}
<YYINITIAL> {EC}      { return new Symbol(sym.EC, yyline, yycolumn,yytext());}
<YYINITIAL> {PRA}      { return new Symbol(sym.PRA, yyline, yycolumn,yytext());}
<YYINITIAL> {PRO}      { return new Symbol(sym.PRO, yyline, yycolumn,yytext());}

<YYINITIAL> {ENCAB}      { return new Symbol(sym.ENCAB, yyline, yycolumn,yytext());}
<YYINITIAL> {CUERP}     { return new Symbol(sym.CUERP, yyline, yycolumn,yytext());}
<YYINITIAL> {ESTUD}       { return new Symbol(sym.ESTUD, yyline, yycolumn,yytext());}
<YYINITIAL> {POND}       { return new Symbol(sym.POND, yyline, yycolumn,yytext());}
<YYINITIAL> {REPOR}       { return new Symbol(sym.REPOR, yyline, yycolumn,yytext());}
<YYINITIAL> {ESTIL}     { return new Symbol(sym.ESTIL, yyline, yycolumn,yytext());}


<YYINITIAL> {ETI_A}     { return new Symbol(sym.ETI_A, yyline, yycolumn,yytext());}
<YYINITIAL> {ETI_C}     { return new Symbol(sym.ETI_C, yyline, yycolumn,yytext());}
<YYINITIAL> {DIAG}    { return new Symbol(sym.DIAG, yyline, yycolumn,yytext());}
<YYINITIAL> {IGUAL}    { return new Symbol(sym.IGUAL, yyline, yycolumn,yytext());}
<YYINITIAL> {DOSP}      { return new Symbol(sym.DOSP, yyline, yycolumn,yytext());}
<YYINITIAL> {COMA}    { return new Symbol(sym.COMA, yyline, yycolumn,yytext());}
<YYINITIAL> {PORCE}    { return new Symbol(sym.PORCE, yyline, yycolumn,yytext());}

<YYINITIAL> {SI}    { return new Symbol(sym.SI, yyline, yycolumn,yytext());}
<YYINITIAL> {SD}    { return new Symbol(sym.SD, yyline, yycolumn,yytext());}
<YYINITIAL> {CI}    { return new Symbol(sym.CI, yyline, yycolumn,yytext());}
<YYINITIAL> {CD}    { return new Symbol(sym.CD, yyline, yycolumn,yytext());}
<YYINITIAL> {II}    { return new Symbol(sym.II, yyline, yycolumn,yytext());}
<YYINITIAL> {IDE}    { return new Symbol(sym.IDE, yyline, yycolumn,yytext());}
<YYINITIAL> {CT}    { return new Symbol(sym.CT, yyline, yycolumn,yytext());}
<YYINITIAL> {CV}    { return new Symbol(sym.CV, yyline, yycolumn,yytext());}
<YYINITIAL> {CN}    { return new Symbol(sym.CN, yyline, yycolumn,yytext());}
<YYINITIAL> {CNA}    { return new Symbol(sym.CNA, yyline, yycolumn,yytext());}
<YYINITIAL> {CNR}    { return new Symbol(sym.CNR, yyline, yycolumn,yytext());}

<YYINITIAL> {ENTERO}    { return new Symbol(sym.ENTERO, yyline, yycolumn,yytext());}
<YYINITIAL> {ID}    { return new Symbol(sym.ID, yyline, yycolumn,yytext());}
<YYINITIAL> [\"]        { yybegin(CADENA); cadena=""; }
<YYINITIAL> {SPACE}     {  }
<YYINITIAL> {ENTER}     { }


<YYINITIAL> . {
        Inicio.lisErrores.add("Error léxico : Lexema"+yytext()+", Línea: "+(yyline+1)+"Columna: "+yycolumn+" El caracter No pertenece al lenguaje\n");       
}

<CADENA> {
        [\"] { String tmp=cadena; cadena="";
               yybegin(YYINITIAL); 
               return new Symbol(sym.CADENA, yyline,yycolumn,tmp);
             }
        [\n] {String tmp=cadena; cadena="";  
                Inicio.lisErrores.add("Error léxico : Lexema"+"Salto de linea"+", Línea: "+(yyline+1)+"Columna: "+yycolumn+" Se esperaba \" \n");       
                yybegin(YYINITIAL);
            }
        [^\"] { cadena+=yytext();}
}