package chapter7.keywordFinal;

public class FinalExamples {

    final public String MY_NAME = "Hayk"; // initializing a final variable when it's declared;
    final public static double NUMBER_PI; //not initialized yet;
    final public double ZER0; //not initialized yet;

    // we cannot make the final array refer to some other array,
    // but the data within an array that is made final can be changed/manipulated;
    final public static int[] array = {1, 2, 3, 4, 5};

    //initializing final static variable NUMBER_PI via static block;
    static {
        NUMBER_PI = 3;
    }

    //initializing final non-static variable ZERO via constructor;
    FinalExamples() {
        ZER0 = 0;
    }

    public static void main(String[] args) {

        // though the array is final we can still change values init;
        for (int k = 0; k < array.length; k++) {
            array[k] = array[k] * 10;
            System.out.print(array[k] + " ");
        }

        System.out.print("\n");

        // but we cannot change the reference of array;
        // for example this is not possible;

        int[] array2 = {4, 65, 77, 55, 88}; //creating a new array;
        // array = array2;   changing the reference;
        // this is not possible, reference of array cannot be changed to refer,
        // to anything else when it's final;

        array2 = array; //vice versa is possible;
        for (int k : array2) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
        // array2 = {4, 65, 77, 55, 88} are now changed to 10, 20, 30, 40, 50;


        //.........................................................


        // same thing works with objects also;
        final FinalExamples finalObj = new FinalExamples();
        FinalExamples obj = new FinalExamples();

        // finalObj = obj;  error;
        // cannot change the reference of final declared object;


        //.........................................................

        int result = (int) (obj.ZER0 * NUMBER_PI);
        System.out.println(result);
    }

}
