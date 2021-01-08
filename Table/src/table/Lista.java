package table;



public class Lista<T> {
    Nodo<T> primero;
    Nodo<T> ultimo;
    
    public Lista(){
        this.primero=null;
        this.ultimo=null;
    }
    
   public void insertarLS(T objeto){
       if(primero==null)primero=ultimo=new Nodo<T>(objeto);
       else{
           ultimo.siguiente=new Nodo<T>(objeto);
           ultimo=ultimo.siguiente;
       }
   }
   
   public void insertarLD(T objeto){
       if(primero==null)primero=ultimo=new Nodo<T>(objeto);
       else{
           Nodo<T> nuevo=new Nodo<T>(objeto);
           ultimo.siguiente=nuevo;
           nuevo.anterior=ultimo;
           ultimo=nuevo;
       }
   }
   
   public void insertarLDC(T objeto){
       if(primero==null){
           primero=ultimo=new Nodo<T>(objeto);
           primero.anterior=primero.siguiente=primero;
       }
       else{
           Nodo<T> nuevo=new Nodo<T>(objeto);
           ultimo.siguiente=nuevo;
           nuevo.siguiente=primero;
           primero.anterior=nuevo;
           nuevo.anterior=ultimo;
           ultimo=nuevo;
       }
   }
   public void imprimir(){
      
   }
}
class Nodo<T>{
    public T objeto;
    public Nodo<T> anterior;
    public Nodo<T> siguiente;
    public Nodo(T objeto){
        this.objeto=objeto;
        this.siguiente=this.anterior=null;
    }
    
}