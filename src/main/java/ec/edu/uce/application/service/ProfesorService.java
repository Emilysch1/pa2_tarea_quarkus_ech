package ec.edu.uce.application.service;

import java.time.LocalTime;

import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.ProfesorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProfesorService {

    @Inject
    private ProfesorRepository profesorRepository;

    public void guardar(Profesor profesor) {
        this.profesorRepository.crear(profesor);
    }

    public Profesor buscarPorId(Integer id) {

        Profesor p = this.profesorRepository.seleccionarPorId(id);

        if (p != null) {
            System.out.println("Encontrado: " + p.getNombre() + " " + p.getApellido());
        } else {
            System.out.println("No se encontro ningun profesor con el ID " + id);
        }

        return p;
    }

    public void actualizar(Integer id, String nuevoNombre) {
        Profesor p = this.profesorRepository.seleccionarPorId(id);
        if (p != null) {
            p.setNombre(nuevoNombre);
            this.profesorRepository.actualizar(p);
        } else {
            System.out.println("No se pudo actualizar: profesor no encontrado.");
        }
    }

    public void eliminar(Integer id) {
        this.profesorRepository.eliminar(id);
    }

    public void listarTodos() {
        for (Profesor p : this.profesorRepository.seleccionarTodos()) {
            System.out.println(
                    p.getId() + ": " + p.getNombre() + " " + p.getApellido() + " - Materia: " + p.getMateria());
        }
    }

    public void consultarPorNombre(String nombre) {
        for (Profesor p : this.profesorRepository.seleccionarPorNombre(nombre)) {
            System.out
                    .println("Profesor encontrado: " + "\n" + p.getId() + ": " + p.getNombre() + " " + p.getApellido() +
                            " \nMateria: " + p.getMateria());
        }
    }


    public void consultarPorCorreoTyped(String correo) {
        for (Profesor p : this.profesorRepository.seleccionarPorCorreoTyped(correo)) {
            System.out.println(
                    "Profesor: " + p.getNombre() + " " + p.getApellido() + " - " + p.getCorreo());
        }
    }

    public void consultarPorHoraTyped(LocalTime horaInicio, LocalTime horaFin) {
        for (Profesor p : this.profesorRepository.seleccionarPorHoraTyped(horaInicio, horaFin)) {
            System.out.println(
                    "Profesor : " + p.getNombre() + " " + p.getApellido() + " - Horario: "
                            + p.getHoraInicio() + " a " + p.getHoraFin());
        }
    }

    public void contarProfesores() {
        Long total = this.profesorRepository.seleccionarContar();
        System.out.println("Total de profesores: " + total);
    }

    public void consultarTodasMateriasNative() {
        for (Profesor p : this.profesorRepository.seleccionarTodasMateriasNative()) {
            System.out.println("Materia: " + p.getMateria());
        }
    }

    public void consultarTodosProfesores() {
        for (Profesor p : this.profesorRepository.seleccionarTodosProfesores()) {
            System.out.println(
                    "Profesor: " + p.getNombre() + " " + p.getApellido());
        }
    }

    public void listarTodosCriteria() {
        for (Profesor p : this.profesorRepository.seleccionarTodosCriteria()) {
            System.out.println("Estudiante: " + p);
        }
    }

    public void consultarPorMateriaCriteria(String materia) {
        for (Profesor p : this.profesorRepository.seleccionarPorMateriaCriteria(materia)) {
            System.out.println("Criteria Materia: " + p);
        }
    }

    public void consultarDinamicoCriteria(String nombre, String apellido) {
        for (Profesor p : this.profesorRepository.seleccionarDinamicoCriteria(nombre, apellido)) {
            System.out.println("Criteria Dinamico: " + p);
        }
    }

}