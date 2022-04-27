package net.study.other.enums;

public class EnumEx2 {
    public static void main(String[] args) {
        Today today = new Today(Day.FRIDAY);
        today.canDo();
    }
}
class Today{
    private Day day;

    Today(Day day){
        this.day = day;
    }

    public void canDo(){
        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("You need to go to work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("You can relax");
                break;
        }
    }
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
