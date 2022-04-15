package net.study.lambda.lesson5_function;

import net.study.lambda.lesson1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test {

    public static int avg(List<Student> students, Function<Student, Integer> fun){
        int result = 0;
        for(Student st : students){
            result+=fun.apply(st);
        }
        return result / students.size();
    }
    public static void main(String[] args) {
        Student student1 = new Student("Dima", 21, 'm', 5, 7.1);
        Student student2 = new Student("Roma", 23, 'm', 5, 6.4);
        Student student3 = new Student("Toma", 24, 'g', 4, 4.9);
        Student student4 = new Student("Andrey", 25, 'm', 7, 7.8);
        Student student5 = new Student("Sveta", 28, 'g', 3, 7.9);

        List<Student> listStudent = new ArrayList<>(List.of(student1, student2, student3, student4, student5));
        System.out.println(avg(listStudent, (studen) -> studen.getAge()));
    }
}


