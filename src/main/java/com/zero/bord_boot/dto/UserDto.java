package com.zero.bord_boot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
	private String userId;
	private String userPw;
	private String userName;
	private String userMail;
}
