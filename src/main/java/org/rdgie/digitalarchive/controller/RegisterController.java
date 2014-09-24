package org.rdgie.digitalarchive.controller;

import java.util.Map;

import org.rdgie.digitalarchive.domain.User;
import org.rdgie.digitalarchive.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Map<String, Object> model) {
		model.put("user", new User());
		return "registration";
	}

	@RequestMapping(value = "/registrationsuccess", method = RequestMethod.POST)
	public String postuser(@ModelAttribute("user") User user) {

		userService.addUser(user);

		return "home";

	}
	@RequestMapping(value = "/savereport", method = RequestMethod.GET)
	public String savereport(Map<String, Object> model) {
		model.put("user", new User());
		return "savereport";
}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Map<String, Object> model) {
		model.put("user", new User());
		return "home";
}
}