package folders.easy;

public class SimpleNumbers {
    public static int findPrimeNumber(int num) {
        for(int k = 2; k <= num / 2; k++) {
            if (num % k == 0) return 0;
        }
        return num;
    }

    public static void main(String[] args) {

        int[] array = {3, 5, 12, 65, 22, 34, 11};
        for (int i : array) {
            System.out.println(findPrimeNumber(i));
        }
    }

}
