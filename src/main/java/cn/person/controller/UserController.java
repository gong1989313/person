package cn.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.person.model.User;
import cn.person.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
    private UserService userService;
	
    @RequestMapping("index")
    public String index(){
        return "add";
    }
    
    @RequestMapping("list")
    public ModelAndView getUserList(){
    	ModelAndView mav = new ModelAndView();
    	List<User> users = userService.getUsers();
        mav.addObject("users", users);  
        mav.setViewName("welcome");  
        return mav; 
    }
    
    @RequestMapping("find")
    public ModelAndView getUserById(@RequestParam("id") int id){
    	ModelAndView mav = new ModelAndView();
    	User user = userService.findUser(id);
        mav.addObject("user", user);  
        mav.setViewName("welcome");  
        return mav; 
    }
    
    @RequestMapping("add")
    public ModelAndView addUser(@RequestParam("username") String userName, @RequestParam("password") String password){
    	ModelAndView mav = new ModelAndView();
    	userService.addUser(userName, password);
        mav.setViewName("welcome");  
        return mav; 
    }
    
    @RequestMapping("update")
    public ModelAndView updateUser(@RequestParam("id") int id, @RequestParam("username") String userName, @RequestParam("password") String password, @RequestParam("status") String status){
    	ModelAndView mav = new ModelAndView();
    	userService.updateUser(id, userName, password, status);
        mav.setViewName("welcome");  
        return mav; 
    }
    
    @RequestMapping("delete")
    public ModelAndView deleteUserById(@RequestParam("id") int id){
    	ModelAndView mav = new ModelAndView();
    	userService.deleteUser(id);
        mav.setViewName("welcome");  
        return mav; 
    }
}