package net.study.stream.lesson8_count;

import java.util.stream.Stream;

public class TestCount {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,1,2,3);

        //System.out.println(stream1.count()); //  возвращает кол-во элементов
        System.out.println(stream1.distinct().count());
    }
}