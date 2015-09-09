package cn.person.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.person.model.Person;

public class PersonServiceTest {
	private PersonService personService;
	
	@Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        personService = (PersonService) context.getBean("personServiceImpl");
    }
     
    @Test
    public void getPersonsByPage(){
      /*  List<Person> persons = personService.getList(1, 10, null, null, null, null, null, null, null, null);
        int index = persons.size();
        Assert.assertTrue(index>0);
        Person person = personService.findById(persons.get(index-1).getId());
        Assert.assertNotNull(person);*/
    }
}
