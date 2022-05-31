package homework.practiceHomework;

public class PracticeHomework {

    public long convertToSeconds(int minutes) {
        return (long) minutes * 60;
    }

    public int calcDaysOfGivenYear(int year) {
        return year * 365;
    }

    public boolean isEqual(int a, int b) {
        return a == b;
    }

    public boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
    }

    public boolean reversedBoolean(boolean value) {
        return !value;
    }

    public int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }

    public static void main(String[] args) {

        PracticeHomework obj = new PracticeHomework();

        System.out.println(obj.maxLength(new int[] {3, 4, 5}, new int[] {2, 3, 4, 6, 7}));
        System.out.println(obj.reversedBoolean(true));
        System.out.println(obj.lessThanOrEqualToZero(43));
        System.out.println(obj.isEqual(4, 66));
        System.out.println(obj.calcDaysOfGivenYear(2));
        System.out.println(obj.convertToSeconds(4));
    }
}
