package com.spring.ecommer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommer.entity.Kategori;

public interface KategoriRepository extends JpaRepository<Kategori, String>{
    
}
