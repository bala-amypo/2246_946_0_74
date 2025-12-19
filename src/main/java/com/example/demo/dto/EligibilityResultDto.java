package com.example.demo.dto;

import java.time.LocalDateTime;

public class EligibilityResultDto {
    private Long id;
    private Long loanRequestId;
    private Boolean isEligible;
    private Double maxEligibleAmount;
    private Double estimatedEmi;
    private String riskLevel;
    private String rejectionReason;
    private LocalDateTime calculatedAt;

    public EligibilityResultDto() {}

    public EligibilityResultDto(Long id, Long loanRequestId, Boolean isEligible, Double maxEligibleAmount,
                                Double estimatedEmi, String riskLevel, String rejectionReason, LocalDateTime calculatedAt) {
        this.id = id;
        this.loanRequestId = loanRequestId;
        this.isEligible = isEligible;
        this.maxEligibleAmount = maxEligibleAmount;
        this.estimatedEmi = estimatedEmi;
        this.riskLevel = riskLevel;
        this.rejectionReason = rejectionReason;
        this.calculatedAt = calculatedAt;
    }

    // Getters and Setters
    // ...
}
