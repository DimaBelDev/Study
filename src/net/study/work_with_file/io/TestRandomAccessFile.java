package net.study.work_with_file.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) {
        // RandomAccessFile позволяет писать и читать в(или с) любого места в файле
        // второй параметр rw говорит что будем и писать и читать в файл(можем r или w)
        try(RandomAccessFile file = new RandomAccessFile("test9.txt", "rw")) {

             String t = file.readLine();
            System.out.println(t);
              file.seek(300); // с какого элемента начинаем
              file.seek(file.length()); //последний элемент
            System.out.println(file.getFilePointer());// показывает на каком мы элементе




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
