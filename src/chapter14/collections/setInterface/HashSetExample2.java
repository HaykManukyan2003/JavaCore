package chapter14.collections.setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample2 {

    public static void main(String[] args) {

        HashSet<Integer> integerHashSet1 = new HashSet<>();
        integerHashSet1.add(5);
        integerHashSet1.add(7);
        integerHashSet1.add(3);
        integerHashSet1.add(10);
        integerHashSet1.add(2);
        integerHashSet1.add(87);
        System.out.println(integerHashSet1);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(43);
        linkedHashSet.add(5);
        linkedHashSet.add(7);
        linkedHashSet.add(98);
        System.out.println(linkedHashSet);




        HashSet<Integer> integerHashSet2 = new HashSet<>();
        integerHashSet2.add(10);
        integerHashSet2.add(54);
        integerHashSet2.add(3);
        integerHashSet2.add(5);
        integerHashSet2.add(77);

//        HashSet<Integer> union = new HashSet<>(integerHashSet1);
//        union.addAll(integerHashSet2);
//        System.out.println(union);

//        HashSet<Integer> retain = new HashSet<>(integerHashSet1);
//        retain.retainAll(integerHashSet2);
//        System.out.println(retain);

        HashSet<Integer> subtract = new HashSet<>(integerHashSet1);
        subtract.removeAll(integerHashSet2);
        System.out.println(subtract);
    }
}
