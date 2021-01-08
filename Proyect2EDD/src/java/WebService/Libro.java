package WebService;

public class Libro {
    private int idLibro;
    private String titulo;
    private String autor;
    private int nuPaginas;
    private int ejemplares;
    private int numeroPrestados;
    private int idGenero;

    public Libro(int idLibro,String titulo,String autor,int nuPaginas, int ejemplares,int idGenero){
        this.idLibro=idLibro;
        this.titulo=titulo;
        this.autor=autor;
        this.nuPaginas=nuPaginas;
        this.ejemplares=ejemplares;
        this.idGenero=idGenero;
        this.numeroPrestados=0;
    }
    /**
     * @return the idLibro
     */
    public int getIdLibro() {
        return idLibro;
    }

    /**
     * @param idLibro the idLibro to set
     */
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the nuPaginas
     */
    public int getNuPaginas() {
        return nuPaginas;
    }

    /**
     * @return the ejemplares
     */
    public int getEjemplares() {
        return ejemplares;
    }

    /**
     * @return the idGenero
     */
    public int getIdGenero() {
        return idGenero;
    }

    /**
     * @param idGenero the idGenero to set
     */
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }
    
    public void aumentarEjemplares(){
        this.ejemplares++;
    }
    public int getNumeroPrestados(){
        return this.numeroPrestados;
    }
    public void aumentarPrestados(){
        this.numeroPrestados++;
    }
    
}
