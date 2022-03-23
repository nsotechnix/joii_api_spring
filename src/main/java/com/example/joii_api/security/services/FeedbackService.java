package com.example.joii_api.security.services;

import com.example.joii_api.models.Feedback;
import com.example.joii_api.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {
    @Autowired
    FeedbackRepository feedbackRepository;

    public void addFeedback(Feedback feedback){
        feedbackRepository.save(feedback);

    }
}
