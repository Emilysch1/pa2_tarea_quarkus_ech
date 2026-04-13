package uce.edu.pa2.soporte;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculadoraImpuestos {

 public double calcular(double base) {
        double total = base * 1.12;
        return Math.round(total * 100.0) / 100.0;
    }

}
