package uce.edu.pa2.soporte;

public class TicketSoporte {

    private String equipo;
    private String componente;
    private double costoBase;
    private double total;

    public TicketSoporte() {

    }

    public TicketSoporte(String equipo, String componente, double costoBase) {
        this.equipo = equipo;
        this.componente = componente;
        this.costoBase = costoBase;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    

}
