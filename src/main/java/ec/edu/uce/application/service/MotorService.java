package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Motor;
import ec.edu.uce.domain.repository.MotorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MotorService {

    @Inject
    private MotorRepository motorRepository;

    public void guardar(Motor motor) {
        this.motorRepository.crear(motor);
    }

}
