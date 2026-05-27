package ec.edu.uce;
import ec.edu.uce.application.service.ProfesorService;
import ec.edu.uce.domain.model.Profesor;
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
            System.out.println("\n=== INICIANDO PRUEBAS EN LA BASE DE DATOS ===");

            // 1. GUARDAR (CREAR)
            System.out.println("\n--- 1. Insertando nuevo profesor ---");
            Profesor profesor = new Profesor();
            profesor.setNombre("Carlos");
            profesor.setApellido("Tambo");
            profesor.setMateria("CCSS");

            this.profesorService.guardar(profesor);
            Integer idGenerado = profesor.getId();
            System.out.println("¡Profesor guardado exitosamente con ID: " + idGenerado + "!");

            // 2. BUSCAR -> Buscamos al que acabamos de crear (ID 4)
            System.out.println("\n--- 2. Buscando al profesor recién creado ---");
            this.profesorService.buscarPorId(idGenerado);

            // Buscar id creados
            Integer idParaBuscar = 2;

            System.out.println("\n--- 2.1. Buscando un ID personalizado ---");
            System.out.println("Consultando los datos del ID: " + idParaBuscar);
            this.profesorService.buscarPorId(idParaBuscar);

            // 3. ACTUALIZAR UN ID ESPECÍFICO

            Integer idParaActualizar = 1;

            System.out.println("\n--- 3. Actualizando el nombre del profesor con ID: " + idParaActualizar + " ---");
            this.profesorService.actualizar(idParaActualizar, "Emilio");

            System.out.println("Verificando cambio en la base de datos:");
            this.profesorService.buscarPorId(idParaActualizar);

         
            return 0;
        }
    }
}