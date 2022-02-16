package com.chainsys.groceryshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chainsys.groceryshop.model.Loginmodel;
import com.chainsys.groceryshop.service.LoginService;

@Controller

public class HomeController {
	@Autowired
	private LoginService loginservice;

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/login")
	public ModelAndView test1(HttpServletResponse response) throws IOException {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/welcome")

	public ModelAndView welcome(HttpServletResponse response, Model m, HttpServletRequest request) throws IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		Loginmodel login = new Loginmodel(name, pass);
		loginservice.logins(login);

		m.addAttribute("name", login);

		return new ModelAndView("welcome");
	}

	@RequestMapping(value = "/display")
	public String getTeachers(ModelMap loginmodel) {
		List<Loginmodel> listLoginuser = loginservice.listLoginUser();
		loginmodel.addAttribute("teachers", listLoginuser);
		return ("display");
	}

}
