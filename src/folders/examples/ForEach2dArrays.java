package folders.examples;

public class ForEach2dArrays {

    public static void main(String[] args) {

        int sum = 0;
        int [][] array = new int[3][5];

        //give some values;
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 5; l++) {
                array[k][l] = (k + 1) * (l + 1);
            }
        }

        for (int[] e : array) {
            for (int v : e) {
                System.out.println("value is " + v);
                sum += v;
            }
        }
        System.out.println("summation: " + sum);

    }
}
