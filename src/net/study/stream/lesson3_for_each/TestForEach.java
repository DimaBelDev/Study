package net.study.stream.lesson3_for_each;

import java.util.stream.Stream;

public class TestForEach {
    public static void main(String[] args) {
        Stream<String> myStream = Stream.of("Dima", "Sasha", "Vika", "Igor","Aleksey");
        // myStream.forEach(System.out::print); // используем ссылку
        // myStream.forEach(el -> System.out.print(el));// одно и тоже
         myStream.forEach(Utils::printer); // свой метод
    }
}
class Utils{
    public static void printer(String a){
        a+= " Hello";
        System.out.println(a);
    }
}