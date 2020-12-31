package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        System.out.println(JavaApplication1.secuenciadeLlaves("{}"));
        Lista list2 = null;
        try{list2.estaVacia();}catch(Exception e){
        e.printStackTrace();
        }
    }
    
    public static boolean secuenciadeLlaves(String str){
        Lista list=new Lista();
        int i=0;
        while(i<str.length()){
            list.insertar_Final(str.charAt(i));
            i++;
        }
        while(!list.estaVacia() &&(char)list.inicio.dato=='{' && (char)list.fin.dato=='}'){
            list.remover_Final();list.remover_Frente();
        }
        return list.estaVacia();
    }
}
class Lista{
    public Nodo inicio;
    public Nodo fin;
    public String nombre;
    
    public Lista(String nombre){
        this.nombre = nombre;
        this.fin = this.inicio = null;
    }
    
    public Lista(){
       this.nombre = "MiLista"; 
       this.fin = this.inicio = null;
    }
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public void insertar_Frente(Object dato){
        if(estaVacia()){
            this.inicio = this.fin = new Nodo(dato);
            return;
        }
        inicio = new Nodo(dato, inicio);
        
    }
    
    public void insertar_Final(Object dato){
        if(estaVacia()){
            this.inicio = this.fin = new Nodo(dato);
            return;
        }
        fin.siguiente = new Nodo(dato);
        fin=fin.siguiente;
        
    }
    
    public void remover_Frente(){
        if(!estaVacia()){
            inicio = inicio.siguiente; 
            if(inicio==null) fin=null;
        }
    }
    
    public void remover_Final(){
        if(!estaVacia()){
            Nodo actual = inicio;
            Nodo anterior=null;
            if(actual.siguiente==null){
                fin=inicio=null;
                return;
            }
            while(actual.siguiente!=null){
                anterior=actual;
                actual=actual.siguiente;
            }
            fin=anterior;
            anterior.siguiente=null;
        }
    }
    
    
    public void mostrar(){
        if(!estaVacia()){
            Nodo pivote = inicio;
            while(pivote != null){
                System.out.println(((int)pivote.dato));
                pivote = pivote.siguiente;
            }
        }
    }
}

class Nodo{
    public Nodo siguiente;
    public Object dato;
    
    public Nodo(Object dato){
        this.dato = dato;
        this.siguiente = null;
    }
    
    public Nodo(Object dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public void setDato(Object dato){
        this.dato = dato;
    }
    
    public Object getDato(){
        return this.dato;
    }
    
    public Nodo getSiguiente(){
        return this.siguiente;
    }
    
}
