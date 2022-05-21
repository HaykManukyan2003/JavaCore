package arrayUtil;

public class ArraySort {

    public static void main(String[] args) {

        //1.ArraySort;

        //from smallest to largest;
        int[] numArray = {43, 55, 5, -9, 0, 12, 5, 65, 1, 2, -44, 6, -3};
        int variable;

        for (int l = 0; l < numArray.length - 1; l++) {
            for (int k = 0; k < numArray.length - 1 - l; k++) {
                if (numArray[k] > numArray[k + 1]) {
                    variable = numArray[k + 1];
                    numArray[k + 1] = numArray[k];
                    numArray[k] = variable;
                }
            }
        }

        System.out.print("From Smallest To Largest: ");
        for (int k : numArray) {
            System.out.print(k + " ");
        }

        System.out.print("\n");

        //from largest to smallest;
        int[] numArray2 = {43, 55, 5, -9, 0, 12, 5, 65, 1, 2, -44, 6, -3};
        int variable2;

        for (int l = 0; l < numArray.length - 1; l++) {
            for (int k = 0; k < numArray.length - 1 - l; k++) {
                if (numArray[k] < numArray[k + 1]) {
                    variable2 = numArray[k];
                    numArray[k] = numArray[k + 1];
                    numArray[k + 1] = variable2;
                }
            }
        }

        System.out.print("From Largest To Smallest: ");
        for (int k : numArray) {
            System.out.print(k + " ");
        }

    }
}
