
package sac.serplastin.model;

public class Molde {
    private String codigo;
    private String tipo;
    private String fechaFabri;
    private String codMate;
    private String codColab;

    public Molde() {
    }

    public Molde(String codigo, String tipo, String fechaFabri, String codMate, String codColab) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.fechaFabri = fechaFabri;
        this.codMate = codMate;
        this.codColab = codColab;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaFabri() {
        return fechaFabri;
    }

    public void setFechaFabri(String fechaFabri) {
        this.fechaFabri = fechaFabri;
    }

    public String getCodMate() {
        return codMate;
    }

    public void setCodMate(String codMate) {
        this.codMate = codMate;
    }

    public String getCodColab() {
        return codColab;
    }

    public void setCodColab(String codColab) {
        this.codColab = codColab;
    }

    @Override
    public String toString() {
        return "Molde{" + "codigo=" + codigo + ", tipo=" + tipo + ", fechaFabri=" + fechaFabri + ", codMate=" + codMate + ", codColab=" + codColab + '}';
    }
    
    public Object[] getDatosObjects(){
        Object[] datos= {codigo,tipo,fechaFabri,codMate,codColab};
        return datos;
    }
}
