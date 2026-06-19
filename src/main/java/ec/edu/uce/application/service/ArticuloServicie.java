package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Articulo;
import ec.edu.uce.domain.repository.ArticuloRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ArticuloServicie {

    @Inject
    private ArticuloRepository articuloRepository;

    @Transactional
    public void guardar(Articulo articulo) {
        this.articuloRepository.crear(articulo);
    }

}
