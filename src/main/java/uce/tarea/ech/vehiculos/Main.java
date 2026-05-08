package uce.tarea.ech.vehiculos;

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
           
            
            this.procesadorVehiculoService.procesar(veh1);
    
            return 0;

        }
    }
}
