package uce.edu.pa2.soporte;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SoporteServicio {

    @Inject
    private CalculadoraImpuestos calculadora;

    public void procesar(TicketSoporte t) {
        System.out.println("---SISTEMA DE SOPORTE TECNICO--- ");
        System.out.println("Equipo: " + t.getEquipo());
        System.out.println("Componente: " + t.getComponente());
        System.out.println("Valor: " + t.getCostoBase());
        
        double total = calculadora.calcular(t.getCostoBase());
        System.out.println("----Valor total----");
        System.out.println("Costo total: " + total);

    }
}