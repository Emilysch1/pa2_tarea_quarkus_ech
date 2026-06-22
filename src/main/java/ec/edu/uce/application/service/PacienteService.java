package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Paciente;
import ec.edu.uce.domain.repository.PacienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PacienteService {

    @Inject
    private PacienteRepository pacienteRepository;

    @Transactional
    public void guardar(Paciente paciente) {
        this.pacienteRepository.guardar(paciente);
    }
    @Transactional
    public Paciente buscarPaciente(Integer id) {
        return this.pacienteRepository.buscarPaciente(id);
    }

}
