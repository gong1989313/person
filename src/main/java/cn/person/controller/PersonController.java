package cn.person.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.person.model.Person;
import cn.person.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
    private PersonService personService;
	
	@Autowired  
	private  HttpServletRequest request;
    
    @RequestMapping("list")
    public ModelAndView getList(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize){
    	String name = request.getParameter("name");
    	String gender = request.getParameter("gender");
    	String address = request.getParameter("address");
    	String zip = request.getParameter("zip");
    	String mobile = request.getParameter("mobile");
    	String education = request.getParameter("education");
    	String company = request.getParameter("company");
    	String nation = request.getParameter("nation");
    	ModelAndView mav = new ModelAndView();
    	List<Person> persons = personService.getList(pageNo, pageSize, name, gender, address, zip, mobile, education, company, nation);
        mav.addObject("users", persons);  
        mav.setViewName("welcome");  
        return mav; 
    }
    
    @RequestMapping("find")
    public ModelAndView findById(@RequestParam("id") int id){
    	ModelAndView mav = new ModelAndView();
    	Person person = personService.findById(id);
        mav.addObject("user", person);
        mav.setViewName("welcome");  
        return mav; 
    }
    
    @RequestMapping("delete")
    public ModelAndView deleteById(@RequestParam("id") int id){
    	ModelAndView mav = new ModelAndView();
    	personService.deleteById(id);
        mav.setViewName("welcome");  
        return mav; 
    }
}