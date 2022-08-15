package chapter14.collections.setInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("hayk");
        stringSet.add("vahagn");
        stringSet.add("rafulik");
        stringSet.add(null);
        System.out.println(stringSet);

        stringSet.remove("rafulik");
        System.out.println(stringSet);
    }
}
