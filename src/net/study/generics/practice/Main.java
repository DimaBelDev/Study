package net.study.generics.practice;

public class Main {
    public static void main(String[] args) {

        Team<Schooler> schoolTeam1 = new Team<>("Dragon");
        schoolTeam1.addParticipant(new Schooler("Ivan", 14), new Schooler("Vita",15));
        Team<Schooler> schoolTeam2 = new Team<>("Sweat");
        schoolTeam2.addParticipant(new Schooler("Nikita", 15),new Schooler("Artem",15));
        Team<Student> studentTeam1 = new Team<>("Monster");
        studentTeam1.addParticipant(new Student("Lexa", 18), new Student("Igor",21));
        Team<Student> studentTeam2 = new Team<>("Lion");
        studentTeam2.addParticipant(new Student("Dima", 21), new Student("Sasha",19));

        schoolTeam1.playWith(schoolTeam2);
        studentTeam1.playWith(studentTeam2);
    }
}
