package uce.edu.pa2.soporte;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class MotoRecargo implements Recargo {
    
    @Override
    public double aplicar(double valor) {
        return valor +(valor * 0.10); 
    }

    @Override
    public String obtenerTipo() {
        return "Moto";
    }

}
