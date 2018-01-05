package com.wcxu.listShow.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wcxu.listShow.dao.UserDao;
import com.wcxu.listShow.dao.impl.UserDaoImpl;
import com.wcxu.listShow.entity.User;

@Controller
public class UserListController {
	@Resource
	private UserDao userDao;

	@RequestMapping("/user_list.do")
	public String execute(Model model) throws Exception {
		userDao = new UserDaoImpl();
		List<User> list = userDao.findAll();
		model.addAttribute("users", list);
		return "user_list";// user_list.jsp
	}
}
