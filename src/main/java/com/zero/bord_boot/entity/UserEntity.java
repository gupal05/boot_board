package com.zero.bord_boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "USERS")
public class UserEntity {
	@Id //pk 지정
	//@GeneratedValue(strategy = GenerationType.IDENTITY) //오라클로 치면 시퀀스?
	@Column(name = "US_ID")
	private String userId;
	
	@Column(name = "US_PW")
	private String userPw;
	
	@Column(name = "US_NAME")
	private String userName;
	
	@Column(name = "US_MAIL", unique = true)
	private String userMail;
}
