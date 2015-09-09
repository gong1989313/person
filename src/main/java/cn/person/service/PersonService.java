package cn.person.service;

import java.util.List;

import cn.person.model.Person;

public interface PersonService {
	public Person findById(long id);
	
    public List<Person> getList(int pageNo, int pageSize, String name, String gender, String address, String zip, String mobile, String education, String company, String nation);
    
    public int deleteById(long id);
}
