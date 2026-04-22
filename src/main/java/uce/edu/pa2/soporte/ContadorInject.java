package uce.edu.pa2.soporte;

import jakarta.enterprise.context.Dependent;

@Dependent
public class ContadorInject {

    private int contador = 0;

    public int generarTicket() {
  
        return ++contador;
       
    }

}
