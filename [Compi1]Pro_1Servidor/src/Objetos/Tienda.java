package Objetos;

import java.io.Serializable;

public class Tienda implements Serializable{
    private Integer codigo;
    private Integer propietario;
    private String name;
    private String direccion;
    private Integer telefono;
    private String path;

    public Tienda(Integer codigo, Integer propietario, String name, String direccion, Integer telefono, String path) {
        this.codigo = codigo;
        this.propietario = propietario;
        this.name = name;
        this.direccion = direccion;
        this.telefono = telefono;
        this.path = path;
    }
    public Tienda() {
        this.codigo = 0;
        this.propietario =0;
        this.name = "";
        this.direccion = "";
        this.telefono = 0;
        this.path = "";
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getPropietario() {
        return propietario;
    }

    public void setPropietario(Integer propietario) {
        this.propietario = propietario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
