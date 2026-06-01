package ec.edu.uce.domain.model;

import java.time.LocalTime;

import org.infinispan.configuration.parsing.Namespace;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")
@NamedQueries({
        @NamedQuery(name = "Profesor.buscarPorMateria", query = "SELECT p From Profesor p WHERE p.materia = :materia"),
        @NamedQuery(name = "Profesor.buscarPorCorreo", query = "SELECT p From Profesor p WHERE p.correo = :correo"),
        @NamedQuery(name = "Profesor.buscarPorHora", query = "SELECT p FROM Profesor p WHERE p.horaInicio >= :horaInicio AND p.horaFin <= :horaFin"),
        @NamedQuery(name = "Profesor.contar", query = "SELECT COUNT(p) FROM Profesor p")
})
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_profesor")
    @SequenceGenerator(name = "seq_profesor", sequenceName = "seq_profesor", allocationSize = 1)
    @Column(name = "prof_id")
    private Integer id;

    @Column(name = "prof_nombre")
    private String nombre;

    @Column(name = "prof_apellido")
    private String apellido;

    @Column(name = "prof_materia")
    private String materia;

    @Column(name = "prof_correo")
    private String correo;

    @Column(name = "prof_horaInicio")
    private LocalTime horaInicio;

    @Column(name = "prof_horaFin")
    private LocalTime horaFin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

}
