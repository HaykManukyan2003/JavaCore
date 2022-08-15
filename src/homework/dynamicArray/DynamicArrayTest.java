package homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray object = new DynamicArray();

        object.add(1);
        object.add(2);
        object.add(3);
        object.add(4);
        object.add(5);
        object.insert(1, 2);
        object.insert(2, 3);
        object.insert(3, 4);
        object.insert(4, 5);
        object.insert(6, 7);
        object.insert(8, 9);
        object.insert(10, 11);
        object.insert(11, 12);
        object.insert(12, 13);
        object.insert(13, 14);
        object.insert(14, 15);
        object.insert(16, 55);
        object.insert(12, 44);

        object.printArray();

    }
}
