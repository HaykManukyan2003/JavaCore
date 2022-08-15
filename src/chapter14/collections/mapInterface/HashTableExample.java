package chapter14.collections.mapInterface;

import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {

        Hashtable<Double, Student> hashtable = new Hashtable<>();

        Student s1 = new Student("a", "aa", 1);
        Student s2 = new Student("b", "bb", 2);
        Student s3 = new Student("c", "cc", 3);
        Student s4 = new Student("d", "dd", 4);

        hashtable.put(4.6, s1);
        hashtable.put(5.1, s2);
        hashtable.put(2.7, s3);
        hashtable.put(3.4, s4);
        // key & value cannot be null;
    }
}
