package net.study.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(21,"Roma", "Smirnov"));
        list.add(new Employee(12,"Dima","Petrov"));
        list.add(new Employee(54,"Roma", "Ivanov"));

        System.out.println("Before sort \n" + list);
        Collections.sort(list);
        System.out.println("After sort \n" + list);



    }
}

class Employee implements Comparable<Employee>{ // Comparable - позволяет сравнивать
    private Integer id;
    private String name;
    private String surname;

    public Employee(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        if(this.id == o.id){
//            return 0;
//        } else if(this.id < o.id){
//            return -1;
//        } else {
//            return 1;
//        }

//        return this.id-o.id;
//        return this.id.compareTo(o.id);  // только если в качестве переменной Integer

        int res = this.name.compareTo(o.name);
        if(res == 0){
            res = this.surname.compareTo(o.surname);
        }
        return res;
    }
}
