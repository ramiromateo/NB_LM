package Analizadores;
import java.util.LinkedList;
import Objetos.*;
import compi1.pro_1servidor.*;


import java_cup.runtime.Symbol;
%%

%{
    String cadena= "";
%}

%cup
%class scannerSer
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
Tkn_nombre="nombre"
Tkn_telefono="telefono"
Tkn_request="request"
Tkn_crearUsuario="CrearUsuario"
Tkn_inicioUsuario="InicioUsuario"
Tkn_ide="id"
Tkn_apellido="apellido"
Tkn_password="password"
Tkn_email="email"
Tkn_direccion="direccion"
Tkn_menos="-"
Tkn_dolar="$"
Tkn_tienda="tienda"
Tkn_tipo="tipo"
Tkn_codigo="codigo"
Tkn_propietario="propietario"
Tkn_img="img"
Tkn_igual="="
Tkn_get="get"
Tkn_coma=","
Tkn_producto="producto"
Tkn_cantidad="cantidad"
Tkn_marca="marca"
Tkn_tamaño="tamaño"
Tkn_sucursal="sucursal"
Tkn_precio="precio"
Tkn_color="color"
Tkn_parA="("
Tkn_parC=")"
Tkn_llaA="{"
Tkn_llaC="}"
Tkn_mas="+"
Tkn_por="*"
Tkn_div="/"
Tkn_Rq="Rq"
Tkn_Ptn="Ptn"
Tkn_query="query"
Tkn_extraer="extraer"
Tkn_de="de"
Tkn_donde="donde"
Tkn_puntocoma=";"

      //reques de inico de sesion



//expresiones
Tkn_entero= [0-9]+(\.[0-9]+)?  
Tkn_id= [A-Za-zñÑóáéíóú][_0-9A-Za-zñÑóáéíóú.@]*

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%

<YYINITIAL> {Tkn_inicioUsuario}   { return new Symbol(sym.Tkn_inicioUsuario, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_nombre}          { return new Symbol(sym.Tkn_nombre, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_telefono}        { return new Symbol(sym.Tkn_telefono, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_dolar}           { return new Symbol(sym.Tkn_dolar, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_request}         { return new Symbol(sym.Tkn_request, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_crearUsuario}    { return new Symbol(sym.Tkn_crearUsuario, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_ide}             { return new Symbol(sym.Tkn_ide, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_menos}           { return new Symbol(sym.Tkn_menos, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_apellido}        { return new Symbol(sym.Tkn_apellido, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_password}        { return new Symbol(sym.Tkn_password, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_email}           { return new Symbol(sym.Tkn_email, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_direccion}       { return new Symbol(sym.Tkn_direccion, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_tienda}          { return new Symbol(sym.Tkn_tienda, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_tipo}            { return new Symbol(sym.Tkn_tipo, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_codigo}          { return new Symbol(sym.Tkn_codigo, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_propietario}     { return new Symbol(sym.Tkn_propietario, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_img}             { return new Symbol(sym.Tkn_img, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_igual}           { return new Symbol(sym.Tkn_igual, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_get}             { return new Symbol(sym.Tkn_get, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_coma}            { return new Symbol(sym.Tkn_coma, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_producto}        { return new Symbol(sym.Tkn_producto, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_cantidad}        { return new Symbol(sym.Tkn_cantidad, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_marca}           { return new Symbol(sym.Tkn_marca, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_tamaño}          { return new Symbol(sym.Tkn_tamaño, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_sucursal}        { return new Symbol(sym.Tkn_sucursal, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_color}           { return new Symbol(sym.Tkn_color, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_precio}           { return new Symbol(sym.Tkn_precio, yyline, yycolumn,yytext());}

<YYINITIAL> {Tkn_parA}        { return new Symbol(sym.Tkn_parA, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_parC}        { return new Symbol(sym.Tkn_parC, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_llaA}        { return new Symbol(sym.Tkn_llaA, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_llaC}        { return new Symbol(sym.Tkn_llaC, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_mas}        { return new Symbol(sym.Tkn_mas, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_por}        { return new Symbol(sym.Tkn_por, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_div}        { return new Symbol(sym.Tkn_div, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_Rq}        { return new Symbol(sym.Tkn_Rq, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_Ptn}        { return new Symbol(sym.Tkn_Ptn, yyline, yycolumn,yytext());}

<YYINITIAL> {Tkn_query}        { return new Symbol(sym.Tkn_query, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_extraer}        { return new Symbol(sym.Tkn_extraer, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_de}        { return new Symbol(sym.Tkn_de, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_donde}        { return new Symbol(sym.Tkn_donde, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_puntocoma}        { return new Symbol(sym.Tkn_puntocoma, yyline, yycolumn,yytext());}


<YYINITIAL> {Tkn_entero}    { return new Symbol(sym.Tkn_entero, yyline, yycolumn,yytext());}
<YYINITIAL> {Tkn_id}    { return new Symbol(sym.Tkn_id, yyline, yycolumn,yytext());}
<YYINITIAL> [\"]        { yybegin(CADENA); cadena=""; }

<YYINITIAL> {SPACE}     { }
<YYINITIAL> {ENTER}     { }


<YYINITIAL> . {
        //Inicio.lisErrores.add("Error léxico : Lexema"+yytext()+", Línea: "+(yyline+1)+"Columna: "+yycolumn+" El caracter No pertenece al lenguaje\n");       
        ConsoleServer.error.add(new ErrorLexico("Error léxico",""+(yyline+1),""+yycolumn,""+yytext()," El caracter No pertenece al lenguaje\n"));
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