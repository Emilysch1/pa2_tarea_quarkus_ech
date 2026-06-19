package ec.edu.uce;

import java.util.ArrayList;
import java.util.List;

import ec.edu.uce.application.service.ArticuloServicie;
import ec.edu.uce.domain.model.Articulo;

import ec.edu.uce.domain.model.Comentario;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ArticuloServicie articuloServicie;

        @Override
        public int run(String... args) {

            System.out.println("--- Iniciando ---");

            Articulo a = new Articulo();
            a.setTitulo("El baile de la luna");
            a.setContenido("La luna tuvo un gran baile con jupiter");

            Comentario com1 = new Comentario();
            com1.setNombre("Emily");
            com1.setArticulo(a);
            com1.setTexto("Es muy corto este articulo");

            Comentario com2 = new Comentario();
            com2.setNombre("Juan");
            com2.setArticulo(a);
            com2.setTexto("Me encanta");

            List<Comentario> comentarios = new ArrayList<>();
            comentarios.add(com1);
            comentarios.add(com2);

            a.setComentarios(comentarios);

            articuloServicie.guardar(a);

            System.out.println("--- Terminando ---");

            return 0;
        }
    }
}
