package ec.edu.uce.domain.repository;

import java.time.LocalTime;
import java.util.List;

import ec.edu.uce.domain.model.Profesor;

public interface ProfesorRepository {

    public void crear(Profesor profesor);

    public Profesor seleccionarPorId(Integer id);

    public void actualizar(Profesor profesor);

    public void eliminar(Integer id);

    public List<Profesor> seleccionarTodos();

    public List<Profesor> seleccionarPorNombre(String nombre);


    public List<Profesor> seleccionarPorCorreoTyped(String correo);

    public List<Profesor> seleccionarPorHoraTyped(LocalTime horaInicio, LocalTime horaFin);

    public Long seleccionarContar();

    public List<Profesor> seleccionarTodasMateriasNative();

    public List<Profesor> seleccionarTodosProfesores();

    public List<Profesor> seleccionarTodosCriteria();

    public List<Profesor> seleccionarPorMateriaCriteria(String materia);

    public List<Profesor> seleccionarDinamicoCriteria(String nombre, String apellido);


}
