package folders.examples;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotDog");

        food.remove(2);
        food.set(1, "bread");
        //food.clear();

        for (String s : food) {
            System.out.println(s);
        }

        //enhanced for
        //for (String i : food) System.out.println(i);
    }
}
