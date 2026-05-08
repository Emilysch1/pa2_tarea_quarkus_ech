package uce.tarea.ech.vehiculos;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVehiculoService {

    @Inject
    private Instance<Recargo> recargos;

    public void procesar(Vehiculos vehiculos) {

        System.out.println("****DETALLE DE VEHICULO****");
        System.out.println("Propietario: " + vehiculos.getPropietario());
        System.out.println("Tipo: " + vehiculos.getTipo());
        System.out.println("Valor Base: " + vehiculos.getValorBase());

        for (Recargo r : recargos) {

            // Mostrar orden de ejecución CDI
            System.out.println("Verificando recargo: " + r.obtenerTipo());

            if (r.obtenerTipo().equalsIgnoreCase(vehiculos.getTipo())) {

                double total = r.aplicar(vehiculos.getValorBase());

                vehiculos.setTotal(total);

                System.out.println("Recargo aplicado para: " + r.obtenerTipo());
                System.out.println("Total a pagar: $" + vehiculos.getTotal());
            }
        }
    }
}
