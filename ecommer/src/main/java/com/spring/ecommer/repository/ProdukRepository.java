package com.spring.ecommer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommer.entity.Produk;

public interface ProdukRepository extends  JpaRepository<Produk, String>{
    
}
