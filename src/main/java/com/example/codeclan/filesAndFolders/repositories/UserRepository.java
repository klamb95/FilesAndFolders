package com.example.codeclan.filesAndFolders.repositories;

import com.example.codeclan.filesAndFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
