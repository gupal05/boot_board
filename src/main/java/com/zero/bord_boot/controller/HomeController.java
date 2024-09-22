package com.zero.bord_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.zero.bord_boot.dto.UserDto;

@Controller
public class HomeController {
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
	 public String joinResult(UserDto user) {
		 System.out.println(user);
		 return null;
	 }
}
