package com.spring.ecommer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ecommer.entity.Keranjang;

import java.util.List;
import java.util.Optional;

public interface KeranjangRepository  extends JpaRepository<Keranjang, String>{

    Optional<Keranjang> findByPenggunaIdAndProdukId(String username, String produk);

    List<Keranjang> findByPenggunaId(String username);
}
