package com.offcn.controller;

import com.offcn.pojo.Student;
import com.offcn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired(required = false)
    private StudentService StudentService;

    @GetMapping("/")
    public List<Student> getStudentList(){
        return StudentService.getStudentList();
    }

    @GetMapping("/{id}")
    public Student getOne(@PathVariable("id") Integer id){
        return StudentService.getOne(id);
    }

    @PostMapping("/")
    public String addStudent(Student Student){
        StudentService.addStudent(Student);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") Integer id){
        StudentService.deleteStudent(id);
        return "success";
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable("id") Integer id,Student Student){
        StudentService.updateStudent(id,Student);
        return "success";
    }
}
