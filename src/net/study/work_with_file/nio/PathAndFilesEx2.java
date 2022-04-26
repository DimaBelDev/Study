package net.study.work_with_file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path directoryPath = Paths.get("C:\\Users\\Anonymous\\Desktop\\A");
        Path filePath = Paths.get("test9.txt");

        // Files.copy(filePath, directoryPath.resolve(filePath));
        // Files.copy(filePath, directoryPath.resolve("test15.txt")); // по какому пути и куда буду копировать
        // Files.copy(filePath, directoryPath.resolve(filePath),
        //        StandardCopyOption.REPLACE_EXISTING); // если файл уже существует, но хочу переписать его
                                                               // то использую StandardCopyOption.REPLACE_EXISTING
//        Files.move(filePath, directoryPath.resolve("test11.txt")); // перемещает файл
//        Files.delete(Paths.get("test10.txt")); // удаление файла,

            Path filePathTwo = Paths.get("test11.txt");
////        Files.createFile(filePathTwo);
////        String text = "-Hey\n-How are you\n-I am fine, And you\n-I am too";
////        Files.write(filePathTwo, text.getBytes());
        List<String> list =  Files.readAllLines(filePathTwo);
        for(String i : list){
            System.out.println(i);
        }



    }
}
