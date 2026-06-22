package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Medico;
import ec.edu.uce.domain.repository.MedicoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class MedicoRepositoryImpl implements MedicoRepository {

    @Inject
    private EntityManager em;
   
    @Override
    public void guardar(Medico medico) {
       this.em.persist(medico);
    }

}
