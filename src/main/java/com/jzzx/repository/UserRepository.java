package com.jzzx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jzzx.models.User;
/**
 * 
 * @author itxin
 *	注意在使用JPQL语句时，不支持insert，仅支持update和delete，
 *	并且需要在仓储层方法或service层方法增加@Transactional事务注解（一般在service层指定事务注解）
 */
public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("select u from User u where u.name = ?1")
	public List<User> getUserByName(String name);
	@Query("select u from User u where u.password = :password and u.name = :username")
	public User getUserByNameAndPassword(@Param("username")String name,String password);
 
	public User getUserById(int id);
	
	@Modifying
	@Query("update User u set u.name = :username, u.password = :password where u.id = :id")
	public void updateUserById(@Param("username")String name, String password, int id); 
}
