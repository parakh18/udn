package com.example.udn.controller;

import com.example.udn.dto.AssessmentDto;
import com.example.udn.dto.User;
import com.example.udn.dto.ZonedInfoDto;
import com.example.udn.service.AssessmentService;
import com.example.udn.service.UserService;
import com.example.udn.service.ZoneInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private UserService userService;
    @Autowired
    private AssessmentService assessmentService;
    @Autowired
    private ZoneInfoService zoneInfoService;

    @RequestMapping(method = RequestMethod.POST, value = "/registerUser")
    public String resisterUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/assessment")
    public String resisterUser(@RequestBody AssessmentDto dto) {
        return assessmentService.calculateRisk(dto);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/getZoneInfo")
    public String resisterUser(@RequestBody ZonedInfoDto dto) {
        return zoneInfoService.getZoneInfo(dto.getPinCode());
    }


}
