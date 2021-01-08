/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.io.Serializable;
import javax.swing.JTextArea;

public class ListaArchivo implements Serializable {

    private String titulo;
    private NodoArchivo cabeza;
    private int longitud;

    public ListaArchivo() {
        this.titulo = "";
        this.cabeza = null;
        this.longitud = 0;
    }

    public void insertar(String ruta) {
        NodoArchivo nuevo = new NodoArchivo(ruta);
        if (this.getCabeza() == null) {
            setCabeza(nuevo);
            longitud++;
        } else {
            NodoArchivo aux = this.getCabeza();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            longitud++;
        }
    }
    
    public boolean esVacia() {
        return (cabeza == null);
    }

    public void vaciar() {
        this.titulo = "";
        this.cabeza = null;
        this.longitud = 0;
    }

    public void print(JTextArea area) {
        NodoArchivo aux;
        for (aux = this.getCabeza(); aux != null; aux = aux.getSiguiente()) {
            area.append(aux.getArchivo() + "\n");
        }
        area.append("\n");
    }

    public NodoArchivo getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoArchivo cabeza) {
        this.cabeza = cabeza;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /*          CLASE NODO             */
    public class NodoArchivo implements Serializable{

        private String archivo;
        private NodoArchivo siguiente;
        private NodoArchivo anterior;

        public NodoArchivo(String archivo) {
            this.archivo = archivo;
            this.siguiente = null;
            this.anterior = null;
        }

        public String getArchivo() {
            return archivo;
        }

        public void setArchivo(String archivo) {
            this.archivo = archivo;
        }

        public NodoArchivo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(NodoArchivo siguiente) {
            this.siguiente = siguiente;
        }

        public NodoArchivo getAnterior() {
            return anterior;
        }

        public void setAnterior(NodoArchivo anterior) {
            this.anterior = anterior;
        }

    }

}
