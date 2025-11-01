package com.feleayodeji.springboot.service;

import com.feleayodeji.springboot.dto.UserDto;
import com.feleayodeji.springboot.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}
