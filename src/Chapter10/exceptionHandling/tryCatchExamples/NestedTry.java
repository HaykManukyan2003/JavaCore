package Chapter10.exceptionHandling.tryCatchExamples;

import static Chapter10.exceptionHandling.tryCatchExamples.MethNestTry.nestTry;

class MethNestTry {

    static void nestTry(int a) {
        try {
            if (a == 1) a = a / (a - a);
            if (a == 2) {
                int[] array = {1};
                array[21] = 16;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bounds: " + e);
        }
    }

}

public class NestedTry {

    public static void main(String[] args) {

        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a " + a);

            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println("divide by 0: " + e);
        }

//        try {
//            int a = args.length;
//            //if no command line args are present, the following statement will generate a divide-by-zero exception;
//            int b = 42 / a;
//            System.out.println("a: " + a);
//
//            try {
//                //if one command line arg is used, then a divide-by-zero exception will be generated by the following code;
//                if (a == 1) a = a / (a - a); //division by zero;
//
//                //if two command line args are used, then generate an out-of-bounds exception;
//                if (a == 2) {
//                    int[] c = { 1 };
//                    c[42] = 90; //generate an out-of-bounds exception;
//                }
//
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println(e);
//            }
//
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }

    }
}
