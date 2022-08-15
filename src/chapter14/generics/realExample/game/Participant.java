package chapter14.generics.realExample.game;

public abstract class Participant {

    private final String name;
    private final int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
