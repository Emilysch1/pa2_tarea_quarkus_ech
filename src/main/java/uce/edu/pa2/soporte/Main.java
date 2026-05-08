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
        private ProcesadorVehiculoService procesadorVehiculoService;

        @Override
        public int run(String... args) throws Exception {

            Vehiculos veh1 = new Vehiculos("Juan Perez", "Camion", Double.valueOf(200));
            Vehiculos veh2 = new Vehiculos("Maria Gomez", "Auto", Double.valueOf(150));
            Vehiculos veh3 = new Vehiculos("Carlos Ruiz", "Moto", Double.valueOf(100));

            this.procesadorVehiculoService.procesar(veh1);
            this.procesadorVehiculoService.procesar(veh2);
            this.procesadorVehiculoService.procesar(veh3);

            return 0;

        }
    }
}