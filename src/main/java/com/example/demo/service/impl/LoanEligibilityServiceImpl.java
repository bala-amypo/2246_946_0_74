package com.example.demo.service.impl;

import com.example.demo.entity.EligibilityResult;
import com.example.demo.entity.LoanRequest;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.EligibilityResultRepository;
import com.example.demo.repository.LoanRequestRepository;
import com.example.demo.service.LoanEligibilityService;
import org.springframework.stereotype.Service;

@Service
public class LoanEligibilityServiceImpl implements LoanEligibilityService {

    private final LoanRequestRepository loanRepository;
    private final EligibilityResultRepository eligibilityRepository;

    public LoanEligibilityServiceImpl(LoanRequestRepository loanRepository,
                                      EligibilityResultRepository eligibilityRepository) {
        this.loanRepository = loanRepository;
        this.eligibilityRepository = eligibilityRepository;
    }

    @Override
    public EligibilityResult evaluateEligibility(Long loanRequestId) {

        LoanRequest loan = loanRepository.findById(loanRequestId)
                .orElseThrow(() -> new ResourceNotFoundException("Loan request not found"));

        EligibilityResult result = new EligibilityResult();
        result.setLoanRequest(loan);

        if (loan.getAmount() <= 500000) {
            result.setEligible(true);
            result.setReason("Eligible based on amount");
            loan.setStatus("APPROVED");
        } else {
            result.setEligible(false);
            result.setReason("Loan amount exceeds limit");
            loan.setStatus("REJECTED");
        }

        loanRepository.save(loan);
        return eligibilityRepository.save(result);
    }

    @Override
    public EligibilityResult getByLoanRequestId(Long loanRequestId) {
        return eligibilityRepository.findByLoanRequestId(loanRequestId)
                .orElseThrow(() -> new ResourceNotFoundException("Eligibility result not found"));
    }
}
