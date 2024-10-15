package com.eduardoguedes.confeitaria.entity.brand;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "marca")
public class Marca {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mrc_id")
  private Long mrcId;

  @Column(name = "mrc_nome")
  private String mrcNome;

  public Marca(MarcaRequestDTO marcaDTO) {
    this.mrcNome = marcaDTO.nome();
  }
}
