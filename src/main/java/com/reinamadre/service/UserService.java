package com.reinamadre.service;
import java.util.List;

import com.reinamadre.dto.UserDto;

public interface UserService {
    List<UserDto> findAll();
    String findAllByNameAndPassword(String name, String password);
}
