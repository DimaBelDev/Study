package net.study.stream.lesson15_skip;

import java.util.ArrayList;
import java.util.List;

public class TestSkip {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2,3,1,43,231,5,31,123));

        list.stream().filter(e -> e > 30).skip(2).forEach(System.out::println);
        // skip пропускае указанное кол-во элементов
    }
}
