package com.codeclan.example.ComputerHomework.components;

import com.codeclan.example.ComputerHomework.models.File;
import com.codeclan.example.ComputerHomework.models.Folder;
import com.codeclan.example.ComputerHomework.models.User;
import com.codeclan.example.ComputerHomework.repositories.FileRepository;
import com.codeclan.example.ComputerHomework.repositories.FolderRepository;
import com.codeclan.example.ComputerHomework.repositories.UserRepository;
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
    FolderRepository userRepository;

    public DataLoader() {
    }
    public void run(ApplicationArguments args) {
        Folder documents = new Folder("Documents");
        folderRepository.save(documents);

        Folder downloads = new Folder("Downloads");
        folderRepository.save(downloads);

        File homework = new File("Homework", ".txt", 100, documents);
        fileRepository.save(homework);

        File taytay = new File("Taylor Swift New Track", ".mp3", 5,
                downloads);
        fileRepository.save(taytay);

        User user = new User("Steph");
        userRepository.save(user);

        User steph = new User("Dave",);
        userRepository.save(steph);
        


}