package net.study.stream.lesson16_map_to_int;

import net.study.lambda.lesson1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestMapToInt {
    public static void main(String[] args) {
        Student student1 = new Student("Dima", 21, 'm', 5, 7.1);
        Student student2 = new Student("Roma", 23, 'm', 5, 6.4);
        Student student3 = new Student("Toma", 24, 'g', 4, 4.9);
        Student student4 = new Student("Andrey", 25, 'm', 7, 7.8);
        Student student5 = new Student("Sveta", 28, 'g', 3, 7.9);

        List<Student> list = new ArrayList<>(List.of(student1, student2, student3, student4, student5));
        // maToInt преобразует с объекта(поле) в Integer(не int) и затем обязательно использовать boxed()
        // maToInt, mapToDouble, mapToLong
        // List<Integer> list2 = list.stream().mapToInt(e -> e.getAge()).boxed().collect(Collectors.toList());
        // System.out.println(list2);

        //  у него есть такие методы как sum, average, min, max

        int min = list.stream().mapToInt(p -> p.getAge()).min().getAsInt(); // уже getAsInt ,а в просто map использовал get
        int max = list.stream().mapToInt(p -> p.getAge()).max().getAsInt();
        double avg = list.stream().mapToDouble(p -> p.getAvgGrade()).average().getAsDouble();
        int sum = list.stream().mapToInt(p -> p.getAge()).sum();
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
        System.out.println(sum);
    }
}
