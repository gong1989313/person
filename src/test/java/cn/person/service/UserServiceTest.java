package cn.person.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.person.model.User;
import cn.person.utils.MathUtil;

public class UserServiceTest {
	private UserService userService;

	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:conf/spring.xml",
						"classpath:conf/spring-mybatis.xml" });
		userService = (UserService) context.getBean("userServiceImpl");
	}

	@Test
	public void testUser() {
		Assert.assertTrue(userService.addUser("aaa", "bbb") == 1);
		List<User> users = userService.getUsers();
		int index = users.size();
		Assert.assertTrue(index > 0);
		User user = userService.findUser(users.get(index - 1).getId());
		Assert.assertNotNull(user);
		userService.updateUser(user.getId(), "ccc", "ddd", "eee");
		User newUser = userService.findUser(user.getId());
		Assert.assertTrue("ddd".equals(newUser.getPassword()));
		userService.deleteUser(user.getId());
		User newUser2 = userService.findUser(user.getId());
		Assert.assertNull(newUser2);
	}

	@Test
	public void addUser() {
		StringBuilder sbName = new StringBuilder();
		StringBuilder sbPwd = new StringBuilder();
		for (int i = 0; i < 1; i++) {
			sbName.append("userName").append(MathUtil.randomNumber(10));
			sbPwd.append("passWord").append(MathUtil.randomNumber(10));
			Assert.assertTrue(userService.addUser(sbName.toString(),
					sbPwd.toString()) == 1);
			sbName.delete(0, sbName.length());
			sbPwd.delete(0, sbPwd.length());
		}
		List<User> users = userService.getUsers();
		int index = users.size();
		Assert.assertTrue(index > 0);
	}

	@Test
	public void queryUser() {
		List<User> users = userService.queryUserByPage(1, 10, "user", "pass");
		int index = users.size();
		Assert.assertTrue(index >= 0);
		int i=1;
		for(User u : users){
			System.out.println(i+" "+u.toString());
			i++;
		}
	}
}
