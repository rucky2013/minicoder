package com.minicoder.springrestful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.minicoder.springrestful.entity.User;

/**
 * <p><b>UserController Description:</b> TODO(这里用几句话描述这个类的作用)</p>
 * @author jevno (rucky2013@163.com)
 * <b>DATE</b> 2014年11月6日 下午2:15:07
 */
@Controller
@RequestMapping("/user")
@RestController
public class UserController {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String setUser(ModelMap map){
		User user=new User();
		user.setUserName("yyy");
		map.put("user", user);
		return "request/userForm";
	}

}
