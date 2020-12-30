package com.offcn.dao;

import com.offcn.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentDao {

    @Insert("insert into Student values(#{id},#{name},#{age},#{score})")
    public void save(Student Student);

    @Update("update Student set name=#{name},age=#{age},hobby=#{score} where id=#{id}")
    public void update(Student Student);

    @Delete("delete from Student where id=#{id}")
    public void delete(Integer id);

    @Select("select * from Student")
    public List<Student> getAllStudent();

    @Select("select * from Student where id=#{id}")
    public Student getOne(Integer id);

}
