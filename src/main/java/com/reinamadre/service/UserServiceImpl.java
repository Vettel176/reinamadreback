package com.reinamadre.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reinamadre.dto.UserDto;
import com.reinamadre.entity.User;
import com.reinamadre.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository usersRepository;

    @Override
    public List<UserDto> findAll() {
        List<UserDto> listUserDto = new ArrayList<>();

        List<User> listUsers = usersRepository.findAll();
        listUsers.stream().forEach(p -> listUserDto.add(new UserDto(p)));
        listUsers.forEach((u) -> System.out.println(u.getName()+ " " + u.getPassword() + " " + u.getToken() ));
        return listUserDto;
    }

    @Override
    public String findAllByNameAndPassword(String name, String password) {
        List<User> listUsers = usersRepository.findAllByNameAndPassword(name, password);
        if(listUsers.size()>0){
            //Implementar la generaicon de token
            System.out.println("Usuario encontrado");
            return "token";
            
        }else{
            System.out.println("No se encontró usuario en BD");
            return "notFound";
        }
    }
}
