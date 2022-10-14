package com.compact.school.school.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAlumno;

    @Column(name = "nombreAlumno", nullable = false, length = 40)
    private String nombreAlumno;

    @Column(name = "apellidoAlumno", nullable = false, length = 40)
    private String apellidoAlumno;

    @Column(name = "dniAlumno", nullable = false, length = 40)
    private String dniAlumno;

    @Column(name = "direccionAlumno", nullable = false, length = 50)
    private String direccionAlumno;

    @Column(name = "nombreApoderado", nullable = false, length = 40)
    private String nombreApoderado;

    @Column(name = "apellidoApoderado", nullable = false, length = 40)
    private String apellidoApoderado;

    @Column(name = "telefonoApoderado", nullable = false, length = 12)
    private String telefonoApoderado;

    @Column(name = "relacionApoderado", nullable = false, length = 10)
    private String relacionApoderado;
}
