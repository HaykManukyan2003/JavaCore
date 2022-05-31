package homework.arrayUtil;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();


        int[] reserveArray = arrayUtil.arrayNumbersFromLargestToSmallest(new int[] {4, 33, 245, 55, 1, 2, 87});
        for (int i : reserveArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] reserveArray2 = arrayUtil.arrayNumbersFromSmallestToLargest(new int[]{44, 24, 76, 11, 3, 98});
        for (int k : reserveArray2) {
            System.out.print(k + " ");
        }

        System.out.println();

        arrayUtil.printArraysEvenAndOddNumbers(new int[]{2, 3, 65, 44, 23, 44, 66});
        arrayUtil.printElementsOfArray(new int[] {4, 22, 43, 55, 134, 90});

        System.out.println(arrayUtil.sumOfArray(new int[] {4, 5, 23, 44, 11}));
        System.out.println(arrayUtil.smallestNumInArray(new int[]{2, 3, 77, 43, 29, 11, 66}));
        System.out.println(arrayUtil.biggestNumInArray(new int[]{4, 33, 245, 55, 29, 11, 66}));
        System.out.println(arrayUtil.midValueOfArray(new int[] {4, 22, 43, 55, 134, 90}));

    }
}
