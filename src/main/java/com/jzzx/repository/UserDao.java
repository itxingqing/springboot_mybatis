package com.jzzx.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.jzzx.models.User;

/**
 * 
 * @author itxin
 *  使用mybatis的方式来完成持久层的实现，完成与数据库的交互
 *  使用mybatis需要定义一个@Mapper的注解，告诉mybatis框架要解析相应的操作方法
 */
@Repository
@Mapper
public interface UserDao {
	
	//注意，注解中有一个大括号，在大括号中填入相应的sql语句
	@Insert({"insert into user(name, password) values (#{name}, #{password})"})
	int addUser(User user);
	
	@Select({"select * from user order by id desc"})
	List<User> getAllUsers();
	
	@Select({"select * from user u where u.name=#{name}"})
	User getUserByName(String name);
	
	@Select({"select * from user u where u.name=#{name} and u.password=#{password}"})
	User getUserByNameAndPassword(String name);
	
	@Update({"update user u set u.name=#{name}, u.password=#{password} where u.id=#{id}"})
	void updateUser(User user);
	
	@Delete({"delete from user u where u.id=#{id}"})
	void deleteUser(int id);
}
