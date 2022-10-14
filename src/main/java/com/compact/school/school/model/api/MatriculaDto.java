package com.compact.school.school.model.api;

import com.compact.school.school.model.entity.Alumno;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class MatriculaDto {

    private Integer idMatricula;

    private Date fechaMatricula;

    private String turnoMatricula;

    private BigDecimal montoMatricula;

    private Alumno alumno;
}
