public class Square {

    public static void main(String[] args) {

        for (int l = 0; l < 6; l++) {
            for (int k = 0; k < 6; k++) {
                if (k > 0 && k < 5 && l > 0 && l < 5) {
                    System.out.print("  ");
                } else System.out.print(" *");
            }
            System.out.println();
        }


    }
}
