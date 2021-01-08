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
public class Expresion {

    private Object valor;
    private String tipo;
    private int fila;

    public Expresion(String tipo, Object valor, int fila) {
        this.valor = valor;
        this.tipo = tipo;
        this.fila = fila;
    }

    public Expresion() {
        valor = "nulo";
        tipo = "NULO";
        fila = 0;
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
     * @return the fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    public static Expresion sumar(Object izquierdo, Object derecho) {
        Expresion izquierda = (Expresion) izquierdo;
        System.out.println("TIPO: _" + izquierda.getTipo() +"_");
        Expresion derecha = (Expresion) derecho;
        System.out.println("Tipo _" + derecha.getTipo() +"_");
        if (izquierda.getTipo().equals("ERROR_NULO") || derecha.getTipo().equals("ERROR_NULO")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR") || derecha.getTipo().equals("ERROR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getValor().toString().equals("NULO") || derecha.getValor().toString().equals("NULO")) {
            return new Expresion("ERROR_NULO", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR_IGNORAR") || derecha.getTipo().equals("ERROR_IGNORAR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("cadena") || derecha.getTipo().equals("cadena")) {
            String resultado = "" + izquierda.getValor() + derecha.getValor();
            return new Expresion("cadena", resultado, 0);
        }
        if (izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("decimal")) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz + der;
            return new Expresion("decimal", "" + res, 0);
        }
        if ((izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("entero"))
                || (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("decimal"))) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz + der;
            return new Expresion("decimal", "" + res, 0);
        }
        if (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("entero")) {
            int iz = Integer.parseInt(izquierda.getValor().toString());
            int der = Integer.parseInt(derecha.getValor().toString());
            int res = iz + der;
            return new Expresion("decimal", "" + res, 0);
        }
        return new Expresion("ERROR", "NULO", 0);
    }

    public static Expresion restar(Object izquierdo, Object derecho) {
        Expresion izquierda = (Expresion) izquierdo;
        Expresion derecha = (Expresion) derecho;
        if (izquierda.getTipo().equals("ERROR_NULO") || derecha.getTipo().equals("ERROR_NULO")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR") || derecha.getTipo().equals("ERROR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getValor().toString().equals("NULO") || derecha.getValor().toString().equals("NULO")) {
            return new Expresion("ERROR_NULO", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR_IGNORAR") || derecha.getTipo().equals("ERROR_IGNORAR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("decimal")) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz - der;
            return new Expresion("decimal", "" + res, 0);
        }
        if ((izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("entero"))
                || (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("decimal"))) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz - der;
            return new Expresion("decimal", "" + res, 0);
        }
        if (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("entero")) {
            int iz = Integer.parseInt(izquierda.getValor().toString());
            int der = Integer.parseInt(derecha.getValor().toString());
            int res = iz - der;
            return new Expresion("decimal", "" + res, 0);
        }
        return new Expresion("ERROR", "NULO", 0);
    }

    public static Expresion dividir(Object izquierdo, Object derecho) {
        Expresion izquierda = (Expresion) izquierdo;
        Expresion derecha = (Expresion) derecho;
        if (izquierda.getTipo().equals("ERROR_NULO") || derecha.getTipo().equals("ERROR_NULO")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR") || derecha.getTipo().equals("ERROR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getValor().toString().equals("NULO") || derecha.getValor().toString().equals("NULO")) {
            return new Expresion("ERROR_NULO", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR_IGNORAR") || derecha.getTipo().equals("ERROR_IGNORAR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("decimal")) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz / der;
            return new Expresion("decimal", "" + res, 0);
        }
        if ((izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("entero"))
                || (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("decimal"))) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz / der;
            return new Expresion("decimal", "" + res, 0);
        }
        if (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("entero")) {
            int iz = Integer.parseInt(izquierda.getValor().toString());
            int der = Integer.parseInt(derecha.getValor().toString());
            int res = iz / der;
            return new Expresion("decimal", "" + res, 0);
        }
        return new Expresion("ERROR", "NULO", 0);
    }

    public static Expresion multiplicar(Object izquierdo, Object derecho) {
        Expresion izquierda = (Expresion) izquierdo;
        Expresion derecha = (Expresion) derecho;
        if (izquierda.getTipo().equals("ERROR_NULO") || derecha.getTipo().equals("ERROR_NULO")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR") || derecha.getTipo().equals("ERROR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getValor().toString().equals("NULO") || derecha.getValor().toString().equals("NULO")) {
            return new Expresion("ERROR_NULO", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR_IGNORAR") || derecha.getTipo().equals("ERROR_IGNORAR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("decimal")) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz * der;
            return new Expresion("decimal", "" + res, 0);
        }
        if ((izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("entero"))
                || (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("decimal"))) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz * der;
            return new Expresion("decimal", "" + res, 0);
        }
        if (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("entero")) {
            int iz = Integer.parseInt(izquierda.getValor().toString());
            int der = Integer.parseInt(derecha.getValor().toString());
            int res = iz * der;
            return new Expresion("decimal", "" + res, 0);
        }
        return new Expresion("ERROR", "NULO", 0);
    }

    public static Expresion modulo(Object izquierdo, Object derecho) {
        Expresion izquierda = (Expresion) izquierdo;
        Expresion derecha = (Expresion) derecho;
        if (izquierda.getTipo().equals("ERROR_NULO") || derecha.getTipo().equals("ERROR_NULO")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR") || derecha.getTipo().equals("ERROR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getValor().toString().equals("NULO") || derecha.getValor().toString().equals("NULO")) {
            return new Expresion("ERROR_NULO", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR_IGNORAR") || derecha.getTipo().equals("ERROR_IGNORAR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("decimal")) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz % der;
            return new Expresion("decimal", "" + res, 0);
        }
        if ((izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("entero"))
                || (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("decimal"))) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz % der;
            return new Expresion("decimal", "" + res, 0);
        }
        if (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("entero")) {
            int iz = Integer.parseInt(izquierda.getValor().toString());
            int der = Integer.parseInt(derecha.getValor().toString());
            int res = iz % der;
            return new Expresion("decimal", "" + res, 0);
        }
        return new Expresion("ERROR", "NULO", 0);
    }

    public static Expresion negativo(Object izquierdo, Object derecho) {
        Expresion izquierda = (Expresion) izquierdo;
        Expresion derecha = (Expresion) derecho;
        if (izquierda.getTipo().equals("ERROR_NULO") || derecha.getTipo().equals("ERROR_NULO")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR") || derecha.getTipo().equals("ERROR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getValor().toString().equals("NULO") || derecha.getValor().toString().equals("NULO")) {
            return new Expresion("ERROR_NULO", "NULL", 0);
        }
        if (izquierda.getTipo().equals("ERROR_IGNORAR") || derecha.getTipo().equals("ERROR_IGNORAR")) {
            return new Expresion("ERROR_IGNORAR", "NULL", 0);
        }
        if (izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("decimal")) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz % der;
            return new Expresion("decimal", "" + res, 0);
        }
        if ((izquierda.getTipo().equals("decimal") && derecha.getTipo().equals("entero"))
                || (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("decimal"))) {
            double iz = Double.parseDouble(izquierda.getValor().toString());
            double der = Double.parseDouble(derecha.getValor().toString());
            double res = iz % der;
            return new Expresion("decimal", "" + res, 0);
        }
        if (izquierda.getTipo().equals("entero") && derecha.getTipo().equals("entero")) {
            int iz = Integer.parseInt(izquierda.getValor().toString());
            int der = Integer.parseInt(derecha.getValor().toString());
            int res = iz % der;
            return new Expresion("decimal", "" + res, 0);
        }
        return new Expresion("ERROR", "NULO", 0);
    }

}
