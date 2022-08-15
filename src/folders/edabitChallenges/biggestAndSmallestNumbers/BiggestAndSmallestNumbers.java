package folders.edabitChallenges.biggestAndSmallestNumbers;

import java.util.stream.Stream;

public class BiggestAndSmallestNumbers {
    /*
    public static int findBiggestNumber(int num1, int num2, int num3) {
        return Stream.of(num1, num2, num3).max(Integer::compareTo).get();
    }

    public static int findSmallestNumber(int num1, int num2, int num3) {
        return Stream.of(num1, num2, num3).min(Integer::compareTo).get();
    }
*/

    public static int findMinOrMaxNumber(int num1, int num2, int num3, String typeMinOrMax) {
        int result = 0;
        if (typeMinOrMax.equalsIgnoreCase("Min")) {
            result = Stream.of(num1, num2, num3).min(Integer::compareTo).get();
        } else if (typeMinOrMax.equalsIgnoreCase("Max")) {
            result = Stream.of(num1, num2, num3).max(Integer::compareTo).get();
        }
        return result;
    }
    public static int findMaxMinusMin(int num1, int num2, int num3) {
        int max = findMinOrMaxNumber(num1, num2, num3, "Max");
        int min = findMinOrMaxNumber(num1, num2, num3, "min");
        return max - min;
    }
}

