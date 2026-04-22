package uce.edu.pa2.soporte;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClaseIntermedia {

 @Inject
    private ContadorAplication contadorAplication;

    @Inject
    private ContadorInject contadorInject;

    @Inject
    private ContadorSingleton contadorSingleton;

    public void imprimirObjetoValor() {
        System.out.println(this.contadorAplication);
        System.out.println("Ticket: " + this.contadorAplication.generarTicket());
    }

    public void imprimirObjetoValorInject() {
        System.out.println(this.contadorInject);
        System.out.println("Ticket: " + this.contadorInject.generarTicket());
    }

    public void imprimirObjetoValorSingleton() {
        System.out.println(this.contadorSingleton);
        System.out.println("Ticket: " + this.contadorSingleton.generarTicket());
    }
}
