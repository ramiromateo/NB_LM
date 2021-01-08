package WebService;

public class Libro {
    private int idLibro;
    private String titulo;
    private String autor;
    private int nuPaginas;
    private int ejemplares;
    private int idGenero;
    private int prestamos;
    
    public Libro(int idLibro,String titulo, String autor, int nuPaginas,int ejemplares,int idGenero){
        this.idLibro=idLibro;
        this.titulo=titulo;
        this.autor=autor;
        this.nuPaginas=nuPaginas;
        this.ejemplares=ejemplares;
        this.idGenero=idGenero;
        this.prestamos=0;
    }
    
    public int getIdLibro() {
        return idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public int getNuPaginas() {
        return nuPaginas;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getIdGenero() {
        return idGenero;
    }
    
    public int getPrestamos(){
        return prestamos;
    }
    
}
