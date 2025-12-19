package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class EligibilityResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "loan_request_id", nullable = false)
    private LoanRequest loanRequest;

    @Column(nullable = false)
    private Boolean isEligible;

    @Column(nullable = false)
    private Double maxEligibleAmount;

    @Column(nullable = false)
    private Double estimatedEmi;

    @Column(nullable = false)
    private String riskLevel; // LOW, MEDIUM, HIGH

    private String rejectionReason;

    private LocalDateTime calculatedAt = LocalDateTime.now();

    // Constructors
    public EligibilityResult() {}

    public EligibilityResult(LoanRequest loanRequest, Boolean isEligible, Double maxEligibleAmount,
                             Double estimatedEmi, String riskLevel, String rejectionReason) {
        this.loanRequest = loanRequest;
        this.isEligible = isEligible;
        this.maxEligibleAmount = maxEligibleAmount;
        this.estimatedEmi = estimatedEmi;
        this.riskLevel = riskLevel;
        this.rejectionReason = rejectionReason;
    }

    // Getters and Setters
    // ...
}