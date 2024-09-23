package com.zero.bord_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zero.bord_boot.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{ //엔티티 클래스와 pk타입으로 지정

}
