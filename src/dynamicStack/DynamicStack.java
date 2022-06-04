package dynamicStack;

public class DynamicStack {

    private char[] stack = new char[10];
    private int size = -1;

    void push(char value) {
        if (size == stack.length - 1) extendStack();
        stack[++size] = value;
    }

    char pop() {
        if (size >= 0) return stack[size--];
        else return 0;
    }

    char lastChar() {
        return stack[size];
    }

    void extendStack() {
        char[] reserveArray = new char[stack.length * 2];
        System.arraycopy(stack, 0, reserveArray, 0, size);
        stack = reserveArray;
    }

    boolean isEmpty() {
        return size == -1;
    }

}
