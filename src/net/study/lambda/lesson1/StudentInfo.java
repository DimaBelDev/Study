package net.study.lambda.lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class StudentInfo {
    // Predicate возвращает true либо false
    public static void sortStudent(List<Student> list, Predicate<Student> pr){
        for(Student s : list){
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }


    public static void main(String[] args) {
     Student student1 = new Student("Dima", 21, 'm', 5, 7.1);
     Student student2 = new Student("Roma", 23, 'm', 5, 6.4);
     Student student3 = new Student("Toma", 24, 'g', 4, 4.9);
     Student student4 = new Student("Andrey", 25, 'm', 7, 7.8);
     Student student5 = new Student("Sveta", 28, 'g', 3, 7.9);

     List<Student> list = new ArrayList<>(List.of(student1, student2, student3, student4, student5));

     Predicate<Student> predicate1 = student -> student.getName().length()>=5;
     Predicate<Student> predicate2 = student -> student.getSex()=='m';


     // list.removeIf(student -> student.getName().length() >= 5); // принимает в параметрах Predicate
     // list.removeIf(predicate1);
     // sortStudent(list, (stud) -> stud.getAge() > 22);

     // Можем проверять сразу на несколько условий

     // sortStudent(list, predicate1.and(predicate2)); // проверка двух условий
     // sortStudent(list, predicate1.or(predicate2));  // или то или другое
        sortStudent(list, predicate1.negate()); // условие было student.getName().length()>=5 тепере все наоборот


     // System.out.println(list);

    }
}


