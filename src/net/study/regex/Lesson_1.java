package net.study.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson_1 {
    public static void main(String[] args) {

        // String text = "ABCD ABC ABabc ABCPaEbScG";
        // Pattern pattern1 = Pattern.compile("[abc]"); // или a или b или c , но только один отдельно

        // String text = "ABCD ABC ABabc ABCPaEbScG";
        // Pattern pattern2 = Pattern.compile("AB[C-F]P"); // c C по F любая буква

        // String text = "ABCD ABC ABabc AB7CPaEbScG";
        // Pattern pattern2 = Pattern.compile("AB[a-b1-8C-D]"); // c a по b или с 1 по 8 и.т.д
        // Pattern pattern2 = Pattern.compile("AB[^a-b1-8C-D]"); // ^ означает любой элемент кроме этого, то есть отрицание, обязательно в квадратных

//        String text = "ABCD ABD ABabc AB7CPaEbScG";
//        Pattern pattern2 = Pattern.compile("AB(C|D)"); // С ИЛИ D

//        String text = "ABCD ABD ABabc AB7CPaEbScG";
//        Pattern pattern2 = Pattern.compile("AB."); // . любой символ, кроме новой строки

          String text = "ABCD ABD ABabc AB7CPaEbSAB";
        // Pattern pattern2 = Pattern.compile("^AB"); // ^ означает начало нашей строки такое(на все остальные совпадения без разницы)
        // Pattern pattern2 = Pattern.compile("AB$"); // $ конец строки такой
        // Pattern pattern2 = Pattern.compile("\\AAB"); // ТОЖЕ САМОЕ ЧТО И ^
           Pattern pattern2 = Pattern.compile("AB\\Z"); // ТОЖЕ САМОЕ ЧТО И $

        // String text = "ABCD ABD ABabc AB7CPaEbSAB";
        // Pattern pattern2 = Pattern.compile("^AB");

        // String text = "ABCD ABD ABabc AB7CPaEbSAB_";
        // Pattern pattern2 = Pattern.compile("\\d"); // соответствует любой цифре
        // Pattern pattern2 = Pattern.compile("\\D"); // соответствует любой НЕ цифре(ДАЖЕ ПРОБЕЛУ соответствует)
        // Pattern pattern2 = Pattern.compile("\\w"); // соответствует любой цифре, букве или _
        // Pattern pattern2 = Pattern.compile("\\W"); // НЕ соответствует любой цифре, букве или _ соответствует (&,!, пробел и.т.д.)
        // Pattern pattern2 = Pattern.compile("\\s"); // соответствует пробельному символу
        // Pattern pattern2 = Pattern.compile("\\S"); // НЕ соответствует пробельному символу, а всему остальному соответствует
        // Pattern pattern2 = Pattern.compile("\\w+"); // +(его можно ставить везде) означает не один элемент а кол-во совпадений подряд
                                                    // если есть asd aмd то вернет не (a s d a m d), а (asd amd)
       // String text = "DABABCD DACD ABabs AB7CPaEbSAB_";
       // Pattern pattern2 = Pattern.compile("\\w{4}"); // выводит то кол-во совпадений подрят что указано в {n}
       // Pattern pattern2 = Pattern.compile("\\D{2,6}"); // выводит то кол-во совпадений подрят что указано в {n,n} от и до
       // Pattern pattern2 = Pattern.compile("\\D{2,}"); // выводит от двух до бесконечности совпадений
        // Pattern pattern2 = Pattern.compile("(AB){2,3}"); // ЕСЛИ НУЖЕН НЕ ОДИН ЭЛЕМЕНТ СОВПАДЕНИЯ А ГРУППА ТО НУЖНО ВЗЯТЬ В ()
        // Pattern pattern2 = Pattern.compile("D(AB)?"); // ? означает 0 или 1 повторение
        //  Pattern pattern2 = Pattern.compile("D(AB)*"); // * означает 0 или бесконечно кол-во повторений

        // String text = "ABCD ABD 23! ABabs 29, AB7CPaEbSAB_";
        // Pattern pattern2 = Pattern.compile("\\b\\d{2}\\b"); // \\b граница слова или числа, то есть до и после не может число или слово
        // Pattern pattern2 = Pattern.compile("\\B\\d{2}\\B"); // \\B граница НЕ слова или НЕ числа МОЖЕТ (! & ? и т. д.)

//        String text = "ABCD ABD 23! ABabs 29, AB7CPaEbSAB_";
//        Pattern pattern2 = Pattern.compile("."); // . любой один какой-то символ
        Matcher matcher = pattern2.matcher(text);

        while (matcher.find()){
            System.out.println("Position " + matcher.start() + " value " + matcher.group());
        } // узнать позицию начала паттерна можно при помощи matcher.start()
    }
}
