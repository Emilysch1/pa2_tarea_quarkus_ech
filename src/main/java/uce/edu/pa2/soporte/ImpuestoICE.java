package uce.edu.pa2.soporte;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoICE implements Impuestos {

    @Override
    public double calcular(double monto) {
        return monto * 0.15;
    }

    @Override
    public String getNombre() {
        return "Impuesto ICE 15%";
    }

}
