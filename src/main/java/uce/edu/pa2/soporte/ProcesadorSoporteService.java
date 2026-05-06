package uce.edu.pa2.soporte;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorSoporteService {

    @Inject
    private Instance<Impuestos> impuestos; 

    public void procesar(TicketSoporte ticket) {

        double total = ticket.getCostoBase();

        System.out.println("---- DETALLE IMPUESTOS ----");

        for (Impuestos imp : impuestos) {

            double valor = imp.calcular(ticket.getCostoBase());
            total += valor;

            System.out.println(imp.getNombre() + ": $" + valor);
        }

        ticket.setTotal(total);

        System.out.println("Total a pagar con impuestos: $" + ticket.getTotal());
    }
}