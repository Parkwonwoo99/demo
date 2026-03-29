package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDAO;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<UserDTO> getUserList() {
        return userDAO.selectUserList();
    }

    @Override
    public UserDTO getUser(int userNo) {
        return userDAO.selectUser(userNo);
    }

    @Override
    public int addUser(UserDTO user) {
        return userDAO.insertUser(user);
    }

    @Override
    public int modifyUser(UserDTO user) {
        return userDAO.updateUser(user);
    }

    @Override
    public int removeUser(int userNo) {
        return userDAO.deleteUser(userNo);
    }

}
