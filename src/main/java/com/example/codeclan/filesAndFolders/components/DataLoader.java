package com.example.codeclan.filesAndFolders.components;

import com.example.codeclan.filesAndFolders.models.File;
import com.example.codeclan.filesAndFolders.models.Folder;
import com.example.codeclan.filesAndFolders.models.User;
import com.example.codeclan.filesAndFolders.repositories.FileRepository;
import com.example.codeclan.filesAndFolders.repositories.FolderRepository;
import com.example.codeclan.filesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args){
        Folder testFolder = new Folder("Kierans Folder");
        folderRepository.save(testFolder);
        Folder testFolder2 = new Folder("Aidans Foler");
        folderRepository.save(testFolder2);
        File test1 = new File("Kieran test", "txt", 2, testFolder );
        fileRepository.save(test1);
        File test2 = new File("Aidans Test", "png", 3, testFolder2);
        fileRepository.save(test2);
        User kieran = new User("Kieran");
        userRepository.save(kieran);
        User aidan = new User("Aidan");
        userRepository.save(aidan);
    }
}
