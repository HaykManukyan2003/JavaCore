package homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray object = new DynamicArray();

        object.add(1);
        object.add(2);
        object.add(3);
        object.add(4);

        object.printArray();

        object.insert(2, 99);
        object.insert(0, 66);

        object.printArray();

        object.deleteByIndex(1);

        System.out.println(object.getIndexByValue(99));

        object.printArray();

        object.set(2, 25);

        object.printArray();

        System.out.println(object.isEmpty());

        System.out.println(object.getValueByIndex(2));

    }
}
