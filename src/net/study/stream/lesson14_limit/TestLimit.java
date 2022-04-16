package net.study.stream.lesson14_limit;

import java.util.ArrayList;
import java.util.List;

public class TestLimit {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(23,12,43,23,2,4,7,21));

        list.stream().distinct().filter(e -> e > 10).limit(2).forEach(System.out::println);
        // limit - ограничивает кол-во элементов 

    }
}
