/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

/**
 *
 * @author José
 */
 public class Empleado {
    private int registro;
    private String nombres;
    private String apellidos;
    private int identificacion;
    private String contrasena;

    public Empleado(int registro,String nombres,String apellidos,int identificacion, String contrasena){
        this.registro=registro;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.identificacion=identificacion;
        this.contrasena=contrasena;
    }
    
    public int getRegistro() {
        return registro;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getContrasena() {
        return contrasena;
    }
    
}


