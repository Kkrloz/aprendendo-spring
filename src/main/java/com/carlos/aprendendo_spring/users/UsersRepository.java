package com.carlos.aprendendo_spring.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersModel, Long> {
}
