package com.carlos.aprendendo_spring.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Anotação para indicar que esta classe é um serviço do Spring
@Service
public class ProdutoService {
    // Injeção de dependência do repositório de produtos para acessar os dados
    @Autowired
    private ProdutoRepository produtoRepository;
    public List<ProdutoModel> getAllProdutos() {
        // Método para obter todos os produtos do banco de dados
        return produtoRepository.findAll(); // Retorna a lista de produtos usando o método findAll do JpaRepository
    }
}
