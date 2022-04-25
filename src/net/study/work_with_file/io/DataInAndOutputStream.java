package net.study.work_with_file.io;

import java.io.*;

public class DataInAndOutputStream {
    public static void main(String[] args) {
        // формат bin (Файл BIN хранит данные в двоичном(бинарном) формате)
        // Используется для примитивных типов данных

        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("java_simple.bin"));
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream("java_simple.bin"))){
              dataOutputStream.writeByte(123);
              dataOutputStream.writeBoolean(true);
              dataOutputStream.writeInt(1_000);
              dataOutputStream.writeChar('n');
              dataOutputStream.writeLong(1_000_000L);
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readChar());
            System.out.println(dataInputStream.readLong());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
