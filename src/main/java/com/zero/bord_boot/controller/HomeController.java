package com.zero.bord_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zero.bord_boot.dto.UserDto;
import com.zero.bord_boot.services.auth.Autentication;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor //lombok에서 제공하는 생성자 주입 어노테이션 @Autowride와 비슷한 느낌?
public class HomeController {
	private final Autentication auth;
	
	
	 @GetMapping("/")
	 public String index() {
		 return "index";
	 }
	 
	 @GetMapping("/login")
	 public String login() {
		 return "login"; // /templates/index,html
	 }
	 
	 @GetMapping("/join")
	 public String join() {
	     return "join"; // /templates/index,html
	 }
	 
	 @PostMapping("/join/result")
	 public ModelAndView joinResult(UserDto user, ModelAndView mav) {
		 System.out.println(user);
		 mav.addObject("user", user);
		 this.auth.join(mav);
		 System.out.println(mav.getModel().get("message"));
		 return mav;
	 }
}
