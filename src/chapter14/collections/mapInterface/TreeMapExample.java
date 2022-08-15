package chapter14.collections.mapInterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Student, Double> treeMap = new TreeMap<>();
//        TreeMap<Student, Double> treeMap = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        })
        Student s1 = new Student("a", "aa", 1);
        Student s2 = new Student("b", "bb", 2);
        Student s3 = new Student("c", "cc", 3);
        Student s4 = new Student("d", "dd", 4);
        Student s5 = new Student("e", "ee", 5);
        Student s6 = new Student("f", "ff", 6);
        Student s7 = new Student("g", "gg", 7);

        treeMap.put(s6, 3.6);
        treeMap.put(s4, 9.1);
        treeMap.put(s2, 7.8);
        treeMap.put(s1, 5.6);
        treeMap.put(s3, 8.2);
        treeMap.put(s7, 1.7);
        treeMap.put(s5, 2.5);

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        //System.out.println(treeMap.tailMap());
        //System.out.println(treeMap.headMap());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());

    }
}
