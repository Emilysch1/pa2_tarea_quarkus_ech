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
        private SoporteServicio soporteService;

        @Override
        public int run(String... args) {

            TicketSoporte ticket = new TicketSoporte(
                    "HP",
                    "Pantalla",
                    100);

            this.soporteService.procesar(ticket);

            return 0;
        }
    }
}