package Objetos;

import java.io.Serializable;

public class Producto implements Serializable {
    private Integer codigo;
    private String name;
    private Float cantidad;
    private String marca;
    private String color;
    private Float tamano;
    private String path;
    private Integer sucursal;
    private Float precio;

    public Producto(Integer codigo, String name, Float cantidad, String marca, String color, Float tamano, String path, Integer sucursal,Float precio) {
        this.codigo = codigo;
        this.name = name;
        this.cantidad = cantidad;
        this.marca = marca;
        this.color = color;
        this.tamano = tamano;
        this.path = path;
        this.sucursal = sucursal;
        this.precio=precio;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getTamano() {
        return tamano;
    }

    public void setTamano(Float tamano) {
        this.tamano = tamano;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getSucursal() {
        return sucursal;
    }

    public void setSucursal(Integer sucursal) {
        this.sucursal = sucursal;
    }
    
}
