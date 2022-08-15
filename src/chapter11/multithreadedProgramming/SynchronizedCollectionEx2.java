package chapter11.multithreadedProgramming;

import java.util.ArrayList;

public class SynchronizedCollectionEx2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
    }
}
