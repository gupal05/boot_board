package com.zero.bord_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/he")
	public String test() {
		return "<div style='background-color: red; width: 50px; height: 50px;'></div>";
	}
}
