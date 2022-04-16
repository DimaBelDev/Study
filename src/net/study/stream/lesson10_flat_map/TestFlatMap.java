package net.study.stream.lesson10_flat_map;

import net.study.lambda.lesson1.Student;

import java.util.ArrayList;
import java.util.List;

public class TestFlatMap {
    public static void main(String[] args) {
        Student student1 = new Student("Dima", 21, 'm', 5, 7.1);
        Student student2 = new Student("Roma", 23, 'm', 5, 6.4);
        Student student3 = new Student("Toma", 24, 'g', 4, 4.9);
        Student student4 = new Student("Andrey", 25, 'm', 7, 7.8);
        Student student5 = new Student("Sveta", 28, 'g', 3, 7.9);

        Faculty faculty1 = new Faculty("Economist");
        Faculty faculty2 = new Faculty("IT");
        faculty1.addStudentToFaculty(student1);
        faculty1.addStudentToFaculty(student2);
        faculty1.addStudentToFaculty(student3);
        faculty2.addStudentToFaculty(student4);
        faculty2.addStudentToFaculty(student5);
        List<Faculty> facultyList = new ArrayList<>(List.of(faculty1, faculty2));

        facultyList.stream().flatMap(s -> s.getList().stream()).forEach(p -> System.out.println(p.getName()));
        // flatMap создает как бы несколько stream(для каждого объектп) если у нас есть лист или массив в входных объектах
        // map возвращает только один stream

    }
}
class Faculty{
    String name;
    List<Student> list;

    Faculty(String name){
        this.name = name;
        list = new ArrayList<>();
    }

    public List<Student> getList() {
        return list;
    }

    public void addStudentToFaculty(Student student){
        list.add(student);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                '}';
    }
}