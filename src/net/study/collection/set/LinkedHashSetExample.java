package net.study.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    // LinkedHashSet хранит порядок(поэтому элементы хранятся в порядке добавления)
    // под капотом использует HashMap(в качестве значение в HashMap использует константу, это не важно)
    // обязательно как и в любом Hash(коллекции) если работаем с объектом переопределять hashcode and equals

    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(2);

        System.out.println(linkedHashSet.contains(2));



    }
}
