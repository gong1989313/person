package cn.person.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.person.dao.PersonDAO;
import cn.person.model.Person;
import cn.person.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDAO personDAO;

	@Override
	public Person findById(long id) {
		return personDAO.findById(id);
	}

	@Override
	public List<Person> getList(int pageNo, int pageSize, String name,
			String gender, String address, String zip, String mobile,
			String education, String company, String nation) {
		int startPage = (pageNo - 1) * pageSize;
		int limit = pageSize * pageNo;
		return personDAO.getPersonsByPage(startPage, limit, name, gender,
				address, zip, mobile, education, company, nation);
	}

	@Override
	public int deleteById(long id) {
		return personDAO.deleteById(id);
	}

}
