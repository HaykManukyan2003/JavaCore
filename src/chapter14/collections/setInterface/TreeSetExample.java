package chapter14.collections.setInterface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(4));
        System.out.println(treeSet.tailSet(2));
        System.out.println(treeSet.subSet(3, 6));
    }
}
