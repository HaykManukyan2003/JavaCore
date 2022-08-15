package chapter11.multithreadedProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {

    public static void main(String[] args) {

        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> friendAction = new ArrayList<>();
        friendAction.add(Action.SCISSORS);
        friendAction.add(Action.PAPER);
        friendAction.add(Action.SCISSORS);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.PAPER);
        friend2Action.add(Action.ROCK);
        friend2Action.add(Action.ROCK);

        new BestFriend("gg", friendAction, exchanger);
        new BestFriend("gg2", friend2Action, exchanger);
    }
}

enum Action {
    ROCK, PAPER, SCISSORS;
}

class BestFriend extends Thread {
    private final String name;
    private final List<Action> myActions;
    private final Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.ROCK && friendsAction == Action.SCISSORS)
                || (myAction == Action.SCISSORS && friendsAction == Action.PAPER)
                || (myAction == Action.PAPER && friendsAction == Action.ROCK)) {
            System.out.println(name + " wins!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
