package folders.shapes;

public class SymbolLadder {
    public static void main(String[] args) {
        int lines = 4;
        String symbol = "* ";

        for (int x = lines; x > 0; x--) {
            for (int j = 0; j < x; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
