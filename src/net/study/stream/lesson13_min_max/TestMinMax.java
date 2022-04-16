package net.study.stream.lesson13_min_max;

import java.util.ArrayList;
import java.util.List;

public class TestMinMax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(4,5,2,12,44,5,63));
        int min = list.stream().distinct().min((e1,e2) -> e1 - e2).get();
        int max = list.stream().distinct().max((e1, e2) -> e1 - e2).get();

        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}
