package uce.edu.pa2.soporte;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ContadorAplication {

    private int contador = 0;

    public int generarTicket() {
    
        return ++contador;
       
    }


}
