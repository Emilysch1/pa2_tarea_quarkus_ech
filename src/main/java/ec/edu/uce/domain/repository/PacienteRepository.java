package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Paciente;

public interface PacienteRepository {

    public void guardar(Paciente paciente);

    Paciente buscarPaciente(Integer id);

}
