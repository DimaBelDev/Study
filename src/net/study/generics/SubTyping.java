package net.study.generics;

public class SubTyping {
    // Info<Person> info1 = new Info<>(new Person()); // ошибка должен импл. интерфейс, если он импл. интерфейс,
    Info<Student> info2 = new Info<>(new Student()); // то подклассы могут не импл. интерфейс

}

class Info<T extends Person&A>{ // если мы пишем &A(какой-то интерфейс, то клас либо наследники должны импл.
                                // этот интерфейс)

    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}

class Person // implements A
{


 //   @Override
    public void sing() {

    }
}

class Student extends Person implements A
 {

    @Override
    public void sing() {
        System.out.println("Hello");
    }
}

interface A{
    void sing();
}
