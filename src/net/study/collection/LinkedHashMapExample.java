package net.study.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> list =
                new LinkedHashMap<>(16, 0.75f, true);
        // LinkedHashMap хранит порядок(поэтому элементы хранятся в порядке добавления)
        // Можно ничего не задавать в конструктор по дефолту false
        // Если в параметрах указан false то при получение элемента из листа его порядок будет оставаться преждним
        // Если true то при получение элемента он становится на последнее место в списке

        list.put(23, "Nasta");
        list.put(21, "Artur");
        list.put(18,"Liza");
        list.put(29, "Denis");
        list.put(17, "Marina");

        System.out.println("Before : " + list);
        list.get(18);
        System.out.println("After : " + list);

    }
}
