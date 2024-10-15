package com.eduardoguedes.confeitaria.service;

import com.eduardoguedes.confeitaria.entity.brand.Marca;
import com.eduardoguedes.confeitaria.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {

  @Autowired
  private MarcaRepository marcaRepository;

  public List<Marca> findAllMarcas() {
    return  marcaRepository.findAll();
  }

  public void createMarca(Marca marca) {
    marcaRepository.save(marca);
  }
}
