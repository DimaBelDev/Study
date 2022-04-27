package net.study.other.enums;

public class EnumEx1 {
    static void daysOfWeeks(String day){
        System.out.println("Today is " + day);
    }
    public static void main(String[] args) {

        daysOfWeeks(Week.FRIDAY.name());

    }
}
// внутри класса создать можем (внутри метода нет)
enum Week{ // enum это способ ограничения
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}