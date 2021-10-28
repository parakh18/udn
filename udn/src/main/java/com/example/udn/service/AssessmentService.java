package com.example.udn.service;

import com.example.udn.dto.AssessmentDto;
import org.springframework.stereotype.Service;

@Service
public class AssessmentService {
    public String calculateRisk(AssessmentDto dto) {
                /*No symptoms, No travel history, No contact with covid positive patient - Risk = 5%
                Any one symptom, travel history or contact with covid positive patient is true - Risk = 50%
                Any two symptoms, travel history or contact with covid positive patient is true - Risk = 75%
                Greater than 2 symptoms, travel history or contact with covid positive patient is true - Risk = 95% */
        if(dto.getSymptoms().isEmpty() && !dto.isTravelHistory() && !dto.isContactWithCovidPatient()) return "5";
        else if(dto.getSymptoms().size() == 1 && (dto.isTravelHistory() || dto.isContactWithCovidPatient())) return "50";
        else if(dto.getSymptoms().size() == 2 && (dto.isTravelHistory() || dto.isContactWithCovidPatient())) return "75";
        else if(dto.getSymptoms().size() > 2 && (dto.isTravelHistory() || dto.isContactWithCovidPatient())) return "95";
        else return "100";
    }
}