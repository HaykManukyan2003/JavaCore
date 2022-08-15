package folders.examples;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {21, 3, 14, 43, 97, 11, 1, 32, 76, 4};

        int variable;

        for (int j = 0; j < array.length - 1; j++) {
            for (int k = 0; k < array.length - j - 1; k++) {
                if (array[k] > array[k + 1]) {
                    variable = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = variable;
                }
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
