package net.study.work_with_file.serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programmer2 {
    public static void main(String[] args) {
        // десереализация объекта
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.bin"))){
          List<String> list =  (ArrayList)objectInputStream.readObject();
            System.out.println(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
