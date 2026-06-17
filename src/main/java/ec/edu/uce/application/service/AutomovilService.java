package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Automovil;
import ec.edu.uce.domain.repository.AutomovilRepository;
import ec.edu.uce.domain.repository.MotorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AutomovilService {

    @Inject
    private MotorRepository motorRepository;

    @Inject
    private AutomovilRepository automovilRepository;

    @Transactional
    public void guardar(Automovil automovil) {
        this.automovilRepository.crear(automovil);

    }
}
