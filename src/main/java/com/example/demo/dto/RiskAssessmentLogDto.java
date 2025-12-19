package com.example.demo.dto;

import java.time.LocalDateTime;

public class RiskAssessmentLogDto {
    private Long id;
    private Long loanRequestId;
    private Double dtiRatio;
    private String creditCheckStatus;
    private LocalDateTime timestamp;

    public RiskAssessmentLogDto() {}

    public RiskAssessmentLogDto(Long id, Long loanRequestId, Double dtiRatio, String creditCheckStatus, LocalDateTime timestamp) {
        this.id = id;
        this.loanRequestId = loanRequestId;
        this.dtiRatio = dtiRatio;
        this.creditCheckStatus = creditCheckStatus;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    // ...
}
