package net.study.other.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class Reflection3 {

    // Можно нарушить инкапсуляцию
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class classEmployee2 = Employee2.class;

        Constructor constructor = classEmployee2.getConstructor(int.class, String.class, String.class);

        Object o1 = constructor.newInstance(1, "Sasha", "Petrov");

        Field field = classEmployee2.getDeclaredField("salary");
        field.setAccessible(true);
        // double newSalary =  (Double) field.get(o1); // получение этого поля
        field.setAccessible(true); // этим методом нарушаем инкапсуляцию позволяе работать с private полями
        field.setDouble(o1, 1500); // задать новое значение

        System.out.println(o1);


    }
}
