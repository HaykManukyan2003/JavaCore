package folders.easy;

public class FindMidValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double midValue = 0;
        double sum = 0;

        for (int j : array) {
            sum = sum + j;
        }
        midValue = sum / array.length;
        System.out.println(midValue);
    }
}
