package com.codeclan.example.ComputerHomework.repositories;

import com.codeclan.example.ComputerHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
