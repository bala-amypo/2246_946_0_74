package com.example.demo.controller;

import com.example.demo.entity.LoanRequest;
import com.example.demo.service.LoanRequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loan-requests")
public class LoanRequestController {

    private final LoanRequestService loanService;

    public LoanRequestController(LoanRequestService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/")
    public ResponseEntity<LoanRequest> submitRequest(@RequestBody LoanRequest request) {
        LoanRequest savedRequest = loanService.submitRequest(request);
        return ResponseEntity.ok(savedRequest);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<LoanRequest>> getByUser(@PathVariable Long userId) {
        List<LoanRequest> requests = loanService.getRequestsByUser(userId);
        return ResponseEntity.ok(requests);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LoanRequest> getById(@PathVariable Long id) {
        LoanRequest request = loanService.getById(id);
        return ResponseEntity.ok(request);
    }

    @GetMapping("/")
    public ResponseEntity<List<LoanRequest>> getAll() {
        List<LoanRequest> requests = loanService.getAllRequests();
        return ResponseEntity.ok(requests);
    }
}
