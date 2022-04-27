package net.study.regex;

public class Lesson_5 {
    public static void main(String[] args) {
        String text = "Privet       kak dela         izychaew Java?";
        // text = text.replace("Java", "SQL");
        // text = text.replaceAll("\\s{2,}", " "); // что-то меняем на что-то не обязательно с пробелами
           text = text.replaceFirst("\\bk\\w+\\s\\w+", "How are you");// меняет только первое
        System.out.println(text);
    }
}
