package net.study.stream.lesson7_distinct;

import java.util.stream.Stream;

public class TestDistinct {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,1,2,3);

        stream1.distinct().forEach(System.out::println); // ДЕЛАЕТ СТРИМ БЕЗ ПОВТОРОВ(ЕСЛИ ЕСТЬ ДВА ОДИНАКОВЫХ ЭЛЕМЕНТА ВЕРНЕТ ОДИН ПЕРВЫЙ)

    }
}
