package net.study.other.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionEx1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class classEmployee1 = Class.forName("net.study.other.reflection.Employee"); // полный путь к классу
//        Class classEmployee2 = Employee.class; // 2 пособ
//        Employee employee = new Employee();
//        Class classEmployee3 = employee.getClass(); // 3 способ

        Field someField = classEmployee1.getDeclaredField("id"); // getDeclaredField для приватных полей
        // Field someField = classEmployee1.getField("id"); для public полей протектед и дефолт
        // System.out.println("Type of id field is " + someField.getType());

        Field[] fields = classEmployee1.getDeclaredFields(); // ПОЛУЧЕНИЕ ВСЕХ ПОЛЕЙ
        Arrays.stream(fields).forEach(p -> {
            System.out.println(p.getModifiers() + " " + p.getType() + " " + p.getName());});

        System.out.println("_________________________________________________________________");

        Method someMethod = classEmployee1.getMethod("increaseSalary");
        System.out.println("Return type of the method is = " + someMethod.getReturnType() +
                " The parameters method are = " + Arrays.toString(someMethod.getParameterTypes()));

        System.out.println("__________________________________________________________________");

             // указывать параметры нужно так как если будет перегружен метод ,то java не будет знать что вызвать
        Method someMethod2 = classEmployee1.getMethod("setSalary", double.class);
        System.out.println("Return type of the method is = " + someMethod2.getReturnType() +
                " The parameters method are = " + Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("__________________________________________________________________");

        Method[] allMethod = classEmployee1.getMethods();
        // если getDeclaredMethods() то работать буду только с методоми которые определены у класса ,а не у супер класса
        Arrays.stream(allMethod).forEach(p -> {System.out.println("Name of method = " + p.getName() +
                "Return type of the method is = " + p.getReturnType() +
                " The parameters method are = " + Arrays.toString(p.getParameterTypes()));});

        System.out.println("__________________________________________________________________");

        Method[] allMethod2 = classEmployee1.getDeclaredMethods();
        Arrays.stream(allMethod2).filter(p -> {if(Modifier.isPublic(p.getModifiers())){
                              return true;
        }else return false;}).forEach(p -> {System.out.println("Name of method = " + p.getName() +
                "Return type of the method is = " + p.getReturnType() +
                " The parameters method are = " + Arrays.toString(p.getParameterTypes()));});

        System.out.println("__________________________________________________________________");

        Constructor constructor = classEmployee1.getConstructor(); // если без параметров тогда по умолчанию конструктор

        System.out.println("The constructor has " + constructor.getParameterCount() + " their, types are " +
                 Arrays.toString(constructor.getParameterTypes()));

        System.out.println("__________________________________________________________________");

        Constructor constructor2 = classEmployee1.getConstructor(int.class, String.class, String.class); // если без параметров тогда по умолчанию конструктор

        System.out.println("The constructor has " + constructor2.getParameterCount() + " parameters, their types are " +
                Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("__________________________________________________________________");

        Constructor[] constructor3 = classEmployee1.getConstructors();
        for(Constructor i : constructor3){
            System.out.println("Name of constructor is " + i.getName() + " it has " + i.getParameterCount() +
                     " parameters ,and its types = " + Arrays.toString(i.getParameterTypes()));
        }

    }
}
