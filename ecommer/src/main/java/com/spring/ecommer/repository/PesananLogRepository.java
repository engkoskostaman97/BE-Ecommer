package com.spring.ecommer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommer.entity.PesananLog;

public interface PesananLogRepository extends JpaRepository<PesananLog, String> {
    
}
