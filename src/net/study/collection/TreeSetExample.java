package net.study.collection;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    // реализует под капотом TreeMap(использует только ключ в качестве значения использует заглушку-константу)
    // хранит элементы по возрастанию
    // //ЕСЛИ ПЕРЕДАЕТСЯ ОБЪЕКТ, ТО ОБЯЗАТЕЛЬНО ПЕРЕОПРЕДЕЛИТЬ COMPARABLE ИЛИ COMPARATOR(В ПАРАМЕТРЫ TreeSet)
    // нельзя задавать null
    // ТОТ ЭЛЕМЕНТ БЛАГОДАРЯ КОТОРОМУ МЫ ПРОВОДИМ СРАВНЕНИЕ В COMPARABLE ИЛИ COMPARATOR, ТОЛЬКО И ДОЛЖЕН БЫТЬ В hashcode and equals(Если их переопределяем)
    // так как объекты могут быть равны в COMPARABLE ИЛИ COMPARATOR а в hashcode and equals нет
    public static void main(String[] args) {
        TreeSet<Baby> treeSet = new TreeSet<>();
        treeSet.add(new Baby("Slava", 5));
        treeSet.add(new Baby("Nikita", 3));
        treeSet.add(new Baby("Vika", 2));
        treeSet.add(new Baby("Vlad", 4));

        Baby baby1 = new Baby("Vika", 2);
        Baby baby2 = new Baby("Slava", 5);
        System.out.println(treeSet.contains(baby1));
        System.out.println(treeSet.last()); // последний элемент
        System.out.println(treeSet.first()); // первый элемент

        System.out.println(treeSet.subSet(baby1, baby2)); // до последнего не включая



    }
}
class Baby implements Comparable<Baby>{
    private String name;
    private int age;

    public Baby(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Baby other) {
        return this.age - other.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baby baby = (Baby) o;
        return age == baby.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Baby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}