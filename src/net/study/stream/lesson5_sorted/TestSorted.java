package net.study.stream.lesson5_sorted;

import net.study.lambda.lesson1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted {
    public static void main(String[] args) {
        Student student1 = new Student("Dima", 21, 'm', 5, 7.1);
        Student student2 = new Student("Roma", 23, 'm', 5, 6.4);
        Student student3 = new Student("Toma", 24, 'g', 4, 4.9);
        Student student4 = new Student("Andrey", 25, 'm', 7, 7.8);
        Student student5 = new Student("Sveta", 28, 'g', 3, 7.9);

        List<Student> list = new ArrayList<>(List.of(student1, student2, student3, student4, student5));

        List<Student> list1 = list.stream().sorted((x1, x2) -> x1.getName().compareTo(x2.getName())).toList();
        System.out.println(list1);
    }
}
