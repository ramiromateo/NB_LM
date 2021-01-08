package finalcompi1;

import java.util.LinkedList;

public class Arbol {
         private String name;
         private String tipo;
         private String valu;
         private String linea;
         private String columna;
         private LinkedList<Arbol> hijos;

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }
         

    public Arbol() {
        this.name = "";
        this.tipo = "";
        this.valu = "";
        this.hijos = new LinkedList<>();
    }
    public Arbol(String name,String linea,String columna,String Value) {
        this.name = name;
        this.tipo = "";
        this.valu = Value;
        this.linea=linea;
        this.columna=columna;
        this.hijos = new LinkedList<>();
    }
    public  Arbol addHijo(Arbol ar){
             this.hijos.add(ar);
             return ar;
    }     
    public int getCantidadHijos(){
        return this.hijos.size();
    }
    public Arbol getHijoAt(int i){
       return this.hijos.get(i);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValu() {
        return valu;
    }

    public void setValu(String valu) {
        this.valu = valu;
    }

    public LinkedList<Arbol> getHijos() {
        return hijos;
    }

    public void setHijos(LinkedList<Arbol> hijos) {
        this.hijos = hijos;
    }
    
}
