
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Feb 20 01:01:16 GMT-12:00 2019
//----------------------------------------------------

package Analizador;

import java_cup.runtime.Symbol;
import java.util.LinkedList;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Feb 20 01:01:16 GMT-12:00 2019
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\007\000\002\002\004\000\002\002\003\000\002\004" +
    "\005\000\002\004\003\000\002\003\003\000\002\003\004" +
    "\000\002\003\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\006\004\010\006\007\001\002\000\010\002" +
    "\ufffe\005\ufffe\007\ufffe\001\002\000\004\002\016\001\002" +
    "\000\006\002\000\005\014\001\002\000\010\004\010\006" +
    "\007\007\011\001\002\000\010\002\ufffd\005\ufffd\007\ufffd" +
    "\001\002\000\010\002\ufffc\005\ufffc\007\ufffc\001\002\000" +
    "\006\005\014\007\013\001\002\000\010\002\ufffb\005\ufffb" +
    "\007\ufffb\001\002\000\006\004\010\006\007\001\002\000" +
    "\010\002\uffff\005\uffff\007\uffff\001\002\000\004\002\001" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\010\002\004\003\003\004\005\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\003\004\011\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\003\014" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible

    
    
    public void syntax_error(Symbol s){
        System.out.println("Error R de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
        //Inicio.lisErrores.add("Error de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1)+" Se esperaba otro token\n");       
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error NR de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
    }
    

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

//Codigo de usuario
    

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // L ::= Tkn_CorA E Tkn_CorC 
            {
              String RESULT =null;
		int stleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int stright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList<String> st = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                            if(st.size()>=2){
            String ini=st.removeLast();
            String fin=st.removeFirst();
            st.addFirst(ini);
            st.addLast(fin);
        }
        String Resultado="[";
        for(String cad : st){

            Resultado+=cad+((cad.equals(st.getLast()))?"":",");
        }
        Resultado+="]";
        
        RESULT=Resultado;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // L ::= Tkn_CorA Tkn_CorC 
            {
              String RESULT =null;
		RESULT="[]";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // L ::= ENTERO 
            {
              String RESULT =null;
		int entleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int entright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String ent = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=ent;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("L",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // E ::= L 
            {
              LinkedList<String> RESULT =null;
		int lileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int liright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String li = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new LinkedList<>(); RESULT.add(li);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // E ::= E Tkn_Coma L 
            {
              LinkedList<String> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		LinkedList<String> list = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int lileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int liright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String li = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=list; RESULT.add(li);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("E",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= E 
            {
              String RESULT =null;
		int stleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int stright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		LinkedList<String> st = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println(st.get(0));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

