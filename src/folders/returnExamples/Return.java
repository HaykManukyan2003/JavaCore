package folders.returnExamples;

public class Return {

    public static int add(int a, int b) {
        return a + b;
    }

    public static String text(String text) {
        return text.toUpperCase();
    }

    public static int[] giveMeArrayOfInts(int a, int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }

    public static void main(String[] args) {

        System.out.println(add(4, 2));
        String uppercaseText = text("gg yo naka");
        System.out.println(uppercaseText);
        int[] numArray = giveMeArrayOfInts(4, 5, 1);
        System.out.println(numArray[0]);
        System.out.println(numArray[1]);
        System.out.println(numArray[2]);
    }
}
