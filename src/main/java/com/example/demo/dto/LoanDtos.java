package com.example.demo.dto;

import java.time.LocalDateTime;

public class LoanDtos {

    // Loan Request DTO
    public static class LoanRequestDto {
        private Long id;
        private Long userId;
        private Double requestedAmount;
        private Integer tenureMonths;
        private String purpose;
        private String status;
        private LocalDateTime appliedAt;

        public LoanRequestDto() {}

        public LoanRequestDto(Long id, Long userId, Double requestedAmount, Integer tenureMonths,
                              String purpose, String status, LocalDateTime appliedAt) {
            this.id = id;
            this.userId = userId;
            this.requestedAmount = requestedAmount;
            this.tenureMonths = tenureMonths;
            this.purpose = purpose;
            this.status = status;
            this.appliedAt = appliedAt;
        }

        // Getters and Setters
        // ...
    }

    // Financial Profile DTO
    public static class FinancialProfileDto {
        private Long id;
        private Long userId;
        private Double monthlyIncome;
        private Double monthlyExpenses;
        private Double existingLoanEmi;
        private Integer creditScore;
        private Double savingsBalance;
        private LocalDateTime lastUpdatedAt;

        public FinancialProfileDto() {}

        public FinancialProfileDto(Long id, Long userId, Double monthlyIncome, Double monthlyExpenses,
                                   Double existingLoanEmi, Integer creditScore, Double savingsBalance,
                                   LocalDateTime lastUpdatedAt) {
            this.id = id;
            this.userId = userId;
            this.monthlyIncome = monthlyIncome;
            this.monthlyExpenses = monthlyExpenses;
            this.existingLoanEmi = existingLoanEmi;
            this.creditScore = creditScore;
            this.savingsBalance = savingsBalance;
            this.lastUpdatedAt = lastUpdatedAt;
        }

        // Getters and Setters
        // ...
    }
}
