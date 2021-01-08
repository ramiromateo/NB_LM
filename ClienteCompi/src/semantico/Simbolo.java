/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semantico;

/**
 *
 * @author sebas
 */
public class Simbolo {

    private String tipo;
    private int linea;
    private String nombre;
    private Object valor;

    public Simbolo(String tipo, String nombre, int linea, Object valor) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.linea = linea;
        this.valor = valor;
    }

    public Simbolo() {
        tipo = "NULO";
        linea = 0;
        valor = "NULO";
    }

    public void igual(Expresion e) {
        this.setValor(e.getValor());
    }

    public void igualMas(Expresion e) {
        int val = (int) getValor();
        int val2 = (int) e.getValor();
        setValor(val + val2);
    }

    public void igualMenos(Expresion e) {
        int val = (int) getValor();
        int val2 = (int) e.getValor();
        setValor(val - val2);
    }

    public void igualPor(Expresion e) {
        int val = (int) getValor();
        int val2 = (int) e.getValor();
        setValor(val * val2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Simbolo) {
            Simbolo entrada = (Simbolo) obj;
            if (entrada.getNombre().equalsIgnoreCase(this.getNombre())) {
                return true;
            }
        }
        if (obj instanceof String) {
            String entrada = (String) obj;
            if (entrada.equalsIgnoreCase(this.getNombre())) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the linea
     */
    public int getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(int linea) {
        this.linea = linea;
    }

    /**
     * @return the valor
     */
    public Object getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Object valor) {
        this.valor = valor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Expresion getExp() {
        return new Expresion(tipo, valor, linea);
    }

}
