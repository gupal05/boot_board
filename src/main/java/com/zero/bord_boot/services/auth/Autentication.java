package com.zero.bord_boot.services.auth;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.zero.bord_boot.dto.UserDto;
import com.zero.bord_boot.entity.UserEntity;
import com.zero.bord_boot.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Autentication {
	private final UserRepository userRepository;
	private final ModelMapper modelMapper = new ModelMapper();
	
	@Transactional
	public ModelAndView join(ModelAndView mav) {
		UserDto user = (UserDto) mav.getModel().get("user");
		String message = null;
		System.out.println(user);
		UserEntity userEntity = modelMapper.map(user, UserEntity.class);
		// userId가 이미 존재하는지 확인
	    if (userRepository.existsById(userEntity.getUserId())) {
	        message = "중복된 아이디 존재";
	        mav.setViewName("join");
	        mav.addObject("message", message);
	        System.out.println(mav.getModel().get("message"));
	        return mav; // 존재하는 경우, 더 이상 처리하지 않고 반환
	    }
	    
	    try {
	        userRepository.save(userEntity); // 존재하지 않을 경우만 저장
	        System.out.println("yes");
	    } catch (Exception e) {
	        System.out.println("no");
	        e.printStackTrace();
	        throw e;
	    }
		mav.setViewName("index");
		return mav;
	}
}
