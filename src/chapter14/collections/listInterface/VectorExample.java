package chapter14.collections.listInterface;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>(); // used in multithreading;
        vector.add("gg");
        vector.add("yo");
        vector.add("2003");
        System.out.println(vector);

        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);

        System.out.println(vector.get(1));
    }
}
