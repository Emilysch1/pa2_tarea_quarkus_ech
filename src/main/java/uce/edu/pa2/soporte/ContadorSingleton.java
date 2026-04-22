package uce.edu.pa2.soporte;

import jakarta.inject.Singleton;

@Singleton
public class ContadorSingleton {

    private int contador = 0;

    public int generarTicket() {
    
        return ++contador;
       
    }

}
