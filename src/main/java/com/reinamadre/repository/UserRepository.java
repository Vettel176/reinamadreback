package com.reinamadre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reinamadre.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByNameAndPassword(String name,String password);
}
