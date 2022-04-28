package net.study.other.reflection;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.department = surname;
    }

    public Employee(int id, String name, String surname, double salary) {
        this.id = id;
        this.name = name;
        this.department = surname;
        this.salary = salary;
    }

    private void changeDepartment(String newDepartment){
        this.department = newDepartment;
        System.out.println("New department is " + department);
    }

    public void increaseSalary(){
        this.salary*=2;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
