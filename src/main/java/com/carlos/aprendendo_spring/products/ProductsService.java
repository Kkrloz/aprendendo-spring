package com.carlos.aprendendo_spring.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Anotação para indicar que esta classe é um serviço do Spring
@Service
public class ProductsService {
    // Injeção de dependência do repositório de produtos para acessar os dados
    @Autowired
    private ProductsRepository productsRepository;
    public List<ProductsModel> getAllProducts() {
        // Método para obter todos os produtos do banco de dados
        return productsRepository.findAll(); // Retorna a lista de produtos usando o método findAll do JpaRepository
    }
    public List<ProductsModel> getProductsByStatusAndNome(String status, String nome) {
        // Método para obter produtos filtrados por status e nome
        return productsRepository.findByStatusAndNome(status, nome); // Retorna a lista de produtos usando o método personalizado do repositório
    }
    public List<ProductsModel> getTop10ProductsByStatus(String status) {
        // Método para obter os 10 primeiros produtos filtrados por status
        return productsRepository.findTop10ByStatus(status); // Retorna a lista de produtos usando o método personalizado do repositório
    }
    public String createProduct(ProductsModel product) {
        // Método para criar um novo produto, salvando-o no banco de dados
        productsRepository.save(product); // Salva o produto usando o método save do JpaRepository
    return "Produto criado com sucesso!"; // Retorna uma mensagem de sucesso após criar o produto
    }
    public String updateProduct(Long id, ProductsModel updatedProduct) {
        // Método para atualizar um produto existente, encontrando-o pelo ID e salvando as alterações
        return productsRepository.findById(id) // Tenta encontrar o produto pelo ID usando o método findById do JpaRepository
            .map(product -> { // Se o produto for encontrado, executa a função lambda para atualizar os campos
                product.setNome(updatedProduct.getNome()); // Atualiza o nome do produto
                product.setStatus(updatedProduct.getStatus()); // Atualiza o status do produto
                product.setDescricao(updatedProduct.getDescricao()); // Atualiza a descrição do produto
                productsRepository.save(product); // Salva as alterações usando o método save do JpaRepository
                return "Produto atualizado com sucesso!"; // Retorna uma mensagem de sucesso após atualizar o produto
            })
            .orElse("Produto não encontrado."); // Se o produto não for encontrado, retorna uma mensagem de erro
    }
    public String deleteProduct(Long id) {
        // Método para deletar um produto existente, encontrando-o pelo ID e removendo-o do banco de dados
        return productsRepository.findById(id) // Tenta encontrar o produto pelo ID usando o método findById do JpaRepository
            .map(product -> { // Se o produto for encontrado, executa a função lambda para deletar o produto
                productsRepository.delete(product); // Deleta o produto usando o método delete do JpaRepository
                return "Produto deletado com sucesso!"; // Retorna uma mensagem de sucesso após deletar o produto
            })
            .orElse("Produto não encontrado."); // Se o produto não for encontrado, retorna uma mensagem de erro
    }
}
