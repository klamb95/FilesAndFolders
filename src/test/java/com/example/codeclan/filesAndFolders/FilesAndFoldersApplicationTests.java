package com.example.codeclan.filesAndFolders;

import com.example.codeclan.filesAndFolders.models.File;
import com.example.codeclan.filesAndFolders.models.Folder;
import com.example.codeclan.filesAndFolders.models.User;
import com.example.codeclan.filesAndFolders.repositories.FileRepository;
import com.example.codeclan.filesAndFolders.repositories.FolderRepository;
import com.example.codeclan.filesAndFolders.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jws.soap.SOAPBinding;

@SpringBootTest
class FilesAndFoldersApplicationTests {
	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolder(){
		Folder folder = new Folder("Testy");
		folderRepository.save(folder);

		File file = new File("Testy", "Test", 2, folder);
		fileRepository.save(file);
	}

	@Test public void addFoldersAndUsers(){
		Folder folder = new Folder("Revenge of the Test");
		folderRepository.save(folder);

		User user = new User("TESTY");
		userRepository.save(user);
	}


}
