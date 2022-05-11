public class FigurePainter2 {

    public static void main(String[] args) {


        int line = 4;
        String symbol = "*";

//        * * * *
//          * * *
//            * *
//              *

        for (int k = 0; k < line; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print("  ");
            }
            for (int i = k; i < line; i++) {
                System.out.print(" " + symbol);
            }
            System.out.println();
        }

//        *
//       * *
//      * * *
//     * * * *
//      * * *
//       * *
//        *


        for (int k = 0; k < line; k++) {
            for (int l = k; l < line; l++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= k; i++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < line - 1; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < line - 1; j++) {
                System.out.print(" " + symbol);
            }
            System.out.println();
        }

    }
}
