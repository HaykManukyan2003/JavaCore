package folders.shapes;

public class SymbolLines {
    public static void main(String[] args) {
        int line = 8;

        for (int i = 0; i < line; i++) {
            if (i % 2 == 0) System.out.print(" ");

            for (int k = 0; k < line; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
