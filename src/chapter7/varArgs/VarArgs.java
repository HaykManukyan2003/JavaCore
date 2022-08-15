package chapter7.varArgs;

public class VarArgs {

    // Remember, the ... causes the parameter
    // to be treated as an array of the specified type;
    public static void varArgsMethod(int ... v) { //old version - varArgsMethod(int[] array);
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    //method overloading;
    public static void varArgsMethod(boolean ... v) { //old version - varArgsMethod(boolean[] array);
        for (boolean b : v) {
            System.out.print(b + " ");
        }
        System.out.print("\n");
    }

    //method overloading;
    public static void varArgsMethod(String msg, int ... v) {
        System.out.print(msg + ": ");
        for (int s : v) {
            System.out.print(s + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        varArgsMethod(3, 4, 5, 6, 12);
        varArgsMethod(true, true, false);
        varArgsMethod("given nums", 34, 22, 45, 76);

    }
}
