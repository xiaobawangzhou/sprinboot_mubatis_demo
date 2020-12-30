package com.offcn.service;

import com.offcn.pojo.Student;

import java.util.List;

public interface StudentService {
    //获取所有学生
    public List<Student> getStudentList();

    //获取单个学生
    public Student getOne(Integer id);

    //修改学生
    public void updateStudent(Integer id,Student student);

    //删除学生
    public void deleteStudent(Integer id);

    //添加学生
    public void addStudent(Student student);
}
