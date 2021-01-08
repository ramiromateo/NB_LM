package c1.practica1;

public class Encabezado {
    public static String estiloDato="";
    public static String estiloContenido="";
    public static String logo="";
    private String posicion;
    private String Dato;
    private String Contenido;

    public Encabezado(String posicion, String Dato, String Contenido) {
        this.posicion = posicion;
        this.Dato = Dato;
        this.Contenido = Contenido;
    }

    public String getPosicion() {
        return posicion;
    }
    
    public String getContenido() {
        return Contenido;
    }

    public String getDato() {
        return Dato;
    }
}
