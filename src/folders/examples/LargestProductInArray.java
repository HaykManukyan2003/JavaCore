package folders.examples;

public class LargestProductInArray {

//    Given an array of integers,
//    find the pair of adjacent elements
//    that has the largest product and return that product.

    public static int largestProductPossibleInArray(int[] array) {
        int variable;

        for (int k = 0; k < 2; k++) {
            for (int l = array.length - 1; l > k; l--) {
                if (array[l] > array[l - 1]) {
                    variable = array[l - 1];
                    array[l - 1] = array[l];
                    array[l] = variable;
                }
            }
        }
        return array[0] * array[1];
    }

    public static void main(String[] args) {

        System.out.println(largestProductPossibleInArray(new int[]{-32, 4, 1, 2, 3, 1, 5, -3, 22}));
    }
}
