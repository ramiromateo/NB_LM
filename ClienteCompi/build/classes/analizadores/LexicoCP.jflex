package analizadores;


%%
%{	

    String text = "";

%}

%public 
%class LexicoCP
%cupsym SimbolosCP
%cup
%char
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
car = "\'" [^\'] "\'"

%state ANOTHERSTATE

%%

<YYINITIAL> {

	"$$"				{ return new Symbol(SimbolosCP.inicio, yycolumn, yyline, yytext()); yybegin(ANOTHERSTATE);}
	"<"					{  }
	">"					{  }
	"/"					{  }
	"="					{  }
	"html"				{  }
	"head"				{  }
	"body"				{  }
	"title"				{  }
	"table"				{  }
	"th"				{  }
	"td"				{  }
	"tr"				{  }
	"div"				{  }
	"p"					{  }
	"br"				{  }
	"hr"				{  }
	"h1"				{  }
	"h2"				{  }
	"h3"				{  }
	"color" 			{  }
	"textcolor"			{  }
	"align"				{  }
	"font"				{  }
	"\"rojo\""			{  }
	"\"amarillo\"" 		{  }
	"\"azul\""			{  }
	"\"verde\""			{  }
	"\"gris\""			{  }
	"\"anaranjado\"" 	{  }
	"\"morado\"" 		{  }
	"\"izquierda\"" 	{  }
	"\"derecha\""		{  }
	"\"centrado\""		{  }
	//ER
	{cadena}			{  }
	{texto}				{  }
	//ESPACIOS EN BLANCO
	[ \t\r\n\f]             {  }

	//ERRORES
	.                       {  }
}
 

<ANOTHERSTATE> {

	"$$"			{ return new Symbol(SimbolosCP.ultimo, yycolumn, yyline, yytext()); yybegin(YYINITIAL);}
	"result"		{ return new Symbol(SimbolosCP.result, yycolumn, yyline, yytext());}
	"score"			{ return new Symbol(SimbolosCP.Score, yycolumn, yyline, yytext());}
	"clases"		{ return new Symbol(SimbolosCP.clases, yycolumn, yyline, yytext());}
	"variables"		{ return new Symbol(SimbolosCP.variables, yycolumn, yyline, yytext());}
	"metodos"		{ return new Symbol(SimbolosCP.metodos, yycolumn, yyline, yytext());}
	"comentarios"	{ return new Symbol(SimbolosCP.comentarios, yycolumn, yyline, yytext());}
	"nombre"		{ return new Symbol(SimbolosCP.nombre, yycolumn, yyline, yytext());}
	"tipo"			{ return new Symbol(SimbolosCP.tipo, yycolumn, yyline, yytext());}
	"funcion"		{ return new Symbol(SimbolosCP.funcion, yycolumn, yyline, yytext());}
	"clase"			{ return new Symbol(SimbolosCP.clase, yycolumn, yyline, yytext());}
	"parametros"	{ return new Symbol(SimbolosCP.parametros, yycolumn, yyline, yytext());}
	"texto"			{ return new Symbol(SimbolosCP.texto, yycolumn, yyline, yytext());}
	"int"			{ return new Symbol(SimbolosCP.entero, yycolumn, yyline, yytext());}
	"char"			{ return new Symbol(SimbolosCP.caracter, yycolumn, yyline, yytext());}
	"double"		{ return new Symbol(SimbolosCP.doble, yycolumn, yyline, yytext());}
	"string"		{ return new Symbol(SimbolosCP.cadena, yycolumn, yyline, yytext());}
	"boolean"		{ return new Symbol(SimbolosCP.bool, yycolumn, yyline, yytext());}
	"++"			{ return new Symbol(SimbolosCP.aumento, yycolumn, yyline, yytext());}
	"--"			{ return new Symbol(SimbolosCP.menguar yycolumn, yyline, yytext());}
	"+"				{ return new Symbol(SimbolosCP.mas, yycolumn, yyline, yytext());}
	"-"				{ return new Symbol(SimbolosCP.menos, yycolumn, yyline, yytext());}
	"/"				{ return new Symbol(SimbolosCP.div, yycolumn, yyline, yytext());}
	"*"				{ return new Symbol(SimbolosCP.por, yycolumn, yyline, yytext());}
	"%"				{ return new Symbol(SimbolosCP.modulo, yycolumn, yyline, yytext());}
	"("				{ return new Symbol(SimbolosCP.abrepar, yycolumn, yyline, yytext());}
	")"				{ return new Symbol(SimbolosCP.cierrpar, yycolumn, yyline, yytext());}
	"["				{ return new Symbol(SimbolosCP.abrecor, yycolumn, yyline, yytext());}
	"]"				{ return new Symbol(SimbolosCP.cierracor, yycolumn, yyline, yytext());}
	"<"				{ return new Symbol(SimbolosCP.menor, yycolumn, yyline, yytext());}
	">"				{ return new Symbol(SimbolosCP.mayor, yycolumn, yyline, yytext());}
	"<="			{ return new Symbol(SimbolosCP.menorigual, yycolumn, yyline, yytext());}
	">="			{ return new Symbol(SimbolosCP.mayorigual, yycolumn, yyline, yytext());}
	"=="			{ return new Symbol(SimbolosCP.comparar, yycolumn, yyline, yytext());}
	"!="			{ return new Symbol(SimbolosCP.noes, yycolumn, yyline, yytext());}
	"="				{ return new Symbol(SimbolosCP.igual, yycolumn, yyline, yytext());}
	"+="			{ return new Symbol(SimbolosCP.igualmas, yycolumn, yyline, yytext());}
	"-="			{ return new Symbol(SimbolosCP.igualmenos, yycolumn, yyline, yytext());}
	"*="			{ return new Symbol(SimbolosCP.igualpor, yycolumn, yyline, yytext());}
	"print"			{ return new Symbol(SimbolosCP.print, yycolumn, yyline, yytext());}
	"&&"			{ return new Symbol(SimbolosCP.and, yycolumn, yyline, yytext());}
	"||"			{ return new Symbol(SimbolosCP.or, yycolumn, yyline, yytext());}
	"!"				{ return new Symbol(SimbolosCP.not, yycolumn, yyline, yytext());}
	"."				{ return new Symbol(SimbolosCP.punto, yycolumn, yyline, yytext());}
	";"				{ return new Symbol(SimbolosCP.puntocoma, yycolumn, yyline, yytext());}
	//ER
	{identificador}	{ return new Symbol(SimbolosCP.id, yycolumn, yyline, yytext());}
	{num}			{ return new Symbol(SimbolosCP.num, yycolumn, yyline, yytext());}
	{numdecimal}	{ return new Symbol(SimbolosCP.numdecimal, yycolumn, yyline, yytext());}
	{cadena}		{ return new Symbol(SimbolosCP.strng, yycolumn, yyline, yytext());}
	{car}			{ return new Symbol(SimbolosCP.car, yycolumn, yyline, yytext());}
	{commulti}		{ }
	{comlinea}		{ }


	//ESPACIOS EN BLANCO
	[ \t\r\n\f]             {/* Espacios en blanco, se ignoran */}

	//ERRORES
	.                       { System.out.println("Error: " + yytext()); }
}