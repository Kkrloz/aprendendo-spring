package com.carlos.aprendendo_spring.products;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Anotação para indicar que esta classe é uma entidade JPA
@Entity
@Table(name = "products")
// Anotações do Lombok para gerar getters, setters, construtores
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsModel {
    // Anotação para indicar que este campo é a chave primária
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String status;
    private String descricao;
}
