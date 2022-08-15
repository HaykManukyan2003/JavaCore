package folders.easy;

public class EvenNumbers {

    public static void main(String[] args) {

        int[] array = {1, 24, 31, 54, 6, 7, 23, 90, 5, 72};

        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
