package uce.edu.pa2.soporte;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoIVA implements Impuestos {

    @Override
    public double calcular(double monto) {
        return monto * 0.12;
    }

    @Override
    public String getNombre() {
        return "Impuesto IVA 12%";
    }
}