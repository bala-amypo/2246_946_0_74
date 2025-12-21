package com.example.demo.service.impl;

import com.example.demo.entity.RiskAssessmentLog;
import com.example.demo.repository.RiskAssessmentLogRepository;
import com.example.demo.service.RiskAssessmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskAssessmentServiceImpl implements RiskAssessmentService {

    private final RiskAssessmentLogRepository repository;

    public RiskAssessmentServiceImpl(RiskAssessmentLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public void logRisk(RiskAssessmentLog log) {
        repository.save(log);
    }

    @Override
    public List<RiskAssessmentLog> getByLoanRequestId(Long loanRequestId) {
        return repository.findByLoanRequestId(loanRequestId);
    }
}
