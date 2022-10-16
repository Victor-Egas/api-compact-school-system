package com.compact.school.school.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCurso;

    @Column(name = "nombreCurso" , nullable = false)
    private String nombreCurso;

    @Column(name = "gradoCurso" , nullable = false)
    private String gradoCurso;

    @ManyToMany
    @JoinTable(name="tb_curso_matricula"
        , joinColumns = @JoinColumn(name = "idCurso")
        , inverseJoinColumns = @JoinColumn(name = "idMatricula"))
    private List<Matricula> matriculas;
}
