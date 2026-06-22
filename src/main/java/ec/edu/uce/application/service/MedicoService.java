package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Medico;
import ec.edu.uce.domain.repository.MedicoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MedicoService {

    @Inject
    private MedicoRepository medicoRepository;

    @Transactional
    public void guardar(Medico medico) {
        this.medicoRepository.guardar(medico);
    }


}
