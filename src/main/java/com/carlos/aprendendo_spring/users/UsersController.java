package com.carlos.aprendendo_spring.users;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    private UsersService userService;

    public UsersController(UsersService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UsersModel> getAllUsers() {
        // Método para obter todos os usuários, chamando o método do serviço de usuários
        return userService.getAllUsers(); // Retorna a lista de usuários obtida do serviço
    }
}
