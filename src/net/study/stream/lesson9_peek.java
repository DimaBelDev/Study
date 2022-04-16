package net.study.stream;

import java.util.stream.Stream;

public class lesson9_peek {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,1,2,3);

        System.out.println(stream1.distinct().peek(System.out::println).count());
        // peek не терминальный, используется для просмотра что происходит со стримом
    }
}
