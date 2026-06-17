package ec.edu.uce;

import ec.edu.uce.application.service.AutomovilService;
import ec.edu.uce.application.service.MotorService;
import ec.edu.uce.domain.model.Automovil;
import ec.edu.uce.domain.model.Motor;
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
        private MotorService motorservice;

        @Inject
        private AutomovilService automovilService;

        @Override
        public int run(String... args) {

            System.out.println("--- Iniciando ---");
            Motor m = new Motor();
            m.setNumeroSerie("BMW-V8-998877");
            m.setCilindraje("4.4L TwinPower");

  
            Automovil a = new Automovil();
            a.setMarca("BMW M5");
            a.setPlaca("PBA9876");
            a.setMotor(m);
            this.automovilService.guardar(a);

            System.out.println("--- Terminando ---");

            return 0;
        }
    }
}
