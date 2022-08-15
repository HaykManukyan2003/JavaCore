package folders.arrayListExamples;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("red");
        System.out.println(arrayList.get(0));
        arrayList.add(0, "brown");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());

        arrayList.add(0, "white");

        arrayList.remove(2);

        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i + ": " + arrayList.get(i));
        }

        System.out.println(arrayList.contains("ggYo"));
    }
}
