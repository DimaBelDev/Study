package net.study.work_with_file.io.serialization;

import java.io.*;

public class EmployeeSerialization {
    public static void main(String[] args) {
        Employee employee = new Employee("Dima", "IT", 21, 300);
        try(ObjectOutputStream serialization = new ObjectOutputStream(
                new FileOutputStream("employee.bin"))) {
            serialization.writeObject(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
class Employee implements Serializable { // просто как метка, примитивы(int double и.т.д) implements по умолчанию
    private static long serialVersionUID = 1; // помечаем версию класса
    private String name;
    private String department;
    transient private int age; // те поля что помечаны transient не будут сериализованы
    private double salary;

    public Employee(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
