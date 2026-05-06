package uce.edu.pa2.soporte;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoRecargoServicio implements Impuestos {

    @Override
    public double calcular(double monto) {
        return monto * 0.05;
    }

    @Override
    public String getNombre() {
        return "Recargo de Servicio 5%";
    }

}
