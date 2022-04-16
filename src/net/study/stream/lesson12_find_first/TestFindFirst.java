package net.study.stream.lesson12_find_first;

import net.study.lambda.lesson1.Student;

import java.util.ArrayList;
import java.util.List;

public class TestFindFirst {
    public static void main(String[] args) {
        Student student1 = new Student("Dima", 21, 'm', 5, 7.1);
        Student student2 = new Student("Roma", 23, 'm', 5, 6.4);
        Student student3 = new Student("Toma", 24, 'g', 4, 4.9);
        Student student4 = new Student("Andrey", 25, 'm', 7, 7.8);
        Student student5 = new Student("Sveta", 28, 'g', 3, 7.9);

        List<Student> list = new ArrayList<>(List.of(student1, student2, student3, student4, student5));
        Student studentFirst = list.stream().map(s -> {s.setName(s.getName().toUpperCase());
                                return s;}).sorted((s1, s2) -> s1.getAge()-s2.getAge()).
                filter(p -> p.getAge() > 24).findFirst().get();

        System.out.println(studentFirst);
    }
}
