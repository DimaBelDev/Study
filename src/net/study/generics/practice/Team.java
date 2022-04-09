package net.study.generics.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T ...participant){
        Arrays.stream(participant).map(p -> participantList.add(p));
        System.out.println("The team "+ this.name +" completed");
    }

    public void playWith(Team<T> team){
        int randomNumberForWin = new Random().nextInt(2);
        String result = randomNumberForWin == 1 ? this.name : team.name;
        System.out.println("Winner is " + result);
    }

}
