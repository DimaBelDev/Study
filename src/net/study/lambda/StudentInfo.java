package net.study.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentInfo {

    public void sortStudent(List<Student> list, StudentChecks sort){
        for(Student s : list){
            if(sort.check(s)){
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

     StudentInfo lambdaClass = new StudentInfo();

     List<Student> list = new ArrayList<>(List.of(student1, student2, student3, student4, student5));

     Collections.sort(list,(st1, st2) -> st1.getAge() - st2.getAge()); // использование Comparator
     System.out.println(list);

//     lambdaClass.sortStudent(List.of(student1, student2, student3, student4, student5), new StudentChecks() {
//         @Override
//         public boolean check(Student s) {
//             return s.getAge() > 23;
//         }
//     });
//        System.out.println("____________________________");
//        lambdaClass.sortStudent(List.of(student1, student2, student3, student4, student5), s-> s.getAge() > 23);


    }
}

interface StudentChecks{
    boolean check(Student s);
}
