package folders.shapes;

public class TriangleMethod {

    public static void printStars(int number) {
        int l = 0;
        while (l < number) {
            System.out.print("*");
            l++;
        }
        System.out.println();
    }

    public static void displayTriangle(int lineCount) {
        for (int k = 0; k < lineCount; k++) {
           for (int l = 0; l < k; l++) {
               System.out.print("*");
           }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayTriangle(5);
    }
}
