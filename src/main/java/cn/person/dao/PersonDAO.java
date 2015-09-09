package cn.person.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.person.model.Person;

public interface PersonDAO {
	public Person findById(long id);

	public List<Person> getPersonsByPage(@Param(value = "startPage") int startPage,
										 @Param(value = "limit") int limit,
										 @Param(value = "name") String name,
										 @Param(value = "gender") String gender,
										 @Param(value = "address") String address,
										 @Param(value = "zip") String zip,
										 @Param(value = "mobile") String mobile,
										 @Param(value = "education") String education,
										 @Param(value = "company") String company,
										 @Param(value = "nation") String nation);

	public int deleteById(long id);
}
