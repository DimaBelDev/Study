package net.study.other.enums;

import java.util.Arrays;

public class EnumEx3 {
    public static void main(String[] args) {
          MyDay myDay = new MyDay(WeekDay.MONDAY);
//        myDay.myMood();
          WeekDay w1 = WeekDay.MONDAY;
          WeekDay w2 = WeekDay.MONDAY;
          WeekDay w3 = WeekDay.FRIDAY;
        System.out.println(w1==w2); // true
        System.out.println(w1==w3); // false
        System.out.println(WeekDay.MONDAY.equals(WeekDay.MONDAY));
         WeekDay w4 = WeekDay.valueOf("MONDAY"); // получение enum с помощью valueOf("MONDAY");

        WeekDay[] array = WeekDay.values();
        System.out.println(array[6].getMood());
        System.out.println(Arrays.toString(array));
    }
}
enum WeekDay{
    MONDAY("bad"), TUESDAY("so-so"), WEDNESDAY("bad"),
    THURSDAY("so-so"), FRIDAY("good"), SATURDAY("good"), SUNDAY("so-so");

    private String mood;

    WeekDay(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class MyDay{
    WeekDay weekDay;

    public MyDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public void myMood(){
        System.out.println("My mood is " + weekDay.getMood());
    }
}
