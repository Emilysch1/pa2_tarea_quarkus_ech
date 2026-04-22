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
        private ContadorAplication contadorAplication;

        @Inject
        private ContadorInject contadorInject;

        @Inject
        private ContadorSingleton contadorSingleton;

        @Inject
        private ClaseIntermedia claseIntermedia;

        @Override
        public int run(String... args) {

            System.out.println("------- APPLICATION -------");
            System.out.println(this.contadorAplication);
            System.out.println("Ticket: " + this.contadorAplication.generarTicket());
            System.out.println("Ticket: " + this.contadorAplication.generarTicket());
            System.out.println("Ticket: " + this.contadorAplication.generarTicket());

            this.claseIntermedia.imprimirObjetoValor();

            System.out.println("\n------- DEPENDENT -------");
            System.out.println(this.contadorInject);
            System.out.println("Ticket: " + this.contadorInject.generarTicket());
            System.out.println("Ticket: " + this.contadorInject.generarTicket());
            System.out.println("Ticket: " + this.contadorInject.generarTicket());

            this.claseIntermedia.imprimirObjetoValorInject();

            System.out.println("\n------- SINGLETON -------");
            System.out.println(this.contadorSingleton);
            System.out.println("Ticket: " + this.contadorSingleton.generarTicket());
            System.out.println("Ticket: " + this.contadorSingleton.generarTicket());
            System.out.println("Ticket: " + this.contadorSingleton.generarTicket());

     
            this.claseIntermedia.imprimirObjetoValorSingleton();

            return 0;
        }
    }
}