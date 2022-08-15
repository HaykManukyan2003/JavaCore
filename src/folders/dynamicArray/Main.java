package folders.dynamicArray;

public class Main {
    public static void main(String[] args) {

        DynamicArray object = new DynamicArray();

        object.add(3);
        object.add(32);
        object.add(12);
        object.add(23);
        object.add(56);
        object.add(11);
        object.add(54);

        object.print();

        /*int[] array2 = object.subArray(1, 5);
        for (int i : array2) {
            System.out.print(i + " ");
        }
        */
    }
}
