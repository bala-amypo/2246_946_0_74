package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "financial_profiles")
public class FinancialProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", unique = true, nullable = false)
    private User user;

    @Column(nullable = false)
    private Double monthlyIncome;

    @Column(nullable = false)
    private Double monthlyExpenses;

    @Column
    private Double existingLoanEmi;

    @Column(nullable = false)
    private Integer creditScore;

    @Column(nullable = false)
    private Double savingsBalance;

    @Column(nullable = false)
    private LocalDateTime lastUpdatedAt;

    /* -------- Constructors -------- */

    public FinancialProfile() {
    }

    public FinancialProfile(User user,
                            Double monthlyIncome,
                            Double monthlyExpenses,
                            Double existingLoanEmi,
                            Integer creditScore,
                            Double savingsBalance) {
        this.user = user;
        this.monthlyIncome = monthlyIncome;
        this.monthlyExpenses = monthlyExpenses;
        this.existingLoanEmi = existingLoanEmi;
        this.creditScore = creditScore;
        this.savingsBalance = savingsBalance;
    }

    /* -------- Lifecycle Hooks -------- */

    @PrePersist
    @PreUpdate
    protected void onUpdate() {
        this.lastUpdatedAt = LocalDateTime.now();
    }

    /* -------- Getters & Setters -------- */

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public Double getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(Double monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    public Double getExistingLoanEmi() {
        return existingLoanEmi;
    }

    public void setExistingLoanEmi(Double existingLoanEmi) {
        this.existingLoanEmi = existingLoanEmi;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(Double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public LocalDateTime getLastUpdatedAt() {
        return lastUpdatedAt;
    }
}
