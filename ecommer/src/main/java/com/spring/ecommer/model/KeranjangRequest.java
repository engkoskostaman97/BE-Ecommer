package com.spring.ecommer.model;

import com.spring.ecommer.service.KeranjangService;
import lombok.Data;

import java.io.Serializable;
@Data
public class KeranjangRequest implements Serializable {
  private  String produkId;
  private  Double kuantitas;
}
