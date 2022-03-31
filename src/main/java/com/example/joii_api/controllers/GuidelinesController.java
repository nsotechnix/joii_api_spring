package com.example.joii_api.controllers;

import com.example.joii_api.models.Guidelines;
import com.example.joii_api.models.Hotels;
import com.example.joii_api.security.services.GuidelinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GuidelinesController {
    @Autowired
    GuidelinesService guidelinesService;
    @RequestMapping(value = "/api/guidelines/vendor/{vendor_u_id}", method = RequestMethod.GET)
    public List<Guidelines> getAllGuidelines(@PathVariable String vendor_u_id) {
        return guidelinesService.findAllGuidelines(vendor_u_id);
    }
}
