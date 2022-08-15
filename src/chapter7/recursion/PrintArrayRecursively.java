package chapter7.recursion;

public class PrintArrayRecursively {

    int[] values;

    PrintArrayRecursively(int k) {
        values = new int[k];
    }

    //display array recursively;
    void printArray(int k) {
        if (k == 0) return;
        else printArray(k - 1);

        System.out.println("[" + (k - 1) + "] " + values[k - 1]);
    }

    public static void main(String[] args) {

        PrintArrayRecursively obj = new PrintArrayRecursively(10);

        for (int l = 0; l < obj.values.length; l++) {
            obj.values[l] = l;
        }

        obj.printArray(obj.values.length);

    }

}
