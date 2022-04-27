package net.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_2 {
    public static void main(String[] args) {

        String text = "Dima Ivanov, Russia, Moscow, Lenina street, 51, flat 25,"
                       +" email : dima12@mail.ru, postcode : AA97, phone number : +723123112;" +
                "      Vita Korleon, Italia, Rome, Pobeda street, 12, flat 1, " +
                "      email : vita11@gmail.com, postcode : RR12, phone number : +121231313" ;

        // Pattern pattern = Pattern.compile("\\b\\d{2}\\b"); // поиск номера дома и квартиры
        // Pattern pattern = Pattern.compile("\\+\\d+"); // поиск номера телефона
         Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com|ru)");


        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
