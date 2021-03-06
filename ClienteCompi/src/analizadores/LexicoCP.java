/* The following code was generated by JFlex 1.6.1 */

package analizadores;

import java_cup.runtime.Symbol;
import javax.swing.JTextArea;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>LexicoCP.jflex</tt>
 */
public class LexicoCP implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int ANOTHERSTATE = 2;

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
     0,  0,  0,  0,  0,  0,  0,  0,  0, 39, 11, 40, 39, 39,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    39, 47,  5,  0, 15, 43, 48, 14, 44,  8, 42, 41, 12, 10,  4,  7, 
     3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 12, 13,  6, 16,  9,  0, 
     0, 22, 24, 31, 23, 21, 35, 33, 17, 27,  2,  2, 20, 19, 34, 25, 
    30,  2, 28, 38, 18, 36, 29,  2, 32,  2,  2, 45,  0, 46,  0,  1, 
     0, 22, 24, 31, 23, 21, 35, 33, 17, 27,  2,  2, 20, 19, 34, 25, 
    30,  2, 28, 38, 18, 36, 29,  2, 32,  2,  2,  0, 49,  0,  0,  0, 
     0,  0,  0,  0,  0, 40,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\7\1\1\2\1\3\1\4\1\5\1\2\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\2\2\1\15"+
    "\4\3\1\2\7\3\1\2\1\3\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\2\2\1\0\1\25\1\0"+
    "\1\1\3\0\1\26\1\0\1\27\1\30\1\0\1\31"+
    "\1\32\1\0\1\33\1\34\1\3\1\0\4\3\1\0"+
    "\12\3\2\0\2\3\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\2\0\1\43\1\0\1\44\1\3\1\0\4\3"+
    "\2\45\1\0\3\3\1\0\6\3\2\0\2\3\2\0"+
    "\1\3\2\46\3\3\1\0\1\3\1\0\2\3\1\0"+
    "\1\3\1\47\1\0\4\3\2\0\2\3\1\50\3\3"+
    "\1\0\1\3\1\0\2\3\2\51\2\52\2\3\1\0"+
    "\1\3\1\0\1\53\1\3\1\53\1\3\1\54\1\3"+
    "\2\55\1\0\2\3\2\56\1\3\1\57\1\0\1\3"+
    "\2\60\2\61\1\62\1\0\3\3\2\63\1\0\3\3"+
    "\2\64\1\3\1\0\1\3\2\65\1\0\1\3\2\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[205];
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
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\144\0\u01c2\0\u01f4\0\144\0\u0226\0\u0258\0\144"+
    "\0\144\0\u028a\0\u02bc\0\144\0\144\0\u02ee\0\u0320\0\u0352"+
    "\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2"+
    "\0\u0514\0\u0546\0\u0578\0\u05aa\0\u05dc\0\u060e\0\u0640\0\u0672"+
    "\0\144\0\144\0\144\0\144\0\u06a4\0\u06d6\0\u0708\0\310"+
    "\0\144\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0226\0\144\0\u0802"+
    "\0\144\0\144\0\u0834\0\144\0\144\0\u0866\0\144\0\144"+
    "\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6"+
    "\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86"+
    "\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\144\0\144\0\144"+
    "\0\144\0\144\0\144\0\u0cb2\0\u0ce4\0\u07d0\0\u0d16\0\144"+
    "\0\u0d48\0\u0d7a\0\u0dac\0\u0dde\0\u0e10\0\u0e42\0\144\0\u01c2"+
    "\0\u0e74\0\u0ea6\0\u0ed8\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2"+
    "\0\u1004\0\u1036\0\u1068\0\u109a\0\u10cc\0\u10fe\0\u1130\0\u1162"+
    "\0\u1194\0\u11c6\0\144\0\u01c2\0\u11f8\0\u122a\0\u125c\0\u128e"+
    "\0\u12c0\0\u12f2\0\u1324\0\u1356\0\u1388\0\u13ba\0\u01c2\0\u13ec"+
    "\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u154a\0\u157c"+
    "\0\u01c2\0\u15ae\0\u15e0\0\u1612\0\u1644\0\u1676\0\u16a8\0\u16da"+
    "\0\u170c\0\144\0\u01c2\0\u173e\0\u1770\0\u17a2\0\u17d4\0\u1806"+
    "\0\u1838\0\u186a\0\144\0\u189c\0\u01c2\0\u18ce\0\u01c2\0\u1900"+
    "\0\144\0\u01c2\0\u1932\0\u1964\0\u1996\0\144\0\u01c2\0\u19c8"+
    "\0\u01c2\0\u19fa\0\u1a2c\0\144\0\u01c2\0\144\0\u01c2\0\u01c2"+
    "\0\u1a5e\0\u1a90\0\u1ac2\0\u1af4\0\144\0\u01c2\0\u1b26\0\u1b58"+
    "\0\u1b8a\0\u1bbc\0\144\0\u01c2\0\u1bee\0\u1c20\0\u1c52\0\144"+
    "\0\u01c2\0\u1c84\0\u1cb6\0\144\0\u01c2";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[205];
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
    "\2\3\3\4\1\5\6\3\2\4\1\3\1\6\1\3"+
    "\1\4\1\7\3\4\1\10\1\11\2\4\1\3\12\4"+
    "\1\3\1\4\1\3\1\0\11\3\1\12\2\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\12\1\25\1\26\1\27\1\30\1\13\1\31\1\32"+
    "\3\13\1\33\1\34\1\13\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\2\13\1\43\1\44\1\13\1\45\1\46"+
    "\1\24\1\0\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\57\64\0\3\4\7\0\2\4\3\0"+
    "\11\4\1\0\12\4\1\0\1\4\13\0\5\60\1\3"+
    "\54\60\17\0\1\61\44\0\3\4\7\0\2\4\3\0"+
    "\11\4\1\62\12\4\1\0\1\4\15\0\3\4\7\0"+
    "\2\4\3\0\3\4\1\63\5\4\1\0\12\4\1\0"+
    "\1\4\15\0\3\4\7\0\2\4\3\0\11\4\1\64"+
    "\12\4\1\0\1\4\14\0\3\13\15\0\11\13\1\0"+
    "\12\13\1\0\1\13\16\0\1\14\1\65\55\0\5\66"+
    "\1\67\54\66\7\0\1\70\10\0\1\71\61\0\1\72"+
    "\52\0\1\73\1\74\5\0\1\75\41\0\16\76\1\0"+
    "\43\76\17\0\1\77\62\0\1\100\42\0\3\13\15\0"+
    "\4\13\1\101\4\13\1\102\1\103\11\13\1\0\1\13"+
    "\14\0\3\13\15\0\4\13\1\104\4\13\1\0\12\13"+
    "\1\0\1\13\14\0\3\13\15\0\10\13\1\105\1\0"+
    "\12\13\1\0\1\13\14\0\3\13\15\0\10\13\1\106"+
    "\1\0\12\13\1\0\1\13\55\0\1\107\20\0\3\13"+
    "\15\0\11\13\1\0\7\13\1\110\2\13\1\0\1\13"+
    "\14\0\3\13\15\0\4\13\1\111\4\13\1\0\12\13"+
    "\1\0\1\13\14\0\3\13\15\0\5\13\1\112\3\13"+
    "\1\0\12\13\1\0\1\13\14\0\3\13\15\0\5\13"+
    "\1\113\3\13\1\0\1\13\1\114\10\13\1\0\1\13"+
    "\14\0\3\13\15\0\1\115\2\13\1\116\4\13\1\117"+
    "\1\0\12\13\1\0\1\13\14\0\3\13\15\0\10\13"+
    "\1\120\1\0\12\13\1\0\1\13\14\0\3\13\15\0"+
    "\11\13\1\0\11\13\1\121\1\0\1\13\35\0\1\122"+
    "\14\0\1\123\23\0\3\13\15\0\1\13\1\124\7\13"+
    "\1\0\4\13\1\125\5\13\1\0\1\13\33\0\1\126"+
    "\30\0\1\127\30\0\1\130\61\0\1\131\121\0\1\132"+
    "\62\0\1\133\22\0\1\134\41\0\3\4\7\0\2\4"+
    "\3\0\11\4\1\135\12\4\1\0\1\4\50\0\1\3"+
    "\27\0\1\136\56\0\7\70\1\137\2\0\42\70\1\0"+
    "\5\70\13\73\1\3\46\73\16\0\1\140\44\0\3\13"+
    "\15\0\11\13\1\0\5\13\1\141\4\13\1\0\1\13"+
    "\51\0\1\142\24\0\3\13\15\0\11\13\1\0\3\13"+
    "\1\143\6\13\1\0\1\13\14\0\3\13\15\0\1\13"+
    "\1\144\7\13\1\0\12\13\1\0\1\13\14\0\3\13"+
    "\15\0\11\13\1\0\11\13\1\145\1\0\1\13\14\0"+
    "\3\13\15\0\10\13\1\146\1\0\12\13\1\0\1\13"+
    "\35\0\1\147\40\0\3\13\15\0\1\13\1\150\7\13"+
    "\1\0\12\13\1\0\1\13\14\0\3\13\15\0\11\13"+
    "\1\0\12\13\1\151\1\152\14\0\3\13\15\0\11\13"+
    "\1\0\1\13\1\153\10\13\1\0\1\13\14\0\3\13"+
    "\15\0\11\13\1\0\1\13\1\154\10\13\1\0\1\13"+
    "\14\0\3\13\15\0\11\13\1\155\1\156\11\13\1\0"+
    "\1\13\14\0\3\13\15\0\5\13\1\157\3\13\1\0"+
    "\12\13\1\0\1\13\14\0\3\13\15\0\5\13\1\160"+
    "\3\13\1\0\12\13\1\0\1\13\14\0\3\13\15\0"+
    "\2\13\1\161\6\13\1\0\12\13\1\0\1\13\14\0"+
    "\3\13\15\0\2\13\1\162\6\13\1\0\12\13\1\0"+
    "\1\13\14\0\3\13\15\0\11\13\1\0\7\13\1\163"+
    "\2\13\1\0\1\13\47\0\1\164\56\0\1\165\31\0"+
    "\3\13\15\0\11\13\1\0\1\13\1\166\10\13\1\0"+
    "\1\13\14\0\3\13\15\0\10\13\1\167\1\0\12\13"+
    "\1\0\1\13\37\0\1\170\76\0\1\171\31\0\1\3"+
    "\51\0\3\13\15\0\1\13\1\172\7\13\1\0\12\13"+
    "\1\0\1\13\44\0\1\173\31\0\3\13\15\0\10\13"+
    "\1\174\1\0\12\13\1\0\1\13\14\0\3\13\15\0"+
    "\10\13\1\175\1\0\12\13\1\0\1\13\14\0\3\13"+
    "\15\0\7\13\1\176\1\13\1\0\12\13\1\0\1\13"+
    "\14\0\3\13\15\0\3\13\1\177\5\13\1\0\12\13"+
    "\1\0\1\13\57\0\1\200\16\0\3\13\15\0\11\13"+
    "\1\0\11\13\1\201\1\0\1\13\14\0\3\13\15\0"+
    "\11\13\1\202\1\203\11\13\1\0\1\13\14\0\3\13"+
    "\15\0\5\13\1\204\3\13\1\0\12\13\1\0\1\13"+
    "\55\0\1\205\20\0\3\13\15\0\11\13\1\0\7\13"+
    "\1\206\2\13\1\0\1\13\14\0\3\13\15\0\11\13"+
    "\1\0\1\13\1\207\10\13\1\0\1\13\14\0\3\13"+
    "\15\0\11\13\1\0\12\13\1\210\1\211\14\0\3\13"+
    "\15\0\4\13\1\212\4\13\1\0\12\13\1\0\1\13"+
    "\14\0\3\13\15\0\7\13\1\213\1\13\1\0\12\13"+
    "\1\0\1\13\14\0\3\13\15\0\11\13\1\0\4\13"+
    "\1\214\5\13\1\0\1\13\45\0\2\215\62\0\1\216"+
    "\26\0\3\13\15\0\11\13\1\215\1\217\11\13\1\0"+
    "\1\13\14\0\3\13\15\0\11\13\1\0\1\13\1\220"+
    "\10\13\1\0\1\13\40\0\1\3\76\0\1\3\20\0"+
    "\3\13\15\0\10\13\1\221\1\0\12\13\1\0\1\13"+
    "\14\0\3\13\15\0\6\13\1\222\2\13\1\0\12\13"+
    "\1\0\1\13\14\0\3\13\15\0\3\13\1\223\5\13"+
    "\1\0\12\13\1\0\1\13\14\0\3\13\15\0\4\13"+
    "\1\224\4\13\1\0\12\13\1\0\1\13\37\0\1\225"+
    "\36\0\3\13\15\0\3\13\1\226\5\13\1\0\12\13"+
    "\1\0\1\13\41\0\1\227\34\0\3\13\15\0\5\13"+
    "\1\230\3\13\1\0\12\13\1\0\1\13\14\0\3\13"+
    "\15\0\2\13\1\231\6\13\1\0\12\13\1\0\1\13"+
    "\35\0\1\232\40\0\3\13\15\0\1\13\1\233\7\13"+
    "\1\0\12\13\1\0\1\13\40\0\1\234\35\0\3\13"+
    "\15\0\4\13\1\235\4\13\1\0\12\13\1\0\1\13"+
    "\14\0\3\13\15\0\11\13\1\0\7\13\1\236\2\13"+
    "\1\0\1\13\14\0\3\13\15\0\11\13\1\0\1\13"+
    "\1\237\10\13\1\0\1\13\14\0\3\13\15\0\11\13"+
    "\1\240\1\241\11\13\1\0\1\13\55\0\1\242\44\0"+
    "\1\243\35\0\3\13\15\0\11\13\1\0\7\13\1\244"+
    "\2\13\1\0\1\13\14\0\3\13\15\0\4\13\1\245"+
    "\4\13\1\0\12\13\1\0\1\13\14\0\3\13\15\0"+
    "\10\13\1\246\1\0\12\13\1\0\1\13\14\0\3\13"+
    "\15\0\4\13\1\247\4\13\1\0\12\13\1\0\1\13"+
    "\14\0\3\13\15\0\5\13\1\250\3\13\1\0\12\13"+
    "\1\0\1\13\35\0\1\251\40\0\3\13\15\0\1\13"+
    "\1\252\7\13\1\0\12\13\1\0\1\13\43\0\1\253"+
    "\32\0\3\13\15\0\7\13\1\254\1\13\1\0\12\13"+
    "\1\0\1\13\14\0\3\13\15\0\4\13\1\255\4\13"+
    "\1\0\12\13\1\0\1\13\60\0\2\256\14\0\3\13"+
    "\15\0\11\13\1\0\12\13\1\256\1\257\14\0\3\13"+
    "\15\0\1\13\1\260\7\13\1\0\12\13\1\0\1\13"+
    "\14\0\3\13\15\0\4\13\1\261\4\13\1\0\12\13"+
    "\1\0\1\13\44\0\1\262\31\0\3\13\15\0\10\13"+
    "\1\263\1\0\12\13\1\0\1\13\54\0\1\264\21\0"+
    "\3\13\15\0\11\13\1\0\6\13\1\265\3\13\1\0"+
    "\1\13\14\0\3\13\15\0\11\13\1\0\12\13\1\266"+
    "\1\267\14\0\3\13\15\0\11\13\1\0\7\13\1\270"+
    "\2\13\1\0\1\13\37\0\1\271\36\0\3\13\15\0"+
    "\3\13\1\272\5\13\1\0\12\13\1\0\1\13\14\0"+
    "\3\13\15\0\1\13\1\273\7\13\1\0\12\13\1\0"+
    "\1\13\14\0\3\13\15\0\5\13\1\274\3\13\1\0"+
    "\12\13\1\0\1\13\55\0\1\275\20\0\3\13\15\0"+
    "\11\13\1\0\7\13\1\276\2\13\1\0\1\13\40\0"+
    "\1\277\35\0\3\13\15\0\4\13\1\300\4\13\1\0"+
    "\12\13\1\0\1\13\14\0\3\13\15\0\11\13\1\0"+
    "\1\13\1\301\10\13\1\0\1\13\14\0\3\13\15\0"+
    "\11\13\1\0\1\13\1\302\10\13\1\0\1\13\60\0"+
    "\2\303\14\0\3\13\15\0\11\13\1\0\12\13\1\303"+
    "\1\304\14\0\3\13\15\0\10\13\1\305\1\0\12\13"+
    "\1\0\1\13\14\0\3\13\15\0\11\13\1\306\1\307"+
    "\11\13\1\0\1\13\14\0\3\13\15\0\11\13\1\0"+
    "\12\13\1\310\1\311\44\0\1\312\31\0\3\13\15\0"+
    "\10\13\1\313\1\0\12\13\1\0\1\13\60\0\2\314"+
    "\14\0\3\13\15\0\11\13\1\0\12\13\1\314\1\315"+
    "\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7400];
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
  
    public JTextArea consola;


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
    "\2\0\1\11\6\1\1\11\2\1\1\11\2\1\2\11"+
    "\2\1\2\11\23\1\4\11\3\1\1\0\1\11\1\0"+
    "\1\1\3\0\1\11\1\0\2\11\1\0\2\11\1\0"+
    "\2\11\1\1\1\0\4\1\1\0\12\1\2\0\2\1"+
    "\6\11\2\0\1\1\1\0\1\11\1\1\1\0\4\1"+
    "\1\11\1\1\1\0\3\1\1\0\6\1\2\0\2\1"+
    "\2\0\1\1\1\11\4\1\1\0\1\1\1\0\2\1"+
    "\1\0\2\1\1\0\4\1\2\0\6\1\1\0\1\1"+
    "\1\0\2\1\1\11\5\1\1\0\1\1\1\0\1\11"+
    "\5\1\1\11\1\1\1\0\2\1\1\11\3\1\1\0"+
    "\1\1\1\11\1\1\1\11\2\1\1\0\3\1\1\11"+
    "\1\1\1\0\3\1\1\11\2\1\1\0\1\1\1\11"+
    "\1\1\1\0\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[205];
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

    String text = "";



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexicoCP(java.io.Reader in) {
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
          { return new java_cup.runtime.Symbol(SimbolosCP.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { 
            }
          case 55: break;
          case 2: 
            { consola.append("\nError Léxico: " + yytext());
            }
          case 56: break;
          case 3: 
            { return new Symbol(SimbolosCP.id, yycolumn, yyline, yytext());
            }
          case 57: break;
          case 4: 
            { return new Symbol(SimbolosCP.num, yycolumn, yyline, yytext());
            }
          case 58: break;
          case 5: 
            { return new Symbol(SimbolosCP.punto, yycolumn, yyline, yytext());
            }
          case 59: break;
          case 6: 
            { return new Symbol(SimbolosCP.menor, yycolumn, yyline, yytext());
            }
          case 60: break;
          case 7: 
            { return new Symbol(SimbolosCP.div, yycolumn, yyline, yytext());
            }
          case 61: break;
          case 8: 
            { return new Symbol(SimbolosCP.cierrapar, yycolumn, yyline, yytext());
            }
          case 62: break;
          case 9: 
            { return new Symbol(SimbolosCP.mayor, yycolumn, yyline, yytext());
            }
          case 63: break;
          case 10: 
            { return new Symbol(SimbolosCP.menos, yycolumn, yyline, yytext());
            }
          case 64: break;
          case 11: 
            { /* Espacios en blanco, se ignoran */
            }
          case 65: break;
          case 12: 
            { return new Symbol(SimbolosCP.puntocoma, yycolumn, yyline, yytext());
            }
          case 66: break;
          case 13: 
            { return new Symbol(SimbolosCP.igual, yycolumn, yyline, yytext());
            }
          case 67: break;
          case 14: 
            { return new Symbol(SimbolosCP.mas, yycolumn, yyline, yytext());
            }
          case 68: break;
          case 15: 
            { return new Symbol(SimbolosCP.por, yycolumn, yyline, yytext());
            }
          case 69: break;
          case 16: 
            { return new Symbol(SimbolosCP.modulo, yycolumn, yyline, yytext());
            }
          case 70: break;
          case 17: 
            { return new Symbol(SimbolosCP.abrepar, yycolumn, yyline, yytext());
            }
          case 71: break;
          case 18: 
            { return new Symbol(SimbolosCP.abrecor, yycolumn, yyline, yytext());
            }
          case 72: break;
          case 19: 
            { return new Symbol(SimbolosCP.cierracor, yycolumn, yyline, yytext());
            }
          case 73: break;
          case 20: 
            { return new Symbol(SimbolosCP.not, yycolumn, yyline, yytext());
            }
          case 74: break;
          case 21: 
            { yybegin(ANOTHERSTATE); System.out.println(yytext()); return new Symbol(SimbolosCP.inicio, yycolumn, yyline, yytext());
            }
          case 75: break;
          case 22: 
            { return new Symbol(SimbolosCP.strng, yycolumn, yyline, yytext());
            }
          case 76: break;
          case 23: 
            { return new Symbol(SimbolosCP.menorigual, yycolumn, yyline, yytext());
            }
          case 77: break;
          case 24: 
            { return new Symbol(SimbolosCP.mayorigual, yycolumn, yyline, yytext());
            }
          case 78: break;
          case 25: 
            { return new Symbol(SimbolosCP.menguar, yycolumn, yyline, yytext());
            }
          case 79: break;
          case 26: 
            { return new Symbol(SimbolosCP.igualmenos, yycolumn, yyline, yytext());
            }
          case 80: break;
          case 27: 
            { yybegin(YYINITIAL); System.out.println(yytext()); return new Symbol(SimbolosCP.ultimo, yycolumn, yyline, yytext());
            }
          case 81: break;
          case 28: 
            { return new Symbol(SimbolosCP.comparar, yycolumn, yyline, yytext());
            }
          case 82: break;
          case 29: 
            { return new Symbol(SimbolosCP.igualmas, yycolumn, yyline, yytext());
            }
          case 83: break;
          case 30: 
            { return new Symbol(SimbolosCP.aumento, yycolumn, yyline, yytext());
            }
          case 84: break;
          case 31: 
            { return new Symbol(SimbolosCP.igualpor, yycolumn, yyline, yytext());
            }
          case 85: break;
          case 32: 
            { return new Symbol(SimbolosCP.noes, yycolumn, yyline, yytext());
            }
          case 86: break;
          case 33: 
            { return new Symbol(SimbolosCP.and, yycolumn, yyline, yytext());
            }
          case 87: break;
          case 34: 
            { return new Symbol(SimbolosCP.or, yycolumn, yyline, yytext());
            }
          case 88: break;
          case 35: 
            { return new Symbol(SimbolosCP.numdecimal, yycolumn, yyline, yytext());
            }
          case 89: break;
          case 36: 
            { return new Symbol(SimbolosCP.car, yycolumn, yyline, yytext());
            }
          case 90: break;
          case 37: 
            { return new Symbol(SimbolosCP.entero, yycolumn, yyline, yytext());
            }
          case 91: break;
          case 38: 
            { return new Symbol(SimbolosCP.tipo, yycolumn, yyline, yytext());
            }
          case 92: break;
          case 39: 
            { return new Symbol(SimbolosCP.caracter, yycolumn, yyline, yytext());
            }
          case 93: break;
          case 40: 
            { return new Symbol(SimbolosCP.texto, yycolumn, yyline, yytext());
            }
          case 94: break;
          case 41: 
            { return new Symbol(SimbolosCP.print, yycolumn, yyline, yytext());
            }
          case 95: break;
          case 42: 
            { return new Symbol(SimbolosCP.clase, yycolumn, yyline, yytext());
            }
          case 96: break;
          case 43: 
            { return new Symbol(SimbolosCP.score, yycolumn, yyline, yytext());
            }
          case 97: break;
          case 44: 
            { return new Symbol(SimbolosCP.doble, yycolumn, yyline, yytext());
            }
          case 98: break;
          case 45: 
            { return new Symbol(SimbolosCP.result, yycolumn, yyline, yytext());
            }
          case 99: break;
          case 46: 
            { return new Symbol(SimbolosCP.clases, yycolumn, yyline, yytext());
            }
          case 100: break;
          case 47: 
            { return new Symbol(SimbolosCP.nombre, yycolumn, yyline, yytext());
            }
          case 101: break;
          case 48: 
            { return new Symbol(SimbolosCP.cadena, yycolumn, yyline, yytext());
            }
          case 102: break;
          case 49: 
            { return new Symbol(SimbolosCP.metodos, yycolumn, yyline, yytext());
            }
          case 103: break;
          case 50: 
            { return new Symbol(SimbolosCP.bool, yycolumn, yyline, yytext());
            }
          case 104: break;
          case 51: 
            { return new Symbol(SimbolosCP.funcion, yycolumn, yyline, yytext());
            }
          case 105: break;
          case 52: 
            { return new Symbol(SimbolosCP.variables, yycolumn, yyline, yytext());
            }
          case 106: break;
          case 53: 
            { return new Symbol(SimbolosCP.parametros, yycolumn, yyline, yytext());
            }
          case 107: break;
          case 54: 
            { return new Symbol(SimbolosCP.comentarios, yycolumn, yyline, yytext());
            }
          case 108: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
