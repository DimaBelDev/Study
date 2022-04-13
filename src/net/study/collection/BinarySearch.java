package net.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        Employee emp1 = new Employee(23, "Dima", "Ivanov");
        Employee emp2 = new Employee(11, "Sveta", "Podolak");
        Employee emp3 = new Employee(78, "Igor", "Vasalit");
        Employee emp4 = new Employee(32, "Roma", "Butko");

        List<Employee> listEmp = new ArrayList<>(List.of(emp1, emp2, emp3, emp4));
        Collections.sort(listEmp);
        System.out.println("List Employee" + listEmp);
        int index = Collections.binarySearch(listEmp, new Employee(32, "Roma", "Butko"));
        System.out.println(index);
    }
}

class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String surname;


    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Employee emp) {
        return this.id - emp.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
