package chapter14.generics.parameterizedMethods;

import java.util.ArrayList;

public class ParameterizedMethod {

    public static void main(String[] args) {

//        ArrayList<String> stringArrayList = new ArrayList<>();
//        stringArrayList.add("gg");
//        stringArrayList.add("yo");
//        String secondElement = GenMethod.getSecondElement(stringArrayList);
//        System.out.println(secondElement);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(3);
        integerArrayList.add(5);
        Integer integer = GenMethod.getSecondElement(integerArrayList);
        System.out.println(integer);

        GenMethod<Integer> genMethod = new GenMethod<>();
        Integer value = genMethod.getValue(4);
        System.out.println(value);
    }
}

class GenMethod <T> {

    public static <T extends Number> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }

    public T getValue(T value) {
        return value;
    }

}
