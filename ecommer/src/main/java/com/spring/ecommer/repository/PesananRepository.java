package com.spring.ecommer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommer.entity.Pesanan;

public interface PesananRepository extends JpaRepository<Pesanan, String> {
    
}
