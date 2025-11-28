package br.edu.fatecou.projetowebback.entidades;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    // Atributos
    private String nome;
    private Integer quantidade;
    private Double preco;

}
