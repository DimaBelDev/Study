package net.study.work_with_file.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Programmer1 {
    public static void main(String[] args) {
        // сереализация объекта
        List<String> list = new ArrayList<>(List.of("Dima", "Roma", "Andrey"));
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.bin"))){
            objectOutputStream.writeObject(list);
       } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
