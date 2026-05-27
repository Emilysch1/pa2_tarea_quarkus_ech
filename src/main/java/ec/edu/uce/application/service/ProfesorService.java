package ec.edu.uce.application.service;

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
            p.setNombre(nuevoNombre); // Cambia el nombre internamente
            this.profesorRepository.actualizar(p); // Guarda el cambio
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

    public void consultarPorMateria(String materia) {
        Profesor p = this.profesorRepository.seleccionarPorMateria(materia);
        if (p != null) {
            System.out.println("Profesor encontrado para la materia " + materia + ": " + "\n" + p.getId() + ": "
                    + p.getNombre() + " " + p.getApellido());
        } else {
            System.out.println("No se encontro ningun profesor que dicte la materia: " + materia);
        }
    }

}
