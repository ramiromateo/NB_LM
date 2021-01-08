package WebService;

public class Estudiante {
    private int carne;
    private String nombre;
    private String apellido;
    private int semestre;
    
    public Estudiante(int carne, String nombre, String apellido,int semestre){
        this.carne=carne;
        this.nombre=nombre;
        this.apellido=apellido;
        this.semestre=semestre;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
