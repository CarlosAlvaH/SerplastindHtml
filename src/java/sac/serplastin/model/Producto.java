/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sac.serplastin.model;

public class Producto {
    private String codigo;
    private String nombre;
    private String categoria;
    private String dimension;
    private String descripcion;
    private String codMold;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String categoria, String dimension, String descripcion, String codMold) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.dimension = dimension;
        this.descripcion = descripcion;
        this.codMold = codMold;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodMold() {
        return codMold;
    }

    public void setCodMold(String codMold) {
        this.codMold = codMold;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", categoria=" + categoria + ", dimension=" + dimension + ", descripcion=" + descripcion + ", codMold=" + codMold + '}';
    }
    
    public Object[] getDatosObjects(){
        Object[] datos= {codigo,nombre,categoria,dimension,descripcion,codMold};
        return datos;
    }


    
    
}
