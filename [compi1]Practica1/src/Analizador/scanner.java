/* The following code was generated by JFlex 1.6.1 */

package Analizador;
import java.util.LinkedList;
import c1.practica1.Inicio;

import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/Analizador/Lexico.jflex</tt>
 */
public class scanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CADENA = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 33, 34, 36, 33, 33,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    33,  0, 35,  0,  0, 22,  0,  0,  0,  0,  0,  0, 21, 23,  0, 18, 
    28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 20,  0, 16, 19, 17,  0, 
     0,  4,  5,  3,  7,  1, 25, 30, 29, 32, 30, 30, 15, 30,  2,  8, 
    11, 24, 10, 31, 13,  9, 26, 30, 30, 30,  6,  0,  0,  0,  0, 27, 
     0,  4,  5,  3,  7,  1, 25, 30, 29, 32, 30, 30, 15, 30,  2,  8, 
    11, 24, 10, 31, 13,  9, 26, 30, 30, 30,  6,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0, 36,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0, 30,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0, 30,  0,  0,  0,  0,  0,  0,  0, 30,  0,  0,  0, 30,  0,  0, 
     0, 30,  0, 30,  0,  0,  0,  0,  0,  0, 30,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\5\2\1\1\1\2\1\1\1\3\1\4"+
    "\1\5\1\6\1\7\1\10\1\11\1\2\1\12\3\2"+
    "\1\13\1\14\1\15\1\16\1\17\2\2\1\0\1\20"+
    "\7\2\1\0\1\2\2\0\6\2\1\0\10\2\1\0"+
    "\1\2\2\0\5\2\1\21\2\0\11\2\1\0\1\2"+
    "\2\0\1\2\1\22\3\2\2\0\7\2\1\23\1\24"+
    "\1\0\1\2\1\0\1\20\3\2\1\0\1\25\1\2"+
    "\1\25\1\2\1\0\1\26\2\2\1\0\1\2\1\0"+
    "\3\2\1\0\1\2\1\0\1\27\1\30\1\31\2\2"+
    "\1\0\1\32\1\0\3\2\1\0\1\2\2\0\1\33"+
    "\1\34\2\35\1\2\2\0\3\2\1\0\1\2\3\0"+
    "\1\2\2\0\1\36\2\37\1\40\1\41\1\0\1\2"+
    "\4\0\2\42\4\0\1\43\1\44\1\45\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[178];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\45\0\112\0\157\0\224\0\271\0\336\0\u0103"+
    "\0\u0128\0\u014d\0\u0172\0\112\0\112\0\112\0\112\0\112"+
    "\0\112\0\112\0\u0197\0\u01bc\0\u01e1\0\u0206\0\u022b\0\112"+
    "\0\112\0\112\0\112\0\112\0\u0250\0\u0275\0\u029a\0\224"+
    "\0\u02bf\0\u02e4\0\u0309\0\u032e\0\u0353\0\u0378\0\u039d\0\u03c2"+
    "\0\u03e7\0\u040c\0\u0431\0\u0456\0\u047b\0\u04a0\0\u04c5\0\u04ea"+
    "\0\u050f\0\u0534\0\u0559\0\u057e\0\u05a3\0\u05c8\0\u05ed\0\u0612"+
    "\0\u0637\0\u065c\0\u0681\0\u06a6\0\u06cb\0\u06f0\0\u0715\0\u073a"+
    "\0\u075f\0\u0784\0\u07a9\0\u050f\0\u07ce\0\u07f3\0\u0818\0\u083d"+
    "\0\u0862\0\u0887\0\u08ac\0\u08d1\0\u08f6\0\u091b\0\u0940\0\u0965"+
    "\0\u098a\0\u09af\0\u09d4\0\u09f9\0\u073a\0\u0a1e\0\u0a43\0\u0a68"+
    "\0\u0a8d\0\u0ab2\0\u0ad7\0\u0afc\0\u0b21\0\u0b46\0\u0b6b\0\u0b90"+
    "\0\u0bb5\0\u091b\0\u0940\0\u0bda\0\u0bff\0\u0c24\0\112\0\u0c49"+
    "\0\u0c6e\0\u0c93\0\u0cb8\0\112\0\u0cdd\0\224\0\u0d02\0\u0d27"+
    "\0\224\0\u0d4c\0\u0d71\0\u0d96\0\u0dbb\0\u0de0\0\u0e05\0\u0e2a"+
    "\0\u0e4f\0\u0e74\0\u0e99\0\u0ebe\0\u0ee3\0\112\0\112\0\u0f08"+
    "\0\u0f2d\0\u0f52\0\u0dbb\0\u0f77\0\u0f9c\0\u0fc1\0\u0fe6\0\u100b"+
    "\0\u1030\0\u1055\0\u107a\0\112\0\112\0\112\0\224\0\u109f"+
    "\0\u10c4\0\u10e9\0\u110e\0\u1133\0\u1158\0\u117d\0\u11a2\0\u11c7"+
    "\0\u11ec\0\u1211\0\u1236\0\u125b\0\u1280\0\224\0\112\0\224"+
    "\0\112\0\112\0\u12a5\0\u12ca\0\u12ef\0\u1314\0\u1339\0\u135e"+
    "\0\112\0\224\0\u1383\0\u13a8\0\u13cd\0\u13f2\0\112\0\112"+
    "\0\112\0\112";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[178];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\6\5\1\7\1\10\1\11"+
    "\1\12\1\13\1\5\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\3\1\5\1\23\1\5\1\3\1\24"+
    "\1\25\1\5\1\26\1\27\2\30\1\31\1\0\42\32"+
    "\1\33\1\34\1\32\46\0\1\5\1\35\1\36\10\5"+
    "\1\37\1\5\1\0\1\5\10\0\1\5\1\40\5\5"+
    "\1\41\1\5\5\0\13\5\1\0\1\5\1\0\1\5"+
    "\10\0\11\5\5\0\1\42\6\5\1\43\1\44\2\5"+
    "\1\0\1\5\1\0\1\5\10\0\11\5\5\0\1\45"+
    "\12\5\1\0\1\5\1\0\1\5\10\0\11\5\5\0"+
    "\7\5\1\46\1\5\1\47\1\5\1\0\1\5\1\0"+
    "\1\5\10\0\11\5\15\0\1\50\34\0\3\5\1\51"+
    "\7\5\1\0\1\5\1\0\1\5\10\0\11\5\6\0"+
    "\1\52\43\0\13\5\1\0\1\5\1\53\1\5\10\0"+
    "\10\5\1\54\40\0\1\24\11\0\13\5\1\0\1\55"+
    "\1\0\1\5\10\0\11\5\5\0\10\5\1\56\2\5"+
    "\1\0\1\5\1\0\1\5\10\0\11\5\5\0\1\5"+
    "\1\57\11\5\1\0\1\5\1\0\1\5\10\0\11\5"+
    "\5\0\2\5\1\60\10\5\1\0\1\5\1\0\1\5"+
    "\10\0\11\5\5\0\13\5\1\0\1\5\1\0\1\5"+
    "\10\0\3\5\1\61\5\5\21\0\1\62\30\0\13\5"+
    "\1\0\1\63\1\0\1\5\10\0\11\5\5\0\1\5"+
    "\1\64\11\5\1\0\1\5\1\0\1\5\10\0\11\5"+
    "\5\0\13\5\1\0\1\5\1\0\1\65\10\0\11\5"+
    "\5\0\1\66\12\5\1\0\1\5\1\0\1\5\10\0"+
    "\11\5\5\0\12\5\1\67\1\0\1\5\1\0\1\5"+
    "\10\0\11\5\5\0\1\5\1\70\11\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\5\0\3\5\1\71\3\5"+
    "\1\72\3\5\1\0\1\5\1\0\1\5\10\0\11\5"+
    "\17\0\1\73\32\0\11\5\1\74\1\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\35\0\1\75\15\0\1\76"+
    "\43\0\1\5\1\77\11\5\1\0\1\5\1\0\1\5"+
    "\10\0\11\5\5\0\13\5\1\0\1\5\1\0\1\5"+
    "\10\0\3\5\1\100\5\5\5\0\12\5\1\101\1\0"+
    "\1\5\1\0\1\5\10\0\11\5\5\0\13\5\1\0"+
    "\1\5\1\0\1\5\10\0\1\5\1\102\7\5\5\0"+
    "\3\5\1\103\7\5\1\0\1\5\1\0\1\5\10\0"+
    "\11\5\5\0\13\5\1\0\1\5\1\0\1\5\10\0"+
    "\4\5\1\104\4\5\15\0\1\105\4\0\1\106\21\0"+
    "\1\106\5\0\10\5\1\107\2\5\1\0\1\5\1\106"+
    "\1\5\10\0\10\5\1\110\5\0\13\5\1\0\1\111"+
    "\1\0\1\5\10\0\11\5\5\0\7\5\1\112\3\5"+
    "\1\0\1\5\1\0\1\5\10\0\11\5\5\0\11\5"+
    "\1\113\1\5\1\0\1\5\1\0\1\5\10\0\11\5"+
    "\5\0\7\5\1\114\3\5\1\0\1\5\1\0\1\5"+
    "\10\0\11\5\5\0\6\5\1\115\4\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\5\0\13\5\1\0\1\5"+
    "\1\0\1\5\10\0\3\5\1\116\5\5\5\0\13\5"+
    "\1\0\1\5\1\0\1\5\10\0\3\5\1\117\5\5"+
    "\5\0\1\120\44\0\1\121\12\5\1\0\1\5\1\0"+
    "\1\5\10\0\11\5\5\0\1\122\47\0\1\123\41\0"+
    "\3\5\1\124\7\5\1\0\1\5\1\0\1\5\10\0"+
    "\11\5\5\0\13\5\1\0\1\5\1\0\1\5\10\0"+
    "\4\5\1\125\4\5\5\0\1\126\12\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\5\0\1\127\12\5\1\0"+
    "\1\5\1\0\1\5\10\0\11\5\5\0\4\5\1\130"+
    "\6\5\1\0\1\5\1\0\1\5\10\0\11\5\13\0"+
    "\1\131\54\0\1\132\26\0\6\5\1\133\4\5\1\0"+
    "\1\5\1\0\1\5\10\0\11\5\5\0\13\5\1\0"+
    "\1\5\1\0\1\134\10\0\11\5\5\0\11\5\1\135"+
    "\1\5\1\0\1\5\1\0\1\5\10\0\11\5\5\0"+
    "\11\5\1\136\1\5\1\0\1\5\1\0\1\5\10\0"+
    "\11\5\5\0\12\5\1\137\1\0\1\5\1\0\1\5"+
    "\10\0\11\5\5\0\11\5\1\140\1\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\5\0\1\141\12\5\1\0"+
    "\1\5\1\0\1\5\10\0\11\5\5\0\13\5\1\0"+
    "\1\5\1\0\1\5\10\0\4\5\1\142\4\5\5\0"+
    "\13\5\1\0\1\5\1\0\1\5\10\0\4\5\1\143"+
    "\4\5\16\0\1\144\33\0\3\5\1\145\7\5\1\0"+
    "\1\5\1\0\1\5\10\0\11\5\16\0\1\146\51\0"+
    "\1\147\26\0\13\5\1\0\1\5\1\0\1\40\10\0"+
    "\11\5\5\0\11\5\1\150\1\5\1\0\1\5\1\0"+
    "\1\5\10\0\11\5\5\0\11\5\1\151\1\5\1\0"+
    "\1\5\1\0\1\5\10\0\11\5\5\0\1\152\12\5"+
    "\1\0\1\5\1\0\1\5\10\0\11\5\22\0\1\153"+
    "\21\0\1\153\14\0\1\154\35\0\13\5\1\0\1\5"+
    "\1\153\1\5\10\0\10\5\1\155\5\0\7\5\1\156"+
    "\3\5\1\0\1\5\1\0\1\5\10\0\11\5\5\0"+
    "\7\5\1\157\3\5\1\0\1\5\1\0\1\5\10\0"+
    "\11\5\5\0\13\5\1\0\1\5\1\0\1\5\7\0"+
    "\1\160\11\5\5\0\7\5\1\161\3\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\5\0\13\5\1\0\1\162"+
    "\1\0\1\5\10\0\11\5\5\0\11\5\1\163\1\5"+
    "\1\0\1\5\1\0\1\5\10\0\11\5\22\0\1\164"+
    "\21\0\1\164\5\0\13\5\1\0\1\5\1\0\1\5"+
    "\10\0\3\5\1\165\5\5\22\0\1\166\21\0\1\166"+
    "\5\0\13\5\1\0\1\5\1\164\1\5\10\0\10\5"+
    "\1\167\5\0\13\5\1\0\1\5\1\166\1\5\10\0"+
    "\10\5\1\170\5\0\5\5\1\171\5\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\10\0\1\172\41\0\3\5"+
    "\1\173\7\5\1\0\1\5\1\0\1\5\10\0\11\5"+
    "\5\0\13\5\1\0\1\5\1\0\1\5\7\0\1\174"+
    "\11\5\6\0\1\175\12\0\1\176\14\0\1\177\13\0"+
    "\1\200\12\5\1\0\1\5\1\0\1\5\10\0\11\5"+
    "\5\0\3\5\1\201\7\5\1\0\1\5\1\0\1\5"+
    "\10\0\11\5\14\0\1\202\35\0\13\5\1\0\1\5"+
    "\1\0\1\5\10\0\4\5\1\203\4\5\14\0\1\204"+
    "\35\0\7\5\1\205\3\5\1\0\1\5\1\0\1\5"+
    "\10\0\11\5\5\0\7\5\1\206\3\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\5\0\3\5\1\207\7\5"+
    "\1\0\1\5\1\0\1\5\10\0\11\5\6\0\1\210"+
    "\43\0\1\5\1\211\11\5\1\0\1\5\1\0\1\5"+
    "\10\0\11\5\13\0\1\212\6\0\1\213\21\0\1\213"+
    "\10\0\1\214\5\0\1\215\33\0\13\5\1\216\1\5"+
    "\1\0\1\5\10\0\7\5\1\217\1\5\5\0\2\5"+
    "\1\220\10\5\1\0\1\5\1\0\1\5\10\0\11\5"+
    "\16\0\1\221\44\0\1\222\33\0\11\5\1\223\1\5"+
    "\1\0\1\5\1\0\1\5\10\0\11\5\5\0\11\5"+
    "\1\224\1\5\1\0\1\5\1\0\1\5\10\0\11\5"+
    "\5\0\6\5\1\225\4\5\1\0\1\5\1\0\1\5"+
    "\10\0\11\5\21\0\1\226\30\0\13\5\1\0\1\227"+
    "\1\0\1\5\10\0\11\5\5\0\1\230\51\0\1\231"+
    "\37\0\13\5\1\0\1\5\1\232\1\5\10\0\10\5"+
    "\1\233\33\0\1\234\44\0\1\235\16\0\13\5\1\0"+
    "\1\5\1\0\1\5\7\0\1\234\11\5\5\0\13\5"+
    "\1\0\1\5\1\0\1\5\7\0\1\235\11\5\5\0"+
    "\7\5\1\236\3\5\1\0\1\5\1\0\1\5\10\0"+
    "\11\5\5\0\1\237\44\0\1\240\12\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\16\0\1\241\62\0\1\242"+
    "\24\0\1\243\35\0\7\5\1\244\3\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\13\0\1\245\6\0\1\246"+
    "\21\0\1\246\13\0\1\247\6\0\1\250\21\0\1\250"+
    "\6\0\1\251\43\0\1\5\1\252\11\5\1\0\1\5"+
    "\1\0\1\5\10\0\11\5\5\0\1\253\51\0\1\254"+
    "\37\0\1\255\51\0\1\256\50\0\1\257\62\0\1\260"+
    "\26\0\1\261\62\0\1\262\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5143];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\10\1\7\11\5\1\5\11\2\1\1\0"+
    "\10\1\1\0\1\1\2\0\6\1\1\0\10\1\1\0"+
    "\1\1\2\0\6\1\2\0\11\1\1\0\1\1\2\0"+
    "\5\1\2\0\11\1\1\0\1\1\1\0\1\11\3\1"+
    "\1\0\1\11\3\1\1\0\3\1\1\0\1\1\1\0"+
    "\3\1\1\0\1\1\1\0\1\1\2\11\2\1\1\0"+
    "\1\1\1\0\3\1\1\0\1\1\2\0\3\11\2\1"+
    "\2\0\3\1\1\0\1\1\3\0\1\1\2\0\1\1"+
    "\1\11\1\1\2\11\1\0\1\1\4\0\1\11\1\1"+
    "\4\0\4\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[178];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    String cadena= "";


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public scanner(java.io.Reader in) {
    this.zzReader = in;
  }



  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { Inicio.lisErrores.add("Error léxico : Lexema"+yytext()+", Línea: "+(yyline+1)+"Columna: "+yycolumn+" El caracter No pertenece al lenguaje\n");
            }
          case 39: break;
          case 2: 
            { return new Symbol(sym.ID, yyline, yycolumn,yytext());
            }
          case 40: break;
          case 3: 
            { return new Symbol(sym.ETI_A, yyline, yycolumn,yytext());
            }
          case 41: break;
          case 4: 
            { return new Symbol(sym.ETI_C, yyline, yycolumn,yytext());
            }
          case 42: break;
          case 5: 
            { return new Symbol(sym.DIAG, yyline, yycolumn,yytext());
            }
          case 43: break;
          case 6: 
            { return new Symbol(sym.IGUAL, yyline, yycolumn,yytext());
            }
          case 44: break;
          case 7: 
            { return new Symbol(sym.DOSP, yyline, yycolumn,yytext());
            }
          case 45: break;
          case 8: 
            { return new Symbol(sym.COMA, yyline, yycolumn,yytext());
            }
          case 46: break;
          case 9: 
            { return new Symbol(sym.PORCE, yyline, yycolumn,yytext());
            }
          case 47: break;
          case 10: 
            { return new Symbol(sym.ENTERO, yyline, yycolumn,yytext());
            }
          case 48: break;
          case 11: 
            { 
            }
          case 49: break;
          case 12: 
            { yybegin(CADENA); cadena="";
            }
          case 50: break;
          case 13: 
            { cadena+=yytext();
            }
          case 51: break;
          case 14: 
            { String tmp=cadena; cadena="";  
                Inicio.lisErrores.add("Error léxico : Lexema"+"Salto de linea"+", Línea: "+(yyline+1)+"Columna: "+yycolumn+" Se esperaba \" \n");       
                yybegin(YYINITIAL);
            }
          case 52: break;
          case 15: 
            { String tmp=cadena; cadena="";
               yybegin(YYINITIAL); 
               return new Symbol(sym.CADENA, yyline,yycolumn,tmp);
            }
          case 53: break;
          case 16: 
            { return new Symbol(sym.FINA, yyline, yycolumn,yytext());
            }
          case 54: break;
          case 17: 
            { return new Symbol(sym.EC, yyline, yycolumn,yytext());
            }
          case 55: break;
          case 18: 
            { return new Symbol(sym.HT, yyline, yycolumn,yytext());
            }
          case 56: break;
          case 19: 
            { return new Symbol(sym.PRA, yyline, yycolumn,yytext());
            }
          case 57: break;
          case 20: 
            { return new Symbol(sym.PRO, yyline, yycolumn,yytext());
            }
          case 58: break;
          case 21: 
            { return new Symbol(sym.ESTIL, yyline, yycolumn,yytext());
            }
          case 59: break;
          case 22: 
            { return new Symbol(sym.CUERP, yyline, yycolumn,yytext());
            }
          case 60: break;
          case 23: 
            { return new Symbol(sym.CN, yyline, yycolumn,yytext());
            }
          case 61: break;
          case 24: 
            { return new Symbol(sym.CT, yyline, yycolumn,yytext());
            }
          case 62: break;
          case 25: 
            { return new Symbol(sym.CV, yyline, yycolumn,yytext());
            }
          case 63: break;
          case 26: 
            { return new Symbol(sym.TAREA, yyline, yycolumn,yytext());
            }
          case 64: break;
          case 27: 
            { return new Symbol(sym.CNA, yyline, yycolumn,yytext());
            }
          case 65: break;
          case 28: 
            { return new Symbol(sym.CNR, yyline, yycolumn,yytext());
            }
          case 66: break;
          case 29: 
            { return new Symbol(sym.REPOR, yyline, yycolumn,yytext());
            }
          case 67: break;
          case 30: 
            { return new Symbol(sym.ENCAB, yyline, yycolumn,yytext());
            }
          case 68: break;
          case 31: 
            { return new Symbol(sym.ESTUD, yyline, yycolumn,yytext());
            }
          case 69: break;
          case 32: 
            { return new Symbol(sym.CD, yyline, yycolumn,yytext());
            }
          case 70: break;
          case 33: 
            { return new Symbol(sym.CI, yyline, yycolumn,yytext());
            }
          case 71: break;
          case 34: 
            { return new Symbol(sym.POND, yyline, yycolumn,yytext());
            }
          case 72: break;
          case 35: 
            { return new Symbol(sym.SD, yyline, yycolumn,yytext());
            }
          case 73: break;
          case 36: 
            { return new Symbol(sym.SI, yyline, yycolumn,yytext());
            }
          case 74: break;
          case 37: 
            { return new Symbol(sym.IDE, yyline, yycolumn,yytext());
            }
          case 75: break;
          case 38: 
            { return new Symbol(sym.II, yyline, yycolumn,yytext());
            }
          case 76: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
