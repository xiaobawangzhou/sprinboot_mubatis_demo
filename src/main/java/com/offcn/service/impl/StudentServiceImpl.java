package com.offcn.service.impl;

import com.offcn.dao.StudentDao;
import com.offcn.pojo.Student;
import com.offcn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getStudentList() {
        return studentDao.getAllStudent();
    }

    @Override
    public Student getOne(Integer id) {
        return studentDao.getOne(id);
    }

    @Override
    public void updateStudent(Integer id, Student student) {
        student.setId(id);
        studentDao.update(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentDao.delete(id);
    }

    @Override
    public void addStudent(Student student) {
        studentDao.save(student);
    }
}
