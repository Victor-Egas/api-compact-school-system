package com.compact.school.school.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tb_matricula")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMatricula;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaMatricula", nullable = false)
    private Date fechaMatricula;

    @Column(name = "turnoMatricula", nullable = false)
    private String turnoMatricula;

    @Column(name = "montoMatricula")
    private BigDecimal montoMatricula;

    @ManyToOne
    @JoinColumn(name = "idAlumno")
    private Alumno alumno;
}
