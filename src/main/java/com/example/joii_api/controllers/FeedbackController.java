package com.example.joii_api.controllers;

import com.example.joii_api.models.Feedback;
import com.example.joii_api.payloads.response.MessageResponse;
import com.example.joii_api.security.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FeedbackController {
    @Autowired
     FeedbackService feedbackService;
    @RequestMapping(value = "/addFeedback", method = RequestMethod.POST)
    public ResponseEntity<MessageResponse> addFeedback(@RequestBody Feedback feedback) {
        feedbackService.addFeedback(feedback);
        return ResponseEntity.ok(new MessageResponse("Sent  successfully!"));

    }
}
