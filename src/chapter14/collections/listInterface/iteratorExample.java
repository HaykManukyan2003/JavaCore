package chapter14.collections.listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorExample {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("gg");
        stringList.add("yo");
        stringList.add("2003");

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
