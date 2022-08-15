package folders.arrayUtil;

import java.util.Scanner;

public class ArrayUtil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("size of array: ");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("type a number for index " + i);
            array[i] = scanner.nextInt();
        }

        //display all elements of array;
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        //display array's biggest num;
        int biggestNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggestNum) biggestNum = array[i];
        }
        System.out.println("biggest number in array is " + biggestNum);

        //display array's smallest number;
        int smallestNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNum) smallestNum = array[i];
        }
        System.out.println("smallest number in array is " + smallestNum);

        //display array's even & odd numbers;
        int evenNumCount = 0;
        int oddNumCount = 0;
        for (int k : array) {
            if (k % 2 == 0) {
                System.out.print(k + " is an even number\n");
                evenNumCount++;
            } else {
                System.out.print(k + " is an odd number\n");
                oddNumCount++;
            }
        }
        System.out.println("even num count:" + evenNumCount + "  " + "odd num count:" + oddNumCount);

        //print midValue of array;
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int midValue = sum / array.length;
        System.out.println("midvalue of array is " + midValue);

        //summary of array;
        int summary = 0;
        for (int i : array) {
            summary += i;
        }
        System.out.println("summary of array is " + summary);
    }
}
