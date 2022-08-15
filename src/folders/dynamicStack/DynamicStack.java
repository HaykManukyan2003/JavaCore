package folders.dynamicStack;

public class DynamicStack implements StackInterface {

    private char[] stack = new char[10];
    private int size = -1;

    @Override
    public void push(char value) {
        if (size == stack.length - 1) extendStack();
        stack[++size] = value;
    }

    @Override
    public char pop() {
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

    boolean isNotEmpty() {
        return size != -1;
    }

}
