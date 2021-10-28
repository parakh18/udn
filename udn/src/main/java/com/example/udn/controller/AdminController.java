package com.example.udn.controller;

import com.example.udn.dto.UpdateResultDto;
import com.example.udn.dto.User;
import com.example.udn.service.UpdateResultService;
import com.example.udn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    UserService userService;
    @Autowired
    UpdateResultService updateResultService;

    @RequestMapping(method = RequestMethod.POST, value = "/registerUser")
    public String resisterAdmin(@RequestBody User user) {
        return userService.createUser(user);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/updateResult")
    public String updateResult(@RequestBody UpdateResultDto dto) {
        updateResultService.updateResult(dto);
        return "true";
    }
}
