package ec.edu.uce;

import java.util.ArrayList;
import ec.edu.uce.application.service.MedicoService;
import ec.edu.uce.application.service.PacienteService;
import ec.edu.uce.domain.model.Medico;
import ec.edu.uce.domain.model.Paciente;
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
        private MedicoService medicoService;

        @Inject
       private PacienteService pacienteService;

        @Override
        public int run(String... args) {
            System.out.println("====== INICIANDO TALLER MODELO MANY-TO-MANY ======");

            // 1. Crear y guardar Pacientes independientes
            Paciente paci1 = new Paciente();
            paci1.setNombre("Emily Chango");
            paci1.setEdad(21);
            this.pacienteService.guardar(paci1);

            Paciente paci2 = new Paciente();
            paci2.setNombre("Carlos Andrade");
            paci2.setEdad(25);
            this.pacienteService.guardar(paci2);

            // 2. Crear y guardar Médico con su lista inicializada
            Medico medico = new Medico();
            medico.setNombre("Dr. Segovia");
            medico.setPacientes(new ArrayList<>());
            
            // Usamos el método de tu servicio para registrar médicos
            this.medicoService.guardar(medico);

    

            System.out.println("\n====== PROCESO FINALIZADO CON ÉXITO ======");
            return 0;
        }
    }
}