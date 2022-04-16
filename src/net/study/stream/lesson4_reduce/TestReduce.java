package net.study.stream.lesson4_reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestReduce {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int number = list.stream().reduce((acc, elm) -> acc*elm).orElseGet(() -> -1);

        // System.out.println(number);

        List<String> list1 = new ArrayList<>(List.of("Hello", "How are you", "Bye"));
        String str = list1.stream().reduce("Start",(ac, el)-> ac + " " + el);

        System.out.println(str);
    }
}
