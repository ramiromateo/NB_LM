/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author sebas
 */
public class Lista<T> {

    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int longitud;

    public Lista() {
        cabeza = null;
        cola = null;
        longitud = 0;
    }

    public void insertar(T objeto) {
        Nodo<T> nuevo = new Nodo(objeto);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            longitud++;
        } else {
            Nodo<T> aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(nuevo);
        }
    }

    public boolean pertenece(T entrada) {
        Nodo<T> back, front;
        boolean exit = false;
        for (front = this.getCabeza(), back = this.getCola();
                !exit; back = back.getAnterior(), front = front.getSiguiente()) {
            if (entrada.equals(back.getObjeto()) || entrada.equals(front.getObjeto())) {
                return true;
            }
            if (front == back || front == back.getAnterior()) {
                exit = true;
            }
        }
        return false;
    }

    public boolean pertenece(String entrada) {
        if (this.cabeza != null) {
            Nodo<T> back, front;
            boolean exit = false;
            for (front = this.getCabeza(), back = this.getCola();
                    !exit; back = back.getAnterior(), front = front.getSiguiente()) {
                if (back.getObjeto().equals(entrada) || front.getObjeto().equals(entrada)) {
                    return true;
                }
                if (front == back || front == back.getAnterior()) {
                    exit = true;
                }
            }
        }
        return false;
    }

    public T getObjeto(Object obj) {
        Nodo<T> aux;
        for (aux = this.getCabeza(); aux != null; aux = aux.getSiguiente()) {
            if (aux.getObjeto().equals(obj)) {
                return aux.getObjeto();
            }
        }
        return null;
    }

    public class Nodo<G> {

        private G objeto;
        private Nodo<G> siguiente;
        private Nodo<G> anterior;

        public Nodo(G objeto) {
            this.objeto = objeto;
            siguiente = null;
            anterior = null;
        }

        /**
         * @return the objeto
         */
        public G getObjeto() {
            return objeto;
        }

        /**
         * @param objeto the objeto to set
         */
        public void setObjeto(G objeto) {
            this.objeto = objeto;
        }

        /**
         * @return the siguiente
         */
        public Nodo<G> getSiguiente() {
            return siguiente;
        }

        /**
         * @param siguiente the siguiente to set
         */
        public void setSiguiente(Nodo<G> siguiente) {
            this.siguiente = siguiente;
        }

        /**
         * @return the anterior
         */
        public Nodo<G> getAnterior() {
            return anterior;
        }

        /**
         * @param anterior the anterior to set
         */
        public void setAnterior(Nodo<G> anterior) {
            this.anterior = anterior;
        }

    }

    /**
     * @return the cabeza
     */
    public Nodo<T> getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @return the cola
     */
    public Nodo<T> getCola() {
        return cola;
    }

    /**
     * @param cola the cola to set
     */
    public void setCola(Nodo<T> cola) {
        this.cola = cola;
    }

    /**
     * @return the longitud
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}
