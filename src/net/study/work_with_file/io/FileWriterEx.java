package net.study.work_with_file.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {

        String s = "Hello world!";
        FileWriter fileWriter = null;

        try {
            // если указать test1.txt(без всего остального) создастся файл в корне проекта
            fileWriter = new FileWriter("C:\\Users\\Anonymous\\Desktop\\test1.txt", true);
            // если true тогда то что мы записываем добавится в конец того что есть в файле
//            for(int i = 0; i < s.length();i++){
//                fileWriter.write(s.charAt(i));
//            }
            fileWriter.write(s);// можно сразу String, но под капотом переобразуется и запишется в байтах
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileWriter.close(); // если не закроем то не запишется
        }

    }
}
