package com.spring.ecommer.service;

import com.spring.ecommer.entity.Kategori;
import com.spring.ecommer.exception.ResourceNotFoundException;
import com.spring.ecommer.repository.KategoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class KategoriService {
    @Autowired
    private KategoriRepository kategoriRepository;

    public Kategori findById(String id) {
        return kategoriRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("kategori dengan id " + id + "tidak ditemukan"));
    }
    public List<Kategori> findAll(){
        return  kategoriRepository.findAll();
    }

    public Kategori create (Kategori kategori){
        kategori.setId(UUID.randomUUID().toString());
      return kategoriRepository.save(kategori);
    }

    public Kategori edit (Kategori kategori){
        return kategoriRepository.save(kategori);
    }

    public void deleteById(String id){
        kategoriRepository.deleteById(id);
    }


}
