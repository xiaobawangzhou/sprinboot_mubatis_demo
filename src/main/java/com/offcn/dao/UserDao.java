package com.offcn.dao;

import com.offcn.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Insert("insert into user values(#{id},#{name},#{age},#{hobby})")
    public void save(User user);

    @Update("update user set name=#{name},age=#{age},hobby=#{hobby} where id=#{id}")
    public void update(User user);

    @Delete("delete from user where id=#{id}")
    public void delete(Integer id);

    @Select("select * from user")
    public List<User> getAllUser();

    @Select("select * from user where id=#{id}")
    public User getOne(Integer id);

}
