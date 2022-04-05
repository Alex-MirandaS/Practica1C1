package JFLEX_Y_CUP;
import java_cup.runtime.*;
%%

/*segunda seccion: configuracion*/
%class AnalizadorLexicoJava
%unicode
%line
%column
%cup
%public

//Palabras Reservadas
IMPORT = ("import")
PRIVATE = ("private")
PUBLIC = ("public")
PROTECTED = ("protected")
FINAL = ("final")
CLASE = ("class")
THIS = ("this")
NEW = ("new")

//Palabra Reservadas DE VALORES PRIMITIVOS
INT = ("int")
BOOLEAN = ("boolean")
STRING = ("String")
CARACTER = ("char")
DECIMAL = ("double")
OBJETOS = ("Object")

//SENTENCIAS DE CONTROL
IF = ("if")
IFEL = ("if else")
EL = ("else")
FOR = ("for")
WHI = ("while")
DO = ("do")
SWI = ("switch")
BRE = ("break")
RET = ("return")
CASE = ("case")
DEF = ("default")

//Simbolos
PUNTO = "."
COMA = ","
PUNTOYCOMA = ";"
DOSPUNTOS = ":"
IGUAL = "="
MAS = "+"
MENOS = "-"
POR = "*"
DIVIDIDO = "/"
PABIERTO = "("
PCERRADO = ")"
LLABIERTO = "{"
LLCERRADO = "}"
COMILLA = "\""
GBAJO = "_"
CABIERTO = "“"
CCERRADO = "”"
ESPACIO = " "
SIMBOLOS = ({PUNTO}|{COMA}|{PUNTOYCOMA}|{DOSPUNTOS}|{IGUAL}|{MAS}|{MENOS}|{POR}|{DIVIDIDO}|{PABIERTO}|{PCERRADO}|{LLABIERTO}|{LLCERRADO}|{GBAJO}|{CABIERTO}|{CCERRADO}|{ESPACIO})

//OPERADORES
MENOR = "<"
MAYOR = ">"
IGUALDAD = "=="
DESIGUALDAD = "!="
MEI = "<="
MAI = ">="
Y = "&&"
O = "||"
NEGAR = "!"

//VALORES PRIMITIVOS 
ENT = [0-9]+
L = [a-zA-Z]+
DEC = {ENT}{PUNTO}{ENT}
CHAR = [a-zA-Z]
BOL = ("false"|"true")
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

STEX =  (({COMILLA}({L}|{ENT}|{GBAJO}|{SIMBOLOS})*{COMILLA})|(({CABIERTO}|{CCERRADO})({L}|{ENT}|{GBAJO}|{SIMBOLOS})*({CABIERTO}|{CCERRADO})))
TEXTO = {L}({L}|{ENT}|{GBAJO})*
COMENT = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent = ( [^*] | \*+ [^/*] )*

%{
//codigo java
%}
%eof{
%eof}
%%

/*tercer seccion: reglase lexicas*/
/*{ENTERO}      { return new Symbol(sym.ENTERO, yyline + 1, yycolumn + 1, new Integer(yytext()));}
*/

//Palabras Reservadas
{IMPORT}        { return new Symbol(sym.IMPORT, yyline + 1, yycolumn + 1, yytext());} 
{PRIVATE}       { return new Symbol(sym.PRIVATE, yyline + 1, yycolumn + 1, yytext());} 
{PUBLIC}        { return new Symbol(sym.PUBLIC, yyline + 1, yycolumn + 1, yytext());} 
{PROTECTED}     { return new Symbol(sym.PROTECTED, yyline + 1, yycolumn + 1, yytext());}
{FINAL}         { return new Symbol(sym.FINAL, yyline + 1, yycolumn + 1, yytext());}
{CLASE}         { return new Symbol(sym.CLASE, yyline + 1, yycolumn + 1, yytext());}
{THIS}          { return new Symbol(sym.THIS, yyline + 1, yycolumn + 1, yytext());}
{NEW}           { return new Symbol(sym.NEW, yyline + 1, yycolumn + 1, yytext());}
{INT}           { return new Symbol(sym.INT, yyline + 1, yycolumn + 1, yytext());}
{BOOLEAN}       { return new Symbol(sym.BOOLEAN, yyline + 1, yycolumn + 1, yytext());}
{STRING}        { return new Symbol(sym.STRING, yyline + 1, yycolumn + 1, yytext());}
{CARACTER}      { return new Symbol(sym.CARACTER, yyline + 1, yycolumn + 1, yytext());}
{DECIMAL}       { return new Symbol(sym.DECIMAL, yyline + 1, yycolumn + 1, yytext());}
{OBJETOS}       { return new Symbol(sym.OBJETOS, yyline + 1, yycolumn + 1, yytext());}
{IF}            { return new Symbol(sym.IF, yyline + 1, yycolumn + 1, yytext());}
{IFEL}          { return new Symbol(sym.IFEL, yyline + 1, yycolumn + 1, yytext());}
{EL}            { return new Symbol(sym.EL, yyline + 1, yycolumn + 1, yytext());}
{FOR}           { return new Symbol(sym.FOR, yyline + 1, yycolumn + 1, yytext());}
{WHI}           { return new Symbol(sym.WHI, yyline + 1, yycolumn + 1, yytext());}
{DO}            { return new Symbol(sym.DO, yyline + 1, yycolumn + 1, yytext());}
{SWI}           { return new Symbol(sym.SWI, yyline + 1, yycolumn + 1, yytext());}
{BRE}           { return new Symbol(sym.BRE, yyline + 1, yycolumn + 1, yytext());}
{RET}           { return new Symbol(sym.RET, yyline + 1, yycolumn + 1, yytext());}
{CASE}          { return new Symbol(sym.CASE, yyline + 1, yycolumn + 1, yytext());}
{DEF}           { return new Symbol(sym.DEF, yyline + 1, yycolumn + 1, yytext());}
//Simbolos
{PUNTO}         { return new Symbol(sym.PUNTO, yyline + 1, yycolumn + 1, yytext()); }  
{COMA}          { return new Symbol(sym.COMA, yyline + 1, yycolumn + 1, yytext()); } 
{PUNTOYCOMA}    { return new Symbol(sym.PUNTOYCOMA, yyline + 1, yycolumn + 1, yytext());}
{DOSPUNTOS}     { return new Symbol(sym.DOSPUNTOS, yyline + 1, yycolumn + 1, yytext());}
{IGUAL}         { return new Symbol(sym.IGUAL, yyline + 1, yycolumn + 1, yytext());}
{MAS}           { return new Symbol(sym.MAS, yyline + 1, yycolumn + 1, yytext()); }
{MENOS}         { return new Symbol(sym.MENOS, yyline + 1, yycolumn + 1, yytext()); }    
{POR}           { return new Symbol(sym.POR, yyline + 1, yycolumn + 1, yytext()); } 
{GBAJO}         { return new Symbol(sym.GBAJO, yyline + 1, yycolumn + 1, yytext()); } 
{DIVIDIDO}      { return new Symbol(sym.DIVIDIDO, yyline + 1, yycolumn + 1, yytext()); } 
{PABIERTO}      { return new Symbol(sym.PABIERTO, yyline + 1, yycolumn + 1, yytext()); } 
{PCERRADO}      { return new Symbol(sym.PCERRADO, yyline + 1, yycolumn + 1, yytext()); }
{LLABIERTO}     { return new Symbol(sym.LLABIERTO, yyline + 1, yycolumn + 1, yytext()); }
{LLCERRADO}     { return new Symbol(sym.LLCERRADO, yyline + 1, yycolumn + 1, yytext()); }
{COMILLA}       { return new Symbol(sym.COMILLA, yyline + 1, yycolumn + 1, yytext()); }
{CABIERTO}      { return new Symbol(sym.CABIERTO, yyline + 1, yycolumn + 1, yytext());}
{CCERRADO}      { return new Symbol(sym.CCERRADO, yyline + 1, yycolumn + 1, yytext()); }
//Operadores
{MENOR}         { return new Symbol(sym.MENOR, yyline + 1, yycolumn + 1, yytext()); }
{MAYOR}         { return new Symbol(sym.MAYOR, yyline + 1, yycolumn + 1, yytext()); }
{IGUALDAD}      { return new Symbol(sym.IGUALDAD, yyline + 1, yycolumn + 1, yytext()); }
{DESIGUALDAD}   { return new Symbol(sym.DESIGUALDAD, yyline + 1, yycolumn + 1, yytext()); }
{MEI}           { return new Symbol(sym.MEI, yyline + 1, yycolumn + 1, yytext()); }
{MAI}           { return new Symbol(sym.MAI, yyline + 1, yycolumn + 1, yytext()); }
{Y}             { return new Symbol(sym.Y, yyline + 1, yycolumn + 1, yytext()); }
{O}             { return new Symbol(sym.O, yyline + 1, yycolumn + 1, yytext()); }
{NEGAR}         { return new Symbol(sym.NEGAR, yyline + 1, yycolumn + 1, yytext()); }
//Texto y Valores
{ENT}           { return new Symbol(sym.ENT, yyline + 1, yycolumn + 1, yytext()); }
{DEC}           { return new Symbol(sym.DEC, yyline + 1, yycolumn + 1, yytext()); }
{CHAR}          { return new Symbol(sym.CHAR, yyline + 1, yycolumn + 1, yytext()); }
{BOL}           { return new Symbol(sym.BOL, yyline + 1, yycolumn + 1, yytext()); }
{COMENT}        { return new Symbol(sym.COMENT, yyline + 1, yycolumn + 1, yytext()); }
{STEX}          { return new Symbol(sym.STEX, yyline + 1, yycolumn + 1, yytext()); }
{TEXTO}         { return new Symbol(sym.TEXTO, yyline + 1, yycolumn + 1, yytext()); }
[^] {}
