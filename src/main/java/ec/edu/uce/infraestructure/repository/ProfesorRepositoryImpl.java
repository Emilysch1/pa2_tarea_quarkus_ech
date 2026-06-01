package ec.edu.uce.infraestructure.repository;

import java.time.LocalTime;
import java.util.List;

import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.ProfesorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ProfesorRepositoryImpl implements ProfesorRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Profesor profesor) {
        this.em.persist(profesor);

    }

    @Override
    public Profesor seleccionarPorId(Integer id) {
        return this.em.find(Profesor.class, id);
    }

    @Override
    public void actualizar(Profesor profesor) {
        this.em.merge(profesor);
    }

    @Override
    public void eliminar(Integer id) {
        this.em.remove(this.seleccionarPorId(id));

    }

    @Override
    public List<Profesor> seleccionarTodos() {
        TypedQuery<Profesor> miQuery = this.em.createQuery("SELECT p FROM Profesor p", Profesor.class);
        return miQuery.getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorNombre(String nombre) {
        TypedQuery<Profesor> miQuery = this.em.createQuery(
                "SELECT p FROM Profesor p WHERE p.nombre LIKE CONCAT('%', :nombre1, '%') OR p.apellido LIKE CONCAT('%', :nombre1, '%')",
                Profesor.class);
        miQuery.setParameter("nombre1", nombre);
        return miQuery.getResultList();
    }

 @Override
    public List<Profesor> seleccionarPorMateria(String materia) {
        TypedQuery<Profesor> myQuery = this.em.createNamedQuery("Profesor.buscarPorMateria", Profesor.class);
        myQuery.setParameter("materia", materia);
        return myQuery.getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorCorreoTyped(String correo) {
        TypedQuery<Profesor> myQuery = this.em.createNamedQuery("Profesor.buscarPorCorreo", Profesor.class);
        myQuery.setParameter("correo", correo);
        return myQuery.getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorHoraTyped(LocalTime horaInicio, LocalTime horaFin) {
        TypedQuery<Profesor> myQuery = this.em.createNamedQuery("Profesor.buscarPorHora", Profesor.class);
        myQuery.setParameter("horaInicio", horaInicio);
        myQuery.setParameter("horaFin", horaFin);
        return myQuery.getResultList();
    }

    @Override
    public Long seleccionarContar() { // Cambiado el nombre para evitar duplicado
        TypedQuery<Long> myQuery = this.em.createNamedQuery("Profesor.contar", Long.class);
        return myQuery.getSingleResult();
    }

}
