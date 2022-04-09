package net.study.generics.practice;

public abstract class Participant {
    private String name;
    private int age;

    Participant(String name, int age){
       this.name = name;
       this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
