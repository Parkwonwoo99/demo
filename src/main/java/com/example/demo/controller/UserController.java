package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String userList(Model model) {
        logger.debug("userList 요청");
        List<UserDTO> userList = userService.getUserList();
        logger.debug("조회된 사용자 수: {}", userList.size());
        model.addAttribute("userList", userList);
        return "user/list";
    }

}