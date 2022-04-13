package net.study.collection;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, String> treeMap = new TreeMap<>(); // все ключи идут по возрастанию
        //ЕСЛИ В КАЧЕСТВЕ КЛЮЧА ПЕРЕДАЕТСЯ ОБЪЕКТ, ТО ОБЯЗАТЕЛЬНО ПЕРЕОПРЕДЕЛИТЬ COMPARABLE ИЛИ COMPARATOR(В ПАРАМЕТРЫ TreeMap)
        treeMap.put(4.6, "Dima");
        treeMap.put(8.4, "Sveta");
        treeMap.put(7.6, "Vika");
        treeMap.put(3.8, "Nasta");
        treeMap.put(8.8, "Andrey");

        treeMap.put(7.6, "&&&&&&&&"); // при добавлении элемента с одинаковым ключом остается последний
        //System.out.println(treeMap);
        //System.out.println(treeMap.descendingMap()); //выводит ключи по убыванию
               treeMap.remove(3.8); // удаляет
        //System.out.println(treeMap.tailMap(5.2)); // выводит все элементы которые больше 5.2
        //System.out.println(treeMap.headMap(7.7)); // выводит все элементы которые меньше 7.7

        treeMap.firstEntry();//вернет первый элемент, то есть самый маленький
        treeMap.lastEntry();// вернет последний элемент
    }
}
