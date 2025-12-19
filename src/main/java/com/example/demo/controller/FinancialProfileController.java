package com.example.demo.controller;

import com.example.demo.dto.LoanDtos.FinancialProfileDto;
import com.example.demo.entity.FinancialProfile;
import com.example.demo.service.FinancialProfileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/financial-profiles")
public class FinancialProfileController {

    private final FinancialProfileService profileService;

    public FinancialProfileController(FinancialProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping("/")
    public ResponseEntity<FinancialProfile> createOrUpdate(@RequestBody FinancialProfile profile) {
        FinancialProfile savedProfile = profileService.createOrUpdate(profile);
        return ResponseEntity.ok(savedProfile);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<FinancialProfile> getByUser(@PathVariable Long userId) {
        FinancialProfile profile = profileService.getByUserId(userId);
        return ResponseEntity.ok(profile);
    }
}
