package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Paciente;
import ec.edu.uce.domain.repository.PacienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PacienteRepositoryImpl implements PacienteRepository {

    @Inject
    private EntityManager em;

    @Override
    public void guardar(Paciente paciente) {
        this.em.persist(paciente);
    }

    @Override
    public Paciente buscarPaciente(Integer id) {
        Paciente paciente = this.em.find(Paciente.class, id);
        if (paciente != null && paciente.getMedicos() != null) {
            paciente.getMedicos().size();
        }

        return paciente;

    }
}