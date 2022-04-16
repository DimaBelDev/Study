package net.study.stream.lesson2_filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter {
    public static void main(String[] args) {
        List<Baby> baby = new ArrayList<>();
        baby.add(new Baby("Kira", 4, 'g'));
        baby.add(new Baby("Vika", 3,'g'));
        baby.add(new Baby("Denis", 5,'m'));
        baby.add(new Baby("Artur", 2,'m'));
        baby.add(new Baby("Misha", 4,'m'));

        List<Baby> babyList = baby.stream().filter(p -> p.getAge() > 3&&p.getSex()=='m').collect(Collectors.toList());
        System.out.println(babyList);

    }
}
class Baby{
    private String name;
    private int age;
    private char sex;

    public Baby(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}


