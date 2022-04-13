package net.study.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(12312,"Roma");
        myMap.put(1000,"Igor");
        myMap.put(13123,"Slava");
        myMap.put(3232,"Vita");

        System.out.println(myMap.get(13123)); // получение значения

        myMap.put(1000, "Dima"); // если ключи одинаковые заменяется на последний

        myMap.remove(12312); //удаление элемента

        myMap.putIfAbsent(3232, "ASDADS"); //если такой ключ есть не будет ложить элемент

        System.out.println(myMap.containsKey(1000)); // содержит ли указанный ключ
        myMap.containsValue("Slava"); // содержит ли указанное значение

        myMap.keySet(); //получение всех ключей
        myMap.values(); // получение всех значений

        for(Map.Entry<Integer, String> x : myMap.entrySet()){
            System.out.println(x.getKey() + " : " + x.getValue());
        }

        System.out.println(myMap);



    }
}
