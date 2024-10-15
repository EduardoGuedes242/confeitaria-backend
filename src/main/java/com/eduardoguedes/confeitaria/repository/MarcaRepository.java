package com.eduardoguedes.confeitaria.repository;

import com.eduardoguedes.confeitaria.entity.brand.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
