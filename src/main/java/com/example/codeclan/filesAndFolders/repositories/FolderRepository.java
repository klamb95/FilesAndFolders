package com.example.codeclan.filesAndFolders.repositories;

import com.example.codeclan.filesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
