package WebService;

public class Librera {
    private int idLibreria;
    private String genero;
    private int cantidaLibros;
    private int niveles;
    
    
    public Librera(int idLibreria,String genero){
        this.idLibreria=idLibreria;
        this.genero=genero;
        cantidaLibros=0;
        niveles=0;
    }

    public int getIdLibreria() {
        return idLibreria;
    }

    public String getGenero() {
        return genero;
    }

    public int getCantidaLibros() {
        return cantidaLibros;
    }

    public void aumentarCantidaLibros() {
        this.cantidaLibros++;
    }

    public int getNiveles() {
        return niveles;
    }

    public void aumetarNiveles() {
        this.niveles++;
    }
}
