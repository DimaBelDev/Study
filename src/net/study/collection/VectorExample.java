package net.study.collection;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(List.of("Dima","Masha","Sveta","Doma")); // устаревший синхронизированный тип

        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.remove(2));
        System.out.println(vector);


    }
}
