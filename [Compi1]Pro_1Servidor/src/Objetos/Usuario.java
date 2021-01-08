package Objetos;

import java.io.Serializable;

public class Usuario implements Serializable{
    private Integer id;
    private String name;
    private String apellido;
    private String password;
    private Integer telefono;
    private String correo;
    private String direccion;

    public Usuario(Integer id, String name, String apellido, String password, Integer telefono, String correo, String direccion) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
        this.password = password;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }
    public Usuario() {
        this.id = 0;
        this.name = "";
        this.apellido = "";
        this.password = "";
        this.telefono = 0;
        this.correo = "";
        this.direccion = "";
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
