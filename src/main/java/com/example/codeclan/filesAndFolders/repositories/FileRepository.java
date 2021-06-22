package com.example.codeclan.filesAndFolders.repositories;

import com.example.codeclan.filesAndFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
