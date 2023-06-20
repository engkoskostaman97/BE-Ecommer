package com.spring.ecommer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommer.entity.Pengguna;

public interface PenggunaRepository extends JpaRepository<Pengguna, String> {

    boolean existsByEmail(String email);
}
