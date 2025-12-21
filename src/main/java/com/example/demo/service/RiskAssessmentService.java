package com.example.demo.service;

import com.example.demo.entity.RiskAssessmentLog;

import java.util.List;

public interface RiskAssessmentService {

    void logRisk(RiskAssessmentLog log);

    List<RiskAssessmentLog> getByLoanRequestId(Long loanRequestId);
}
