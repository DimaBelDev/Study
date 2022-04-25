package net.study.work_with_file.io;

import java.io.*;

public class FileInAndOutputStream {
    public static void main(String[] args) {
        // используем с бинарными данными
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\Anonymous\\Desktop\\java_pic.png"));
        // принцип работы буфера одинаковый с FileWriter или FileReader
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Anonymous\\Desktop\\java_pic.png");
            FileOutputStream fileOutputStream = new FileOutputStream("java-pic.jpeg")){
            int temp;
            while ((temp=fileInputStream.read()) != -1){
                fileOutputStream.write(temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
