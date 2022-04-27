package net.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// проверка ip
public class Lesson_4 {
    static void checkIP(String test){
        String regex = "((25[0-5]|2[0-9]?|2[0-4]\\d|[0-1]?\\d?\\d)\\.){3}(25[0-5]|2[0-9]?|2[0-4]\\d|[0-1]?\\d?\\d)";
        System.out.println(Pattern.matches(regex, test));
    }
    public static void main(String[] args) {
        String ip1 = "122.255.01.123";
        String ip2 = "123.356.123.09";
        String ip3 = "0.0.0.0";
        String ip4 = "256.0.0.0";
        checkIP(ip4);
    }
}
