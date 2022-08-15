package folders.arrayUtil2;

import folders.stack.Stack;

public class ArrayUtil {

    public static void commonElements(int[] firstArray, int[] secondArray) {
        Stack <Integer> array = new Stack<Integer>();

        for (int j : firstArray) {
            for (int i : secondArray) {
                if (j == i) array.push(j);
            }
        }
        for (int k = 0; k < firstArray.length; k++) {
            System.out.println(array.pop());
        }
    }

    public static void removeDuplicates(int[] array) {
        for (int k = 0; k < array.length; k++) {
            if (array[k] == array[k + 1]) {
                array[k] = array[k + 1];
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        int[] array1 = {2, 3, 55, 11, 32, 45, 55};
        int[] array2 = {4, 3, 32, 5, 55};

        commonElements(array1, array2);

        removeDuplicates(array1);
    }
}
