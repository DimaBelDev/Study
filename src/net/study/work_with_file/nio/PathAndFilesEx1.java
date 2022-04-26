package net.study.work_with_file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("C:\\Users\\Anonymous\\Desktop\\A");
        Path filePath = Paths.get("test9.txt");

//        System.out.println(folderPath.getFileName()); // как называется файл
//        System.out.println(filePath.getFileName());
//        System.out.println("________________________________________________");
//        System.out.println(folderPath.getParent());
//        System.out.println(filePath.getParent());
//        System.out.println("________________________________________________");
//        System.out.println(folderPath.getRoot()); // показывает начальную папку
//        System.out.println(filePath.getRoot());
//        System.out.println("________________________________________________");
//        System.out.println(folderPath.isAbsolute()); // абсолютны ли путь указан
//        System.out.println(filePath.isAbsolute());
//        System.out.println("________________________________________________");
//        System.out.println(folderPath.toAbsolutePath()); // показывает абсолютный путь
//        System.out.println(filePath.toAbsolutePath());
//        System.out.println("________________________________________________");
//        System.out.println(folderPath.toAbsolutePath().getParent());
//        System.out.println(filePath.toAbsolutePath().getRoot());
//        System.out.println("_________________________________________________");
//        System.out.println(folderPath.resolve(filePath)); // объединяет два пути(тот что в параметрах добавляем в конец)
//        System.out.println("_________________________________________________");
        Path otherPath = Paths.get("C:\\Users\\Anonymous\\Desktop\\A\\N\\test20.txt");
        System.out.println(folderPath.relativize(otherPath)); // относительный путь пути который находится в параметрах
//        System.out.println("_________________________________________________");
        // Files
        Path pathForFiles = Paths.get("C:\\Users\\Anonymous\\Desktop\\M");
        Path pathForFilesTwo = Paths.get("C:\\Users\\Anonymous\\Desktop\\test20.txt");
        if(!Files.exists(pathForFiles)){
            Files.createDirectory(pathForFiles);
        }
        if(!Files.exists(pathForFilesTwo)){
            Files.createFile(pathForFilesTwo);
        }
        System.out.println(Files.isWritable(pathForFiles)); // можем ли писать
        System.out.println(Files.isReadable(pathForFiles));
        System.out.println(Files.isExecutable(pathForFiles)); // можем ли выполнять
        System.out.println("___________________________________");
        System.out.println(Files.isSameFile(pathForFiles, pathForFilesTwo)); // ссылаются ли оба пути на один и тот же файл
        System.out.println("___________________________________");
        System.out.println(Files.size(filePath)); // размер файла в байтах
        System.out.println("___________________________________");
        System.out.println(Files.getAttribute(filePath, "creationTime"));
        System.out.println("___________________________________");
        Map<String, Object> mapAttributes = Files.readAttributes(filePath, "*"); // чтение всех атрибутов
        for(Map.Entry<String, Object> i : mapAttributes.entrySet()){
            System.out.println(i.getKey() + " : " + i.getValue());
        }
    }
}
