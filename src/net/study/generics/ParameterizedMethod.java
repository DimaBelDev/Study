package net.study.generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Ivan");
        System.out.println(GenMethod.getElement(listString));
        //_________________________

        Employee<String> employee = new Employee();

        System.out.println(employee.getFirstElement("Sasha"));


    }
}

class GenMethod{
    public static <T> T getElement(List<T> list){ // первая <T> указывает что мы используем Genetics,
         return list.get(0);                      // вторая T тип возвращаемого значения
    }
}

class Employee<E>{

    public E getFirstElement(E value){ // здесь мы можем не указывать <E> так как мы уже в классе указали параметризацию
        return value;
    }

    public <T> T getSecondElement(T value){
        return value;
    }

}


