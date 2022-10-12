package com.compact.school.school.dao.impl;

import com.compact.school.school.dao.StudentRepository;
import com.compact.school.school.model.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public List<Student> findAllStudent() {
        List<Student> listStudent = new ArrayList<>();

        Student student = new Student();
        student.setStudentId(1);
        student.setStudentName("DOMINICK");
        student.setStudentSurname("EGAS RODRIGUEZ");
        student.setStudentDirection("AV. RODRIGUEZ SOTO 636 SURCO");
        student.setParentName("VICTOR");
        student.setParentSurName("EGAS SAENZ");
        student.setParentCellphone("916456636");
        student.setParentReference("PADRE");

        Student student1 = new Student();
        student1.setStudentId(2);
        student1.setStudentName("ERICKA");
        student1.setStudentSurname("VALVERDE GUTIERREZ");
        student1.setStudentDirection("AV. ISMAEL MIRANDA 432 CHORRILLOS");
        student1.setParentName("ELVIRA");
        student1.setParentSurName("GUTIERREZ ALVARADO");
        student1.setParentCellphone("916456636");
        student1.setParentReference("MADRE");

        listStudent.add(student);
        listStudent.add(student1);

        return listStudent;
    }
}
