package chapter9.interfaces.applyingInterfaces;

interface IntStack {

    void push(int item);
    int pop();

    default void clear() {
        System.out.println("clear() is not implemented");
    }

    default int[] getElements(int n) { //private int[] getElements; available in JDK9;
        int[] elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = pop();
        }
        return elements;
    }

    default int[] popNElements(int n) {
        return getElements(n);
    }

    default int[] skipAndPopNElements(int skip, int n) {
        getElements(skip);
        return getElements(n);
    }

}

