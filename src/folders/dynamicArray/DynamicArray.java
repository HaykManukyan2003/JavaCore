package folders.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size;

    DynamicArray() {
        size = 0;
    }

    //add value in array;
    public void add(int value) {
        if (size == array.length) extend();
        array[size++] = value;
    }

    //get size of array;
    public int sizeOfArray() { return size; }

    //extend size of the array;
    private void extend() {
        int[] newArray = new int[array.length + 10]; // create a new array with 10 more place;
        System.arraycopy(array, 0, newArray, 0, size); // set the old elements of array into the new one;
        array = newArray; // make a reference between old & new arrays;
    }

    //get element by index;
    public int getElementByIndex(int index) {
        if (index > size) return -1;
        return array[index];
    }

    // print all added elements of array;
    public void print() {
        for (int k = 0; k < array.length; k++) {
            if (k < size) System.out.print(array[k] + " ");
        }
        System.out.println();
    }

    // return largest number from array;
    public int max() {
        int max = array[0];

        for (int k = 0; k < size; k++) {
            if (array[k] > max) max = array[k];
        }
        return max;
    }

    // return smallest number from array;
    public int min() {
        int min = array[0];

        for (int k = 0; k < size; k++) {
            if (array[k] < min) min = array[k];
        }
        return min;
    }

    // delete value by index;
    public void deleteByIndex(int index) {
        if (index <= size) {
            for (int k = index; k < size; k++) {
                array[k] = array[k + 1];
            }
        }
        size--;
    }

    // delete all similar elements from array by value;
    public void deleteByValue(int value) {
        for (int k = 0; k < size; k++) {
            if (array[k] == value) {
                deleteByIndex(k);
                k--;
            }
        }
    }

    // delete elements from array by value, delete only first if there are similar values init;
    public void deleteByValueFirstOne(int value) {
        for (int k = 0; k < size; k++) {
            if (array[k] == value) {
                deleteByIndex(k);
                break;
            }
        }
    }

    // cut and create a new array via startIndex & endIndex, then return it;

    public int[] subArray(int startIndex, int endIndex) {
        int[] reserveArray = new int[0];
        if (startIndex < endIndex) {
            reserveArray = new int[(endIndex - startIndex) + 1];
            int index = 0;
            for (int k = startIndex; k <= endIndex; k++) {
                reserveArray[index++] = array[k];
            }
        }
        return reserveArray;
    }

/*
      //another version;
    public int[] subArray(int startIndex, int endIndex) {
        int[] reserveArray = new int[0];
        if (startIndex < endIndex) {
            reserveArray = new int[endIndex - startIndex];

            for (int k = 0; k < reserveArray.length; k++) {
                reserveArray[k] = array[startIndex + k]; //replaceable with System.arraycopy();
            }
        }
        return reserveArray;
    }
*/


    //cut and create a new array with startIndex, then return it;

    public int[] subArray(int startIndex) {
        return subArray(startIndex, size - 1);
    }


}
