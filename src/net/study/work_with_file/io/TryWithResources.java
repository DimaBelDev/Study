package net.study.work_with_file.io;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        String s = "Hello world!";


        try (FileWriter fileWriter = new FileWriter("C:\\Users\\Anonymous\\Desktop\\test1.txt", true);){
            fileWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
