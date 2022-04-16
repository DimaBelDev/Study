package net.study.stream.lesson11_collect;

import net.study.lambda.lesson1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class TestCollect {
    public static void main(String[] args) {
        Student student1 = new Student("Dima", 21, 'm', 5, 7.1);
        Student student2 = new Student("Roma", 23, 'm', 5, 6.4);
        Student student3 = new Student("Toma", 24, 'g', 4, 4.9);
        Student student4 = new Student("Andrey", 25, 'm', 7, 7.8);
        Student student5 = new Student("Sveta", 28, 'g', 3, 7.9);
        List<Student> list = new ArrayList<>(List.of(student1, student2, student3, student4, student5));

        Map<Integer, List<Student>> mapListStudent =  list.stream().map(p -> {p.setName(p.getName().toUpperCase());
                                 return p;}
                                ).collect(Collectors.groupingBy(p -> p.getCourse()));
        //Collectors.groupingBy разделяет объекты по листам(у кого равные тот в один лист)

//        for(Map.Entry<Integer, List<Student>> x : mapListStudent.entrySet()){
//            System.out.println(x.getKey() + " : " + x.getValue().toString());
//        }
        AtomicInteger a = new AtomicInteger(1);
        mapListStudent.values().stream().forEach(p -> System.out.println(a.getAndIncrement() + " : " + p.toString()));


    }
}
