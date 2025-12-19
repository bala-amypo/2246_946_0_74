package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LoanRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private Double requestedAmount;

    @Column(nullable = false)
    private Integer tenureMonths;

    private String purpose;

    private String status = "PENDING";

    private LocalDateTime appliedAt = LocalDateTime.now();

    @OneToOne(mappedBy = "loanRequest", cascade = CascadeType.ALL)
    private EligibilityResult eligibilityResult;

    // Constructors
    public LoanRequest() {}

    public LoanRequest(User user, Double requestedAmount, Integer tenureMonths, String purpose) {
        this.user = user;
        this.requestedAmount = requestedAmount;
        this.tenureMonths = tenureMonths;
        this.purpose = purpose;
    }

    // Getters and Setters
    // ...
}

