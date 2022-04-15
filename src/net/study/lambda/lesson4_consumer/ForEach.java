package net.study.lambda.lesson4_consumer;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();
        listString.add("Hello");
        listString.add("How are you?");
        listString.add("I am normal, and you");
        listString.add("I am too");
        listString.add("Bye");

        listString.forEach(str -> System.out.println(str));

        System.out.println("----------------------------");

        List<Integer> listInteger = new ArrayList<>(List.of(1,2,3,4,5));

        listInteger.forEach(number -> {System.out.println("Before : " + number); number*=2;
            System.out.println("After : " + number);});
    }
}
