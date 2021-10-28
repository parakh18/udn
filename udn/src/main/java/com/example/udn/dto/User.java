package com.example.udn.dto;

import java.util.List;

public class User {
    private String name;
    private String mobile;
    private String pin;
    private String id;
    private String result;
    private static int maxId = 0;

    public User(String name, String mobile, String pin) {
        this.name = name;
        this.mobile = mobile;
        this.pin = pin;
        this.id = ""+(maxId + 1);
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getId() {
        return id;
    }

    public String getPin() {
        return pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void setMaxId(int maxId) {
        User.maxId = maxId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
