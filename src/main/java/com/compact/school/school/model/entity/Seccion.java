package com.compact.school.school.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_seccion")
public class Seccion implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSeccion;

    @Column(name = "nombreSeccion" , nullable = false)
    private String nombreSeccion;

    @Column(name = "vacanteSeccion" , nullable = false)
    private Integer vacanteSeccion;

    @Column(name = "estadoSeccion" , nullable = false)
    private Integer estadoSeccion;

    @ManyToMany
    @JoinTable(name="tb_seccion_curso"
            , joinColumns = @JoinColumn(name = "idSeccion")
            , inverseJoinColumns = @JoinColumn(name = "idCurso"))
    private List<Curso> cursos;

    public Integer getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(Integer idSeccion) {
        this.idSeccion = idSeccion;
    }

    public String getNombreSeccion() {
        return nombreSeccion;
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public Integer getVacanteSeccion() {
        return vacanteSeccion;
    }

    public void setVacanteSeccion(Integer vacanteSeccion) {
        this.vacanteSeccion = vacanteSeccion;
    }

    public Integer getEstadoSeccion() {
        return estadoSeccion;
    }

    public void setEstadoSeccion(Integer estadoSeccion) {
        this.estadoSeccion = estadoSeccion;
    }

}
