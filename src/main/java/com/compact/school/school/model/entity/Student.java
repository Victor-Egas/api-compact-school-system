package com.compact.school.school.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private Integer studentId;
    private String studentName;
    private String studentSurname;
    private String studentDirection;
    private String parentName;
    private String parentSurName;
    private String parentCellphone;
    private String parentReference;
}
