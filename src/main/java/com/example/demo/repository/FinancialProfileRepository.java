package com.example.demo.repository;

import com.example.demo.entity.FinancialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface FinancialProfileRepository extends JpaRepository<FinancialProfile, Long> {

    Optional<FinancialProfile> findByUserId(Long userId);

    List<FinancialProfile> findAll();
}
