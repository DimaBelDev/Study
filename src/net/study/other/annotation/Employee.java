package net.study.other.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotation
    public void increaseSalary(){
        this.salary*=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
// @Target({ElementType.FIELD, ElementType.TYPE})
@Target(ElementType.METHOD) // помечаем к чему она может быть применима
@Retention(RetentionPolicy.RUNTIME) // описывает жизненый цикл аннотации 1)SOURCE(видет только компилятор отбрасывается в байт коде)
@interface MyAnnotation{            //2) CLASS(видна в байт коде отбрасывается JVM) 3)RUNTIME(анотация видна при выполнении)

}
