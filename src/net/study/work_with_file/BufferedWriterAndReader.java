package net.study.work_with_file;

import java.io.*;

public class BufferedWriterAndReader {
    public static void main(String[] args) {
        // копирует как можно больше элементов с файла в буфер, а затем с буффера куда-то
        // при записи в файл копирует как можно больше элементов в буфер, и затем за мало кол-во раз записывает с буфера в файл
        // Если не использовать буфер один элемент копируется за одно обращение к файлу(что намного дольше)
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Anonymous\\Desktop\\test1.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));){
            String temp;
            while ((temp=bufferedReader.readLine()) != null){
              bufferedWriter.write(temp + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
