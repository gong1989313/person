package cn.person.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.person.dao.UserDAO;
import cn.person.model.User;
import cn.person.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserDAO userDAO;

	@Override
	public int addUser(String userName, String password) {
		User user = new User();
		user.setPassword(password);
		user.setUsername(userName);
		user.setStatus("NEW");
		return userDAO.insertUser(user);
	}

	@Override
	public void deleteUser(int id) {
		userDAO.deleteUser(id);
	}

	@Override
	public void updateUser(int id, String userName, String password, String status) {
		User user = userDAO.findById(id);
		if(user != null){
			user.setPassword(password);
			user.setUsername(userName);
			user.setStatus(status);
			userDAO.updateUser(user);
		}
	}

	@Override
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	public User findUser(int id) {
		return userDAO.findById(id);
	}

	@Override
	public List<User> queryUserByPage(int pageNo, int pageSize, String userName, String passWord) {
		int startPage = pageNo * pageSize - 1;
		return userDAO.queryUserByPage(startPage, pageSize, userName, passWord);
	}
	

}
