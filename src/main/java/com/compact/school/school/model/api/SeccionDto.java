package com.compact.school.school.model.api;

import com.compact.school.school.model.entity.Curso;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

public class SeccionDto {

    private Integer idSeccion;

    private String nombreSeccion;

    private Integer vacanteSeccion;

    private Integer estadoSeccion;

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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
