package net.study.work_with_file.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestChannelBufferReadFromFile {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test9.txt", "rw");
            FileChannel fileChannel = file.getChannel()){ // создание Channel

            ByteBuffer byteBuffer = ByteBuffer.allocate(25); // создание Buffer(просто блок памяти) размером в 25 байт

            StringBuilder stringBuilder = new StringBuilder();


             int byteRead = fileChannel.read(byteBuffer); // читает информацию из файла в буфер, и метод возвращает кол-во прочитаных байт

             while (byteRead > 0){
                 System.out.println("Read " + byteRead);

                 byteBuffer.flip(); // меняет из режима записи в режим чтения и ставим курсор на первый элемент

                 while (byteBuffer.hasRemaining()){ // читаем из буфера
                     stringBuilder.append((char)byteBuffer.get());
                 }
                 byteBuffer.clear(); // смещает курсор на первый элемент и перезаписывает в буфер инфу
                 byteRead = fileChannel.read(byteBuffer); // записываем в буфер
             }

            System.out.println(stringBuilder);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
