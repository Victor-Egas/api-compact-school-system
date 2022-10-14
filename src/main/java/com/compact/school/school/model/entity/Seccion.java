package com.compact.school.school.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "tb_seccion")
public class Seccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSeccion;

    @Column(name = "nombreSeccion" , nullable = false)
    private String nombreSeccion;

    @Column(name = "vacanteSeccion" , nullable = false)
    private Integer vacanteSeccion;

    @ManyToMany
    @JoinTable(name="tb_seccion_curso"
            , joinColumns = @JoinColumn(name = "idSeccion")
            , inverseJoinColumns = @JoinColumn(name = "idCurso"))
    private List<Curso> cursos;
}
