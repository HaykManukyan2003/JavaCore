package folders.stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<Number> stack1 = new Stack<Number>();
        Stack<Number> stack2 = new Stack<Number>();

        for (int k = 0; k < 10; k++) stack1.push(k);
        for (int k = 10; k < 20; k++) stack2.push(k);

        System.out.println("stack1");
        for (int l = 0; l < 10; l++) System.out.println(stack1.pop());
        System.out.println("stack2");
        for (int l = 0; l < 10; l++) System.out.println(stack2.pop());

    }
}
