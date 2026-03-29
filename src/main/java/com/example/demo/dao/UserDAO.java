package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.UserDTO;

@Mapper
public interface UserDAO {

    List<UserDTO> selectUserList();

    UserDTO selectUser(int userNo);

    int insertUser(UserDTO user);

    int updateUser(UserDTO user);

    int deleteUser(int userNo);

}
