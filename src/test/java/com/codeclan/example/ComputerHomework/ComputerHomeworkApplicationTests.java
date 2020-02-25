package com.codeclan.example.ComputerHomework;

import com.codeclan.example.ComputerHomework.models.File;
import com.codeclan.example.ComputerHomework.models.Folder;
import com.codeclan.example.ComputerHomework.models.User;
import com.codeclan.example.ComputerHomework.repositories.FileRepository;
import com.codeclan.example.ComputerHomework.repositories.FolderRepository;
import com.codeclan.example.ComputerHomework.repositories.UserRepository;
import org.apache.catalina.Store;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ComputerhomeworkApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndFolder(){
		Folder folder = new Folder("Documents");
		folderRepository.save(folder);


		File taytay = new File("Taylor Swift New Track", ".mp3", 3, folder);
		fileRepository.save(taytay);
	}

	@Test
	public void addFilesAndUsers(){
		Folder folder = new Folder("Documents");
		folderRepository.save(folder);

		File file1 = new File("Homework", ".txt", 100, folder);
		fileRepository.save(file1);

		User user1 = new User("Steph");
		userRepository.save(user1);

		user1.addFile(file1);
		userRepository.save(user1);

	}

}
