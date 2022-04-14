package net.study.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethodTwo {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder sb5 = new StringBuilder("F");
        StringBuilder[] arraySB = {sb1,sb2,sb3,sb4,sb5};
        List<StringBuilder> list2 = Arrays.asList(arraySB); //добавление массива
        System.out.println(list2);
        arraySB[0].append("I");
        arraySB[1] = new StringBuilder("SMTH");
        System.out.println(list2);
        System.out.println("___________________________________");
/////////////////////////////////////////////////////////////////////////////////////////
        List<String> list1 = new ArrayList<>();
        list1.add("Dima");
        list1.add("Sasha");
        list1.add("Igor");
        list1.add("Maryna");
        List<String> list3 = new ArrayList<>();
        list3.add("Dima");
        list3.add("Maryna");
        list3.add("Igor");
        System.out.println(list1.containsAll(list3)); //проверяет есть ли все элементы
        // list1.removeAll(list3); // даляет все одинаковые элементы с list1
         list1.retainAll(list3); //оставляет только те элементы в list1 которые содержатся в list3, остальные удаляет
        System.out.println(list1);
////////////////////////////////////////////////////////////////////////////////////////////
        List<String> list4 = new ArrayList<>();
        list4.add("Dima");
        list4.add("Sasha");
        list4.add("Igor");
        list4.add("Maryna");
        List<String> list5 = list4.subList(1,3); // берем элементы list4 c 1 по 3(ТРЕТИЙ НЕ ВКЛЮЧИТЕЛЬНО)
        list5.add("New Person"); // при добавлении в list5, добавляется и в list4 так как они связанны
        System.out.println("SubList "+ list5);
        System.out.println("ArrayList " + list4);
/////////////////////////////////////////////////////////////////////////////////////////////
        List<Integer> list6 = List.of(1,4,6,7);
        // list6.add(14); мы не можем добавлять
        // List<Integer> list6 = new ArrayList<>(List.of(1,4,6,7)); // если так то можем добалять
        System.out.println(list6);

        List<Integer> list7 = List.copyOf(list6); // копируем элементы
        // list7.add(12); // добавлять не можем только если обернуть в ArrayList
        System.out.println(list7);
        System.out.println("_____________________________");
//////////////////////////////////////////////////////////////////////////////////////////////
        List<String> list8 = new ArrayList<>();
        list8.add("Dima");
        list8.add("Sasha");
        list8.add("Igor");
        list8.add("Maryna");

        Object[] arrayO = list8.toArray(); // помещение элементов в массив Object
        String[] arrayString = list8.toArray(new String[0]); // 0 это дефолт, сам подберет длину, можем поставить свою длину
        System.out.println(Arrays.toString(arrayString));



    }
}
