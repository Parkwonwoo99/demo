package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDTO;

public interface UserService {

    List<UserDTO> getUserList();

    UserDTO getUser(int userNo);

    int addUser(UserDTO user);

    int modifyUser(UserDTO user);

    int removeUser(int userNo);

}
