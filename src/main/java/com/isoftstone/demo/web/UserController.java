package com.isoftstone.demo.web;

import com.isoftstone.demo.pojo.AgentUser;
import com.isoftstone.demo.pojo.User;
import com.isoftstone.demo.service.AgentUserService;
import com.isoftstone.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@Controller
public class UserController {
	
	@Autowired
	UserService us;

	@Autowired
    AgentUserService agentUserService;
	
	@RequestMapping("/show")
	public String show(Model model, HttpServletResponse response) {
		response.setContentType("text/html;charset=utf-8");
		model.addAttribute("message","OCP运营管理后台系统");
		return "login";
	}
	
	
	@RequestMapping("/login")
	public String login(User u,HttpSession session,Model model) throws Exception {
		AgentUser user = agentUserService.login(u.getUsername(), u.getPassword());
		if(user!=null) {
			session.setAttribute("agentUser", user);
		}
		return "index";
	}

	@RequestMapping("/getLoginAgentUser")
    @ResponseBody
    public Map<String,Object> getLoginAgentUser(HttpServletRequest request) {
        Map<String,Object> map = new HashMap<>();
        Logger logger = LoggerFactory.getLogger(ShopController.class);
        AgentUser user = ((AgentUser) request.getSession().getAttribute("agentUser"));
        //打印用户名称
        logger.info(user.getName());
        map.put("agentUser",user);
        return map;
    }
}
