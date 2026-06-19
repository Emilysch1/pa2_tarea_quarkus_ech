package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Articulo;
import ec.edu.uce.domain.repository.ArticuloRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ArticuloRepositoryImp implements ArticuloRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Articulo articulo) {
        this.em.persist(articulo);
    }

}
