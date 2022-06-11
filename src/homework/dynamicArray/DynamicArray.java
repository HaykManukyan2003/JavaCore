package homework.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getValueByIndex(int index) {
        if (!(index < 0) && !(index > size)) return array[index];
        else return 0;
    }

    public int getIndexByValue(int value) {
        int result = 0;

        for (int k = 0; k < size; k++) {
            if (array[k] == value) return k;
        }
        return result;
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public void insert(int index, int value) {
        for (int k = size - 1; k >= index; k--) {
            array[k + 1] = array[k];
        }
        array[index] = value;
        size++;
    }

    public void deleteByIndex(int index) {
        for (int k = index; k < size; k++) {
            array[k] = array[k + 1];
        }
        size--;
    }

    public void printArray() {
        for (int k = 0; k < size; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.print("\n");
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    public int getSize() {
        return size;
    }

}

