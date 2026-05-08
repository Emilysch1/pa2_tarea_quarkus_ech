package uce.tarea.ech.vehiculos;

public class Vehiculos {

    private String propietario;
    private String tipo;
    private Double valorBase;
    private Double total;

    public Vehiculos(String propietario, String tipo, Double valorBase) {
        this.propietario = propietario;
        this.tipo = tipo;
        this.valorBase = valorBase;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
