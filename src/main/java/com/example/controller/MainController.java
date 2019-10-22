/**
 * 
 */
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.UserDo;
import com.example.service.UserService;

/**
 * @author Harry.Lee
 *
 */
@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/join")
	public String join() {
		return "join";
	}
	
	@PostMapping(value="/reqjoin")
	public String requestJoin(@ModelAttribute UserDo user) {
		userService.join(user);
		return "index";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}
}