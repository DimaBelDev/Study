package net.study.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratroExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dima");
        list.add("Sasha");
        list.add("Igor");
        list.add("Maryna");


        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove(); // мы не может удалить элемент пока не получили его в next
        }

    }
}
