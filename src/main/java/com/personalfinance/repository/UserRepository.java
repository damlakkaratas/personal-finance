package com.personalfinance.repository;

import com.personalfinance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getUserById(Long id);
}