package com.isoftstone.demo.web;

import com.isoftstone.demo.pojo.User;
import com.isoftstone.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
public class UserController {
	
	@Autowired
	UserService us;
	
	@RequestMapping("/show")
	public String show(Model model, HttpServletResponse response) {
		response.setContentType("text/html;charset=utf-8");
		model.addAttribute("message","OCP运营管理后台系统");
		return "login";
	}
	
	
	@RequestMapping("/login")
	public String login(User u,HttpSession session,Model model) throws Exception {
		User user = us.login(u.getUsername(), u.getPassword());
		if(user!=null) {
			session.setAttribute("user", user);
		}
		return "index";
	}
}
