package WebService;

public class Prestamo {
    private int codigoLibro;
    private int carneEstudiante;

    public Prestamo(int codigoLibro,int carneEstudiante){
        this.codigoLibro=codigoLibro;
        this.carneEstudiante=carneEstudiante;
    }
    
    public int getCodigoLibro() {
        return codigoLibro;
    }

    

    public int getCarneEstudiante() {
        return carneEstudiante;
    }

    
}
