package net.study.collection.comparator;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(21,"Roma", "Smirnov"));
        list.add(new Employee(54,"Roma", "Ivanov"));
        list.add(new Employee(12,"Dima","Petrov"));

        System.out.println("Before sort \n" + list);
        Collections.sort(list, new NameComparator()); // используется  в качестве второго параметра(можно через аноним)
        System.out.println("After sort \n" + list);   // можно использовать вместе с Comparable привилегия Comparator



    }
}

class Employee implements Comparable<Employee>{
    private Integer id;
    private String name;
    private String surname;

    public Employee(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
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
      return this.id-o.id;
    }
}

class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}
