package com.zero.bord_boot.services.auth;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.zero.bord_boot.dto.UserDto;
import com.zero.bord_boot.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Autentication {
	private final UserRepository userRepository;
	
	
	public ModelAndView join(ModelAndView mav) {
		UserDto user = (UserDto) mav.getModel().get("user");
		System.out.println(user);
		mav.setViewName("index");
		return mav;
	}
}
