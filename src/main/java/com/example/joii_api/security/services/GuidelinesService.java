package com.example.joii_api.security.services;

import com.example.joii_api.models.Guidelines;
import com.example.joii_api.models.Hotels;
import com.example.joii_api.repository.GuidelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuidelinesService {
    @Autowired
    GuidelineRepository guidelineRepository;
    public List<Guidelines> findAllGuidelines(String vendor_u_id) {
        List guidelines=new ArrayList<>();
        guidelineRepository.findGuidelines(vendor_u_id).forEach(guidelines::add);
        return guidelines;

    }
}
