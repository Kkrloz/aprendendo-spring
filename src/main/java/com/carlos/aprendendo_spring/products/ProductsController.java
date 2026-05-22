package com.carlos.aprendendo_spring.products;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Anotação para indicar que esta classe é um controlador REST do Spring
@RestController
@RequestMapping("/products")
public class ProductsController {

    private ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping
    public List<ProductsModel> getAllProducts() {
        // Método para obter todos os produtos, chamando o método do serviço de produtos
        return productsService.getAllProducts(); // Retorna a lista de produtos obtida do serviço
    }

    @PostMapping
    public void createProduct(@RequestBody ProductsModel product) {
        // Método para criar um novo produto, chamando o método do serviço de produtos
        productsService.createProduct(product); // Chama o método do serviço para criar um novo produto
    }
    @PutMapping
    public String updateProduct(@RequestParam Long id, @RequestBody ProductsModel updatedProduct) {
        // Método para atualizar um produto existente, chamando o método do serviço de produtos
        return productsService.updateProduct(id, updatedProduct); // Chama o método do serviço para atualizar um produto e retorna a resposta
    }
    @DeleteMapping
    public String deleteProduct(@RequestParam Long id) {
        // Método para deletar um produto existente, chamando o método do serviço de produtos
        return productsService.deleteProduct(id); // Chama o método do serviço para deletar um produto e retorna a resposta
    }
}