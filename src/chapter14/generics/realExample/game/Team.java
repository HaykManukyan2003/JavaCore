package chapter14.generics.realExample.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {

    private final String name;
    private final List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println(name + " has a new participant: " + participant.getName());
    }

    public void playWith(Team<T> team) {
        String winner;
        Random random = new Random();
        int n = random.nextInt(2);

        if (n == 0) {
            winner = this.name;
        } else winner = team.name;

        System.out.println("winner name: " + winner);
    }

}