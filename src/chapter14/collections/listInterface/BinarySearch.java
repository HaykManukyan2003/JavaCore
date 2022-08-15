package chapter14.collections.listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(43);
        arrayList.add(-47);
        arrayList.add(21);
        arrayList.add(76);
        arrayList.add(11);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(-65);
        arrayList.add(32);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        int index = Collections.binarySearch(arrayList, 32);
        System.out.println(index);
    }
}
