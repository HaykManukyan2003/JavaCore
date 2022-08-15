package folders.easy;

public class FindValueDuplicationInArray {

    public static void main(String[] args) {

        int[] array = {4, 3, 22, 55, 3, 10, 22, 53, 22, 3};

        for (int k = 0; k < array.length; k++) {
            for (int l = k + 1; l < array.length; l++) {
                if (array[k] == array[l]) System.out.println(array[k] + " has duplication");
            }
        }
    }
}
