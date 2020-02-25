package com.codeclan.example.ComputerHomework.repositories;

import com.codeclan.example.ComputerHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
