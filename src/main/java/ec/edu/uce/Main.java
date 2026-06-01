package ec.edu.uce;

import java.time.LocalTime;

import ec.edu.uce.application.service.ProfesorService;
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
        private ProfesorService profesorService;

        @Override
        public int run(String... args) {

            System.out.println("--- Iniciando Pruebas de Profesores ---");

        
           /* profesorService.consultarPorMateriaTyped("Literatura");
            profesorService.consultarPorCorreoTyped("emilioch@gmail.com");
            profesorService.consultarPorHoraTyped(LocalTime.of(6, 45), LocalTime.of(13, 35));
            profesorService.contarProfesores();*/

            //Native Query
            System.out.println("--- Consultando todas las materias con Native Query ---");
            profesorService.consultarTodasMateriasNative();
            profesorService.consultarTodosProfesores();

            return 0;

        }
    }
}