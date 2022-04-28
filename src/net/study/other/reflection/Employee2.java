package net.study.other.reflection;

public class Employee2 {
    private int id;
    private String name;
    private String department;
    private double salary = 1000;

    public Employee2() {
    }

    public Employee2(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
