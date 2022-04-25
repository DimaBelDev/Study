package net.study.work_with_file.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("test10.txt", "rw");
            FileChannel file = randomAccessFile.getChannel();){

            ByteBuffer buffer = ByteBuffer.allocate(5);

            file.read(buffer);
            // в буфере есть (a b c d e) f g h i j(эти еще в файле)
            buffer.flip();
            System.out.println((char)buffer.get());// a
            System.out.println((char)buffer.get());// b
            System.out.println((char)buffer.get());// c
            buffer.rewind(); //возвращается в начало буфера
            System.out.println((char)buffer.get());// a

            System.out.println("_________________________________________");
            buffer.compact(); // прочитав один символ из буфера(a) осталось в буфере b c d e
            // затем вызвали compact и он на место прочитаных элементов запишет элементы с файла
            // но только элементы которые были сдвинет в начало а остальные запишет в конец
            file.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }
            System.out.println("________________________________________");
            buffer.clear(); // очистили буфер
            // записали g h i j
            file.read(buffer);
            // сместили позицию для чтения
            buffer.flip();
            // вывели один элемент
            System.out.println((char)buffer.get());
            // пометили следующий элемент
            buffer.mark();
            System.out.println((char)buffer.get());// продолжили вывод
            System.out.println((char)buffer.get());
            buffer.reset(); // возвратились к помеченому элементу
            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
