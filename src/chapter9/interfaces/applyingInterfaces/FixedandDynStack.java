package chapter9.interfaces.applyingInterfaces;

class DynStack implements IntStack{

    private int[] stack;
    private int tos;

    DynStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stack.length - 1) {
            int[] temp = new int[stack.length * 2];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            stack = temp;
        }
        stack[++tos] = item;
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("folders.stack underflow");
            return 0;
        } else return stack[tos--];
    }
}
