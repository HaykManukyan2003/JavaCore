package folders.shapes;

public class SymbolUp {
    public static void main(String[] args) {
        int line = 6;

        for (int i = 0; i <= line; i++) {
            for (int j = i; j < line; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int n = 0; n <= line; n++) {
            for (int o = 0; o < line; o++) {
                //System.out.print(" ");
                if (o == line / 2) {
                    System.out.println("*");
                } else System.out.print(" ");
            }
        }
    }
}
