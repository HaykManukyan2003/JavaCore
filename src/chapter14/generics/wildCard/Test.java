package chapter14.generics.wildCard;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //List<? extends Number> list = new ArrayList<Integer>();
        //List<? super  Number> list2 = new ArrayList<Object>();

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.4);
        doubleList.add(3.16);
        showListInfo(doubleList);

        List<String> stringList = new ArrayList<>();
        stringList.add("gg");
        stringList.add("yo");
        showListInfo(stringList);

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(34.0);
        doubleArrayList.add(34.7);
        doubleArrayList.add(34.36);

        double sum = sum(doubleArrayList);
        System.out.println(sum);
    }

    static void showListInfo(List<?> arrayList) {
        System.out.println(arrayList);
    }

    public static double sum(ArrayList<? extends Number> arrayList) {
        double summary = 0.0;
        for (Number number : arrayList) {
            summary += number.doubleValue();
        }
        return summary;
    }

}


