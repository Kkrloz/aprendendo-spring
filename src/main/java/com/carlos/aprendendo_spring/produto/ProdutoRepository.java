package com.carlos.aprendendo_spring.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface de repositório para a entidade ProdutoModel, estendendo JpaRepository para fornecer operações CRUD
public interface ProdutoRepository extends JpaRepository <com.carlos.aprendendo_spring.produto.ProdutoModel, Long> {
    // Aqui você pode adicionar métodos personalizados de consulta, se necessário
    List<ProdutoModel> findByStatusAndNome(String status, String nome); // método personalizado para encontrar produtos por status e nome
    List<ProdutoModel> findTop10ByStatus(String status); // método personalizado para encontrar os 10 primeiros produtos por status
}
