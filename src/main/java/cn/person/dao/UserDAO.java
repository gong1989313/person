package cn.person.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.person.model.User;

public interface UserDAO {
	public int insertUser(User user);

	public User findById(int id);

	public List<User> getUsers();

	public int deleteUser(int id);

	public int updateUser(User user);

	public List<User> queryUserByPage(
			@Param(value = "startPage") int startPage,
			@Param(value = "pageSize") int pageSize,
			@Param(value = "username") String searchUsername,
			@Param(value = "password") String searchPassword);
}
