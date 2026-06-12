package ec.edu.uce.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
public class Automovil {

    @Id
    @SequenceGenerator(name = "seq_automovil_director", sequenceName = "seq_automovil", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_automovil_director")
    @Column(name = "auto_id")
    private Integer id;

    @Column(name = "auto_marca")
    private String marca;

    @Column(name = "auto_modelo")
    private String placa;

    @OneToOne
    @JoinColumn(name = "auto_motor_id")
    private Motor motor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }


    

}
