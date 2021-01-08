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

      //reques de inico de sesion

Tkn_reply="reply"
Tkn_Usuario="Usuario"
Tkn_ide="id"
Tkn_registro="registro"
Tkn_menos="-"
Tkn_dolar="$"
Tkn_igual="="
Tkn_access="access"
Tkn_tienda="tienda"

Tkn_lista="lista"
Tkn_codigo="codigo"
Tkn_propietario="propietario"
Tkn_nombre="nombre"
Tkn_direccion="direccion"
Tkn_telefono="telefono"
Tkn_modificar="modificar"
Tkn_eliminar="eliminar"
Tkn_producto="producto"
Tkn_sucursal="sucursal"
Tkn_precio="precio"

Tkn_cantidad="cantidad"
Tkn_marca="marca"
Tkn_tamaño="tamaño"
Tkn_color="color"
      //reques de inico de sesion



//expresiones
Tkn_entero= [0-9]+(\.[0-9]+)?  
Tkn_id= [A-Za-zñÑóáéíóú][_0-9A-Za-zñÑóáéíóú.@]*

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%
<YYINITIAL> {Tkn_reply}           { return new Symbol(sym.Tkn_reply, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_Usuario}         { return new Symbol(sym.Tkn_Usuario, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_registro}        { return new Symbol(sym.Tkn_registro, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_igual}           { return new Symbol(sym.Tkn_igual, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_dolar}           { return new Symbol(sym.Tkn_dolar, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_ide}             { return new Symbol(sym.Tkn_ide, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_menos}           { return new Symbol(sym.Tkn_menos, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_access}          { return new Symbol(sym.Tkn_access, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_tienda}          { return new Symbol(sym.Tkn_tienda, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_lista}           { return new Symbol(sym.Tkn_lista, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_codigo}          { return new Symbol(sym.Tkn_codigo, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_propietario}     { return new Symbol(sym.Tkn_propietario, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_nombre}          { return new Symbol(sym.Tkn_nombre, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_direccion}       { return new Symbol(sym.Tkn_direccion, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_telefono}        { return new Symbol(sym.Tkn_telefono, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_modificar}       { return new Symbol(sym.Tkn_modificar, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_eliminar}       { return new Symbol(sym.Tkn_eliminar, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_producto}       { return new Symbol(sym.Tkn_producto, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_sucursal}       { return new Symbol(sym.Tkn_sucursal, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_cantidad}        { return new Symbol(sym.Tkn_cantidad, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_marca}           { return new Symbol(sym.Tkn_marca, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_tamaño}           { return new Symbol(sym.Tkn_tamaño, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_color}        { return new Symbol(sym.Tkn_color, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_precio}        { return new Symbol(sym.Tkn_precio, yyline, yycolumn,yytext());}

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