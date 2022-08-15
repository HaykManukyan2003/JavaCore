package folders.arrayExamples;

public class ReturnExample {

    public static boolean search(int num) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 44, 32};
        for (int k : array) {
            if (k == num) return true;
        }
        return false;
    }

    public static int returnIndex(int number) {
        int[] array1 = {2, 4, 5, 3, 32, 43, 22, 44, 12, 54};
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] == number) return j;
        }
        return -1;
    }

    public static int returnValueOfIndex(int index) {
        int[] array2 = {3, 2, 5, 4, 23, 43, 12, 44, 54, 10};
        if (index <= array2.length) return array2[index];
        return -1;
    }


    public static String checkForSimilarNumbers() {
        int[] array3 = {52, 3, 1, 43, 5, 1, 42, 2, 9, 11};
        for (int g = 0; g < array3.length - 1; g++) {
            for (int f = 0; f < array3.length - 1 - g; f++) {
                if (array3[f] > array3[f + 1]) {
                    int var = array3[f + 1];
                    array3[f + 1] = array3[f];
                    array3[f] = var;
                }
            }
        }

        for (int d = 0; d < array3.length - 1; d++) {
            if (array3[d] == array3[d + 1]) return "found similar values";
        }
        return "all integers are unique";
    }

    public static void fromBiggestToSmallest() {
        int[] array4 = {3, 42, 13, 43, 54, 65, 12, 76, 11, 2};
        int s = 0;

        for (int k = 0; k < array4.length - 1; k++) {
            for (s = 0; s < array4.length - 1; s++) {
                if (array4[s] < array4[s + 1]) {
                    int var = array4[s];
                    array4[s] = array4[s + 1];
                    array4[s + 1] = var;
                }
            }
        }
        System.out.println(array4[0]);
    }




    public static void main(String[] args) {
        //System.out.println(search(44));
        //System.out.println(returnIndex(5));
        //System.out.println(returnValueOfIndex(3));
        //System.out.println(checkForSimilarNumbers());
        fromBiggestToSmallest();
    }

    public static void giveValues(int ... array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

}
