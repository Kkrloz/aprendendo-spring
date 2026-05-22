package com.carlos.aprendendo_spring.users;

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
@Table(name = "users")
// Anotações do Lombok para gerar getters, setters, construtores
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
}
