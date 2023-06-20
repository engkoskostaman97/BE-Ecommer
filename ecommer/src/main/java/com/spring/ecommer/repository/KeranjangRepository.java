package com.spring.ecommer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommer.entity.Keranjang;

public interface KeranjangRepository  extends JpaRepository<Keranjang, String>{
    
}
