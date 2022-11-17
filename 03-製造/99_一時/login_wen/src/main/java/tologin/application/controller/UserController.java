package tologin.application.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tologin.application.entity.User;
import tologin.application.service.UserService;




@Controller
@RequestMapping("/user")
public class UserController {
         @Autowired
	    private UserService userService;
	    
		@RequestMapping("/select")
	    @ResponseBody
		public User select(User user) { 
			 userService.selectByUserId(user);
		
			 return userService.selectByUserId(user);
			
		}
		  @RequestMapping("/index")
		  public String toindex(User user) {

			   return "index";
		  }
	    
	
	  @RequestMapping("/to/login")
	  public String tologin(User user) {

		   return "login";
	  }
	  @RequestMapping("/login")
	  public String login(User user,Model model) {

		  User user1 = userService.selectByUserId(user);
		  if(user1==null) {
			  model.addAttribute("errmeg", "你输入的账户或者密码有误");
			  return "login";
		  }else { 
			  if(user1.getGender()==1) {
				  model.addAttribute("display", false);
			  }else {
				  model.addAttribute("display", true);
			  }
			  return "index";
		  }	  
	  }
	  @RequestMapping("/勤怠情報一覧")
	  public String kilogin(User user) {

		   return "勤怠情報一覧";
	  }
	  @RequestMapping("/社員情報一覧")
	  public String shlogin(User user) {

		   return "社員情報一覧";
	  }


}
