package folders.easy;

public class SmallestNumber {

    public static void main(String[] args) {

        int[] numArray = {4, 32, 12, 43, 67, 3, 55};

        int smallestNum = numArray[0];

        for (int i : numArray) {
            if (i < smallestNum) {
                smallestNum = i;
            }
        }
        System.out.println(smallestNum);
    }
}
