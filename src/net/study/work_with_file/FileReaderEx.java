package net.study.work_with_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        {
            try {
                fileReader = new FileReader("C:\\Users\\Anonymous\\Desktop\\test1.txt");
                int temp;
                while ((temp=fileReader.read()) != -1){
                    System.out.print((char)temp);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                fileReader.close();
            }
        }
    }
}
