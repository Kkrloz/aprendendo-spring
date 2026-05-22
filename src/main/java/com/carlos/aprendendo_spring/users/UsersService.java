package com.carlos.aprendendo_spring.users;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsersService {
    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<UsersModel> getAllUsers() {
        // Método para obter todos os usuários do banco de dados
        return usersRepository.findAll(); // Retorna a lista de usuários usando o método findAll do JpaRepository
    }   
}
