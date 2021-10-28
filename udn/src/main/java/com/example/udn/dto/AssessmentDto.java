package com.example.udn.dto;

import org.apache.catalina.LifecycleState;

import java.util.List;

public class AssessmentDto {
   private String userId;
   private List<String> symptoms;
   private boolean travelHistory;
   private boolean contactWithCovidPatient;

    public String getUserId() {
        return userId;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public boolean isTravelHistory() {
        return travelHistory;
    }

    public boolean isContactWithCovidPatient() {
        return contactWithCovidPatient;
    }
}
