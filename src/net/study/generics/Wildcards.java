package net.study.generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(1);
        showElementsFromList(list1);
        List<?> list2 = new ArrayList<String>();
        // list2.add("Srr"); так не можем ,так как не может понять
        List<? extends Number> list3 = new ArrayList<Integer>();
        // list3.add(1);  тоже не можем

    }

    public static void showElementsFromList (List<?> list){ // ? означает любой тип данных, но добавлять мы не можем
        System.out.println(list);

    }

    public static double sum (List<? extends Number> list){
        double res = 0.0;
        for(Number x : list){
            res += x.doubleValue();
        }
        return res;
    }
}
