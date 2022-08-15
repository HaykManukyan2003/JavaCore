package folders.easy;

public class UpByTwo {
    public static void main(String[] args) {
        int[] numArray = new int[25];

        int plusTwo = 2;

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = plusTwo;
            plusTwo = plusTwo + 2;
            System.out.println(numArray[i]);
        }
    }
}
