package folders.easy;

public class FromSmallerToBigger {

    public static void main(String[] args) {

        int[] array2 = {3, 43, 21, 13, 11, 2, 87, 65};

        for (int k = 0; k < array2.length - 1; k++) {
            for (int l = k + 1; l < array2.length; l++) {
                if (array2[k] > array2[l]) {
                    int var = array2[l];
                    array2[l] = array2[k];
                    array2[k] = var;
                }
            }
        }
        for (int j : array2) System.out.print(j + " ");
    }
}
