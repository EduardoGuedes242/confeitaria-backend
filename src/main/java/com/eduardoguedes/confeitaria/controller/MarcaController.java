package com.eduardoguedes.confeitaria.controller;

import com.eduardoguedes.confeitaria.entity.brand.Marca;
import com.eduardoguedes.confeitaria.entity.brand.MarcaRequestDTO;
import com.eduardoguedes.confeitaria.repository.MarcaRepository;
import com.eduardoguedes.confeitaria.service.MarcaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marca")
public class MarcaController {

  @Autowired
  private MarcaService marcaService;

  @PostMapping
  public ResponseEntity<Void> createMarca(@Valid @RequestBody MarcaRequestDTO marcaDTO) {
    Marca marca = new Marca(marcaDTO);
    marcaService.createMarca(marca);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }

  @GetMapping
  public List<Marca> getAllMarca() {
    return marcaService.findAllMarcas();
  }

}
