package net.study.stream.lesson6_concat;

import java.util.stream.Stream;

public class TestConcat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = Stream.of(6,7,8,9);

        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        System.out.println(stream3); // 1,2,3,4,5,6,7,8,9
    }
}
