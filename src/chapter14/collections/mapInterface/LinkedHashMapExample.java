package chapter14.collections.mapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(
                16, 0.75f, true);

        Student s1 = new Student("a", "aa", 1);
        Student s2 = new Student("b", "bb", 2);
        Student s3 = new Student("c", "cc", 3);
        Student s4 = new Student("d", "dd", 4);

        linkedHashMap.put(4.6, s1);
        linkedHashMap.put(5.1, s2);
        linkedHashMap.put(2.7, s3);
        linkedHashMap.put(3.4, s4);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(4.6));
        System.out.println(linkedHashMap.get(5.1));

        System.out.println(linkedHashMap);

    }
}
