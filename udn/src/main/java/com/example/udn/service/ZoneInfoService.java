package com.example.udn.service;

import com.example.udn.dto.User;
import com.example.udn.dto.Zone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneInfoService {
    @Autowired
    UserService userService;
    public String getZoneInfo(String pinCode) {
        int caseCount = 0;
        for(User user :userService.getAllUsers()) {
            if(user.getPin().equalsIgnoreCase(pinCode)) {
                caseCount++;
            }
        }
        if(caseCount > 1 && caseCount <=5) return "ORANGE";
        else if (caseCount > 5) return "RED";
        else return "GREEN";
    }
}
