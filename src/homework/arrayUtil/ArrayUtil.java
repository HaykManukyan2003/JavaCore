package homework.arrayUtil;

public class ArrayUtil {

    public void arrayNumbersFromSmallestToLargest(int[] array) {
        int variable;

        for (int l = 0; l < array.length; l++) {
            for (int k = 0; k < array.length - 1 - l; k++) {
                if (array[k] > array[k + 1]) {
                    variable = array[k + 1];
                    array[k + 1] = array[k];
                    array[k] = variable;
                }
            }
        }
        System.out.print("From Smallest To Largest: ");
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
    }

    public void arrayNumbersFromLargestToSmallest(int[] array) {
        int variable;

        for (int l = 0; l < array.length; l++) {
            for (int k = 0; k < array.length - 1 - l; k++) {
                if (array[k] < array[k + 1]) {
                    variable = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = variable;
                }
            }
        }
        System.out.print("From Largest To Smallest: ");
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
    }

    public int biggestNumInArray(int[] array) {
        System.out.print("biggest number in array: ");
        int biggestNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggestNum) biggestNum = array[i];
        }
        return biggestNum;
    }

    public int smallestNumInArray(int[] array) {
        System.out.print("smallest num in array: ");
        int smallestNum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallestNum) smallestNum = array[i];
        }
        return smallestNum;
    }

    public int sumOfArray(int[] array) {
        System.out.print("summary of array: ");
        int summary = 0;
        for (int i : array) {
            summary += i;
        }
        return summary;
    }

    public double midValueOfArray(int[] array) {
        System.out.print("midValue of array: ");
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public void printElementsOfArray(int[] array) {
        System.out.print("all elements of array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    public void printArraysEvenAndOddNumbers(int[] array) {
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
    }

}
