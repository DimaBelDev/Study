package net.study.multithreading.lesson17_exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

// ОБМЕН МЕЖДУ ПОТОКАМИ
public class TestExchanger {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> list1 = new ArrayList<>(List.of(Action.Bumaga, Action.Howneci, Action.Bumaga));
        List<Action> list2 = new ArrayList<>(List.of(Action.Kamen, Action.Bumaga, Action.Howneci));

        new BestFriend("Dima", list1, exchanger);
        new BestFriend("Poma", list2, exchanger);


    }
}

enum Action{
    Kamen, Howneci, Bumaga
}

class BestFriend extends Thread{
    private String name;
    private List<Action> listAction;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> listAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.listAction = listAction;
        this.exchanger = exchanger;
        this.start();
    }


    public void whoWin(Action myAction, Action friendAction){
        if(myAction == Action.Kamen && friendAction == Action.Howneci ||
           myAction == Action.Howneci && friendAction == Action.Bumaga ||
           myAction == Action.Bumaga && friendAction == Action.Kamen){
            System.out.println(name + " win");
        }
    }

    @Override
    public void run() {
         Action reply;
        try {
            for(Action x : listAction) {
              reply =  exchanger.exchange(x);// блокирует и ждет ответ с другого потока // отдаем свое значение и получаем значение с другого потока
              whoWin(x, reply);
              sleep(2000);}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}