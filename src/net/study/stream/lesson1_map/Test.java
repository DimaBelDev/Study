package net.study.stream.lesson1_map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    static List<Integer> changed(List<String> list, Function<String, Integer> function){
        List<Integer> returnList = new ArrayList<>();
        for(int i = 0; i < list.size();i++){
            returnList.add(function.apply(list.get(i)));
    }
        return returnList;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Privet");
        list.add("Poka");
        list.add("Kak Dela");


        //  List<Integer> list3 = changed(list, str -> str.length());
        //  System.out.println(list3);

        List<Integer> list2 = list.stream().map(str -> str.length()).collect(Collectors.toList());
        //   System.out.println(list2);
        int[] array = {1,2,3,4,5,6,7,8};
        array = Arrays.stream(array).map(p -> {
            if(p % 3 ==0){
                p = p / 3; }
            return p;
        }).toArray();
        //    System.out.println(Arrays.toString(array));

        Set<String> stringSet = new TreeSet<>(Set.of("Dima", "Igor", "Nikita", "Misha"));
        System.out.println(stringSet);
        List<Integer> list1 = stringSet.stream().map(p -> p.length()).collect(Collectors.toList());
        System.out.println(list1);
     }
}