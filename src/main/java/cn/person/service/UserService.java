package cn.person.service;

import java.util.List;

import cn.person.model.User;

public interface UserService {
	public int addUser(String userName, String password);
	
	public void deleteUser(int id);
	
	public void updateUser(int id, String userName, String passWord, String status);
	
	public List<User> getUsers();
	
	public User findUser(int id);
	
	public List<User> queryUserByPage(int pageNo, int pageSize, String userName, String passWord);
}
