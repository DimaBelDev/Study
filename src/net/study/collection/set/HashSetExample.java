package net.study.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    // хранит только уникальные значение
    // не сохраняет порядок
    // под капотом использует HashMap(в качестве значение в HashMap использует константу, это не важно)
    // нет метода get так как нет от него смысла
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(9);
        set1.add(4);
        set1.add(2);
        set1.add(7);

        Set<Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(5);
        set2.add(3);
        set2.add(1);
        set2.add(9);

//        Set<Integer> union = new HashSet<>(set1);
//        union.addAll(set2);

//        Set<Integer> intersect = new HashSet<>(set1);
//        intersect.retainAll(set2);

          Set<Integer> subtract = new HashSet<>(set1);
          subtract.removeAll(set2);
    }
}
