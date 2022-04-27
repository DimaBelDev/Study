package net.study.regex;

import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
//        String test = "vita11@gmail.com";
//        boolean result = test.matches("\\w+@\\w+\\.(com|ru)");
//        // если нужно подтвердить или опровергнуть одно соответствие
//        System.out.println(result);

        String text = "Dima Ivanov, Russia, Moscow, Lenina street, 51, flat 25,"
                +" email : dima12@mail.ru, postcode : AA97, phone number : +723123112;" +
                "      Vita Korleon, Italia, Rome, Pobeda street, 12, flat 1, " +
                "      email : vita11@gmail.com, postcode : RR12, phone number : +121231313" ;

        String[] newStringWithSplit = text.split(" "); // что выполняет роль разделителя
        System.out.println(Arrays.toString(newStringWithSplit));
    }
}
