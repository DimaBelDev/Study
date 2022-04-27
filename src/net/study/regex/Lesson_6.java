package net.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_6 {
    public static void main(String[] args) {
        String cards = "12334567432569352354309;78435690109834215698135;";
                       // группы в скобках  №1       №2      №3      №4      №5      №6        №7
        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(cards);

//        String newCards = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)"); // с помощью знака $ можно указать группу
//        System.out.println(newCards);

        while (matcher.find()){
            System.out.println(matcher.group(2)); // здесь можно указать конкретную группу которую хочу видеть
        }


    }
}
