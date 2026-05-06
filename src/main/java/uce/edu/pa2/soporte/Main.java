package uce.edu.pa2.soporte;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorSoporteService procesador;

        @Override
        public int run(String... args) {

            System.out.println("**** SISTEMA DE SOPORTE ****");

            TicketSoporte ticket = new TicketSoporte("Laptop", "GPU", 200);

            procesador.procesar(ticket);

            return 0;
        }
    }
}