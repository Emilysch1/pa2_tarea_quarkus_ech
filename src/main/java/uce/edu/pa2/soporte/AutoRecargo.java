package uce.edu.pa2.soporte;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class AutoRecargo implements Recargo {
    
    @Override
    public double aplicar(double valor) {
        return valor +(valor * 0.05); 
    }

    @Override
    public String obtenerTipo() {
        return "Auto";
    }

}
