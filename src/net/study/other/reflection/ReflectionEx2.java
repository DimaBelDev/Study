package net.study.other.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionEx2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
         // к 1 способу
         // Class classEmployee = Class.forName("net.study.other.reflection.Employee");
         // к 2 способу
          Class classEmployee = Class.forName("net.study.other.reflection.Employee");

//        Employee employee1 = (Employee)classEmployee.newInstance(); // устаревший способ создание объекта
//        employee1.setSalary(1222);

        // 1 способ
        // Constructor constructor = classEmployee.getConstructor();
        // Employee employee = (Employee)constructor.newInstance(); // нужно вызывать newInstance() на конструкторе

        // 2 способ
//        Constructor<Employee> constructor = classEmployee.getConstructor();
//         Employee employee = constructor.newInstance(); // без приведения

        Constructor constructor = classEmployee.getConstructor(int.class, String.class, String.class, double.class);

        Object o1 = constructor.newInstance(1,"Dima","Ivanov", 1001.23);
        System.out.println(o1);

        Method method = classEmployee.getMethod("setSalary", double.class);

        method.invoke(o1, 1502.67); // invoke принимает объект на котором вызываю метод и значение этого метода
        System.out.println(o1);

    }
}
