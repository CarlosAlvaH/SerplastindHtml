
package sac.serplastin.model;

public class Material {
    private String codigo;
    private String nombre;
    private String tipo;
    private String marca;
    private int stock;
    private double coste;

    public Material() {
    }

    public Material(String codigo, String nombre, String tipo, String marca, int stock, double coste) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.stock = stock;
        this.coste = coste;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "Material{" + "codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", marca=" + marca + ", stock=" + stock + ", coste=" + coste + '}';
    }

    public Object[] getDatosObjects(){
        Object[] datos= {codigo,nombre,tipo,marca,stock,coste};
        return datos;
    }
    
    
    
}
