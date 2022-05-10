public class FigurePainter {

    public static void main(String[] args) {

        String symbol = "* ";
        String symbol2 = " *";
        int line = 5;
        String space = " ";


//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

        for (int k = 0; k < line; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        System.out.println();

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        for (int k = 0; k < line; k++) {
            for (int l = 0; l < line - k; l++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        System.out.println();


//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *


        for (int k = 0; k < line; k++) {
            for (int l = 0; l < line - k; l++) {
                System.out.print(space);
            }
            for (int j = 0; j <= k; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        for (int k = 0; k < line - 1; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print(space);
            }
            for (int j = 0; j < line - k - 1; j++) {
                System.out.print(symbol2);
            }
            System.out.println();
        }

//          *
//        * *
//      * * *
//    * * * *
//  * * * * *

        for (int k = 0; k < line; k++) {
            for (int l = k; l < line; l++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();


//            *  *  *  *  *
//            *           *
//            *           *
//            *           *
//            *  *  *  *  *

        for (int k = 0; k < line; k++) {
            for (int l = 0; l < line; l++) {
               if (k > 0 && k < line - 1 && l > 0 && l < line - 1) {
                   System.out.print("   ");
               } else System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
