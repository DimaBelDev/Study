package net.study.work_with_file.io.serialization;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFile {
    // класс   File позволяет управлять информацией о директориях и файлах
    public static void main(String[] args) throws IOException {
          File file1 = new File("test9.txt"); // этот путь к файлу является относительным к проекту, не абсолютным
         File file2 = new File("C:\\Users\\Anonymous\\Desktop\\test1.txt");
         File folder = new File("C:\\Users\\Anonymous\\Desktop\\A");
        System.out.println("_____________________________________________________");
        System.out.println(file1.isAbsolute()); // false
        System.out.println(file2.isAbsolute()); // true
        System.out.println("_____________________________________________________");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
        System.out.println("_____________________________________________________");
        System.out.println(file1.isDirectory()); // является это папкой
        System.out.println(file1.isDirectory());
        System.out.println("_____________________________________________________");
        System.out.println(file1.exists()); // проверяет существует ли файл
        System.out.println(file2.exists());
        System.out.println("_____________________________________________________");
        // System.out.println(file1.createNewFile()); // создает файл если его нет
        System.out.println(folder.mkdir()); // создает папку
        System.out.println("_____________________________________________________");
        System.out.println(file1.length()); // размер файла в mb
        System.out.println(folder.length()); // размер папки
        System.out.println("_____________________________________________________");
        System.out.println(file1.delete()); // удаляет файл
        System.out.println(folder.delete()); // удаляет папку, но только если она пуста
        System.out.println("______________________________________________________");
        File[] files = folder.listFiles(); // какие файлы содержит папка
        System.out.println(Arrays.toString(files));
        System.out.println("_______________________________________________________");
        System.out.println(file1.isHidden());// скрыта или нет
        System.out.println(file1.canRead()); // можем ли читать
        System.out.println(file1.canWrite()); // можем ли писать
        System.out.println(file1.canExecute()); // можем ли исполнять


    }
}
