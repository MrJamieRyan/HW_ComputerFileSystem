package com.codeclan.example.ComputerHomework.repositories;

import com.codeclan.example.ComputerHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
