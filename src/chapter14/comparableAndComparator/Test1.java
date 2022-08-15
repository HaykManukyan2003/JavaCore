package chapter14.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("gg");
        list.add("yo");
        list.add("man");
        System.out.println("before sorting" + list);
        Collections.sort(list);
        System.out.println("after sorting" + list);
    }
}
