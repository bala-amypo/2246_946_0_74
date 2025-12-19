package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class EligibilityResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean eligible;
    private String rejectionReason;
    private Double maxEligibleAmount;
    private Double estimatedEmi;
    private String riskLevel;

    @OneToOne
    private LoanRequest loanRequest;

    public void setLoanRequest(LoanRequest loanRequest) {
        this.loanRequest = loanRequest;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
}
