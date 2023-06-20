package com.spring.ecommer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommer.entity.PesananItem;

public interface PesananItemRepository  extends JpaRepository<PesananItem, String>{
    
}
