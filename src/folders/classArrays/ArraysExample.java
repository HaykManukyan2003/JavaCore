package folders.classArrays;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int[] array = {3, 44, 12, 43, 543, 21, 65};
        Arrays.sort(array);
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.print("\n");

        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 16);
        for (int k : filledIntArray) {
            System.out.print(k + " ");
        }
        System.out.print("\n");

        System.arraycopy(array, 0, filledIntArray, 0, 5);

    }
}
