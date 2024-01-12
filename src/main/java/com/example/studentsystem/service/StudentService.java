package com.example.studentsystem.service;

import com.example.studentsystem.StudentsystemApplication;
import com.example.studentsystem.model.Student;

import java.util.List;

// im Interface werden nur die Signaturen angezeigt
public interface StudentService {
    public Student saveStudent(Student student);

  //  public Student deleteStudent(int id);
    public List<Student> getAllStudents();
}
