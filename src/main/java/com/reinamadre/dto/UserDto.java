package com.reinamadre.dto;

import com.reinamadre.entity.User;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDto {

    private Long id;
    private String name;
    private String password;
    private String token;
    
    public UserDto(){

    }

    public UserDto(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.password = user.getPassword();
        this.token = user.getToken();

    }
}
