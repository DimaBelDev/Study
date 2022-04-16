package net.study.stream.lesson17_parallel_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestParallelStream {

    // использовать  для min, max и.т.д, ам где важна очередность нельзя
    // Должно быть очень много элементов
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int a = 0; a < 100;a++){
            list.add(random.nextInt(1000));
        }

        int sum = list.parallelStream().reduce((acc, elm) -> acc + elm).get();
        System.out.println(sum);
    }
}
