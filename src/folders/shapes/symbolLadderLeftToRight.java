package folders.shapes;

public class symbolLadderLeftToRight {
    public static void main(String[] args) {
        char symbol = '*';
        int lines = 4;

        for (int j = 0; j < lines; j++) {
            for (int n = 0; n <= j; n++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
