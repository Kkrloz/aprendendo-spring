package com.carlos.aprendendo_spring.produto;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Anotação para indicar que esta classe é um controlador REST do Spring
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoService produtoService;
    
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<ProdutoModel> getAllProdutos() {
        // Método para obter todos os produtos, chamando o método do serviço de produtos
        return produtoService.getAllProdutos(); // Retorna a lista de produtos obtida do serviço
    }
}
