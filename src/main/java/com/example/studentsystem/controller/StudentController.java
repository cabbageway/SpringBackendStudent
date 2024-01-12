package com.example.studentsystem.controller;

import com.example.studentsystem.service.StudentService;
import com.example.studentsystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public  String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "" +
                "new Student is saved";
    }

  /*   @DeleteMapping("/delete")
    public void delete(@RequestBody Student student) {
        studentService.deleteStudent(student.getId());
    } */

    @GetMapping("/getAll")
        public List<Student> getAllStudents() {
            return studentService.getAllStudents();
    }

    @GetMapping ("/do")
    public String showText() {
        return  "some Text";
    }


}
