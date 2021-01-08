package analizadores;

import java_cup.runtime.Symbol;


%%
%{	
    public String text = "";
    int contador = 0;

%}

%public 
%class LexicoHTML
%char
%cupsym SimbolosHTML
%cup
%column
%full
%line
%ignorecase
%unicode
	

identificador = (_|[a-zA-Z])([a-zA-Z]|[0-9]|_)*
num = [0-9]+
numdecimal = [0-9]+(\.[0-9]+)
cadena = \"([^\"])*\"
commulti = "</" [^(\/>)]* "/>"
comlinea = "->" [^\n]* (\n)
texto = ([a-zA-Z0-9] | ":" | "." | ";" | ",")+


%state ANOTHERSTATE

%%

<YYINITIAL> {

	"$$"		{ text += "break_"; yybegin(ANOTHERSTATE);}
	"</html>"			{ text += yytext(); return new Symbol(SimbolosHTML.finhtml, yycolumn, yyline, yytext()); }
	"</head>"			{ text += yytext(); return new Symbol(SimbolosHTML.finhead, yycolumn, yyline, yytext()); }
	"</body>"			{ text += yytext(); return new Symbol(SimbolosHTML.finbody, yycolumn, yyline, yytext()); }
	"</title>"			{ text += yytext(); return new Symbol(SimbolosHTML.fintitle, yycolumn, yyline, yytext()); }
	"</div>"			{ text += yytext(); return new Symbol(SimbolosHTML.findiv, yycolumn, yyline, yytext()); }
	"</p>"				{ text += yytext(); return new Symbol(SimbolosHTML.finp, yycolumn, yyline, yytext()); }
	"</h1>"				{ text += yytext(); return new Symbol(SimbolosHTML.finh1, yycolumn, yyline, yytext()); }
	"</h2>"				{ text += yytext(); return new Symbol(SimbolosHTML.finh2, yycolumn, yyline, yytext()); }
	"</h3>"				{ text += yytext(); return new Symbol(SimbolosHTML.finh3, yycolumn, yyline, yytext()); }
	"</table>"			{ text += yytext(); return new Symbol(SimbolosHTML.fintable, yycolumn, yyline, yytext()); }
	"</tr>"				{ text += yytext(); return new Symbol(SimbolosHTML.fintr, yycolumn, yyline, yytext()); }
	"</th>"				{ text += yytext(); return new Symbol(SimbolosHTML.finth, yycolumn, yyline, yytext()); }
	"</td>"				{ text += yytext(); return new Symbol(SimbolosHTML.fintd, yycolumn, yyline, yytext()); }
	"<"			{ text += yytext();  return new Symbol(SimbolosHTML.abre, yycolumn, yyline, yytext());}
	">"			{ text += yytext();  return new Symbol(SimbolosHTML.cierra, yycolumn, yyline, yytext());}
	"="			{ text += yytext();  return new Symbol(SimbolosHTML.igual, yycolumn, yyline, yytext());}
	"html"		{ text += yytext();  return new Symbol(SimbolosHTML.html, yycolumn, yyline, yytext());}
	"head"		{ text += yytext();  return new Symbol(SimbolosHTML.head, yycolumn, yyline, yytext());}
	"body"		{ text += yytext();  return new Symbol(SimbolosHTML.body, yycolumn, yyline, yytext());}
	"title"		{ text += yytext();  return new Symbol(SimbolosHTML.title, yycolumn, yyline, yytext());}
	"table"		{ text += yytext();  return new Symbol(SimbolosHTML.table, yycolumn, yyline, yytext());}
	"th"		{ text += yytext();  return new Symbol(SimbolosHTML.th, yycolumn, yyline, yytext());}
	"td"		{ text += yytext();  return new Symbol(SimbolosHTML.td, yycolumn, yyline, yytext());}
	"tr"		{ text += yytext();  return new Symbol(SimbolosHTML.tr, yycolumn, yyline, yytext());}
	"div"		{ text += yytext();  return new Symbol(SimbolosHTML.div, yycolumn, yyline, yytext());}
	"p"			{ text += yytext();  return new Symbol(SimbolosHTML.p, yycolumn, yyline, yytext());}
	"br"		{ text += yytext();  return new Symbol(SimbolosHTML.br, yycolumn, yyline, yytext());}
	"hr"		{ text += yytext();  return new Symbol(SimbolosHTML.hr, yycolumn, yyline, yytext());}
	"h1"		{ text += yytext();  return new Symbol(SimbolosHTML.h1, yycolumn, yyline, yytext());}
	"h2"		{ text += yytext();  return new Symbol(SimbolosHTML.h2, yycolumn, yyline, yytext());}
	"h3"		{ text += yytext();  return new Symbol(SimbolosHTML.h3, yycolumn, yyline, yytext());}
	"color" 	{ text += yytext();  return new Symbol(SimbolosHTML.atributo, yycolumn, yyline, yytext());}
	"textcolor"	{ text += yytext();  return new Symbol(SimbolosHTML.atributo, yycolumn, yyline, yytext());}
	"align"		{ text += yytext();  return new Symbol(SimbolosHTML.atributo, yycolumn, yyline, yytext());}
	"font"		{ text += yytext();  return new Symbol(SimbolosHTML.atributo, yycolumn, yyline, yytext());}
	"\"rojo\""	{ text += "\"red\""; return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext());}
	"\"amarillo\"" 		{ text += "\"yellow\""; return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext()); }
	"\"azul\""			{ text += "\"blue\""; return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext()); }
	"\"verde\""			{ text += "\"green\""; return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext());}
	"\"gris\""			{ text += "\"gray\""; return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext()); }
	"\"anaranjado\"" 	{ text += "\"orange\""; return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext()); }
	"\"morado\"" 		{ text += "\"purple\""; return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext()); }
	"\"izquierda\"" 	{ text += "\"left\"";  return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext());}
	"\"derecha\""		{ text += "\"right\""; return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext()); }
	"\"centrado\""		{ text += "\"center\""; return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext()); }
	//ER
	{cadena}	{ text += yytext();  return new Symbol(SimbolosHTML.valor, yycolumn, yyline, yytext());}
	{texto}		{ text += yytext();}
	//ESPACIOS EN BLANCO
	[ \t\r\n\f]             { text += yytext();}

	//ERRORES
	.                       { System.out.println("Error: " + yytext()); }
}
 

<ANOTHERSTATE> {

	"$$"			{ text += "point" + contador; contador++; yybegin(YYINITIAL);}
	"result"		{ }
	"score"			{ }
	"clases"		{ }
	"variables"		{ }
	"metodos"		{ }
	"comentarios"	{ }
	"nombre"		{ }
	"tipo"			{ }
	"funcion"		{ }
	"clase"			{ }
	"parametros"	{ }
	"texto"			{ }
	"int"			{ }
	"char"			{ }
	"double"		{ }
	"string"		{ }
	"boolean"		{ }
	"+"				{ }
	"-"				{ }
	"/"				{ }
	"*"				{ }
	"%"				{ }
	"("				{ }
	")"				{ }
	"["				{ }
	"]"				{ }
	"<"				{ }
	">"				{ }
	"<="			{ }
	">="			{ }
	"=="			{ }
	"!="			{ }
	"++"			{ }
	"--"			{ }
	"="				{ }
	"+="			{ }
	"-="			{ }
	"*="			{ }
	"print"			{ }
	"&&"			{ }
	"||"			{ }
	"!"				{ }
	"."				{ }
	";"				{ }
	//ER
	{identificador}	{ }
	{num}			{ }
	{numdecimal}	{ }
	{cadena}		{ }
	{commulti}		{ }
	{comlinea}		{ }


	//ESPACIOS EN BLANCO
	[ \t\r\n\f]             { }

	//ERRORES
	.                       { }
}