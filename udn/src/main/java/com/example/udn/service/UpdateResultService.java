package com.example.udn.service;

import com.example.udn.dto.UpdateResultDto;
import com.example.udn.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateResultService {
    @Autowired
    UserService userService;

    public void updateResult(UpdateResultDto dto) {
        for(User user :userService.getAllUsers()) {
            if(user.getId().equalsIgnoreCase(dto.getUserId())) {
                user.setResult("Positive");
            }
        }
    }
}
