import java.util.Stack;

public class QueueExample<T> {

    public static void main(String[] args) {

        QueueExample<Integer> queueExample = new QueueExample<>();

        queueExample.add(3);
        queueExample.add(4);

        System.out.println("size " + queueExample.size());

        Integer poll2 = queueExample.poll();
        System.out.println("polled item " + poll2);

        System.out.println("size " + queueExample.size());

        queueExample.add(35);
        System.out.println("size " + queueExample.size());

        System.out.println(queueExample.peek());
        System.out.println("size " + queueExample.size());

    }

    private final Stack<T> stack1 = new Stack<>();
    private final Stack<T> stack2 = new Stack<>();

    public void add(T t) {
        stack1.push(t);
    }

    public T poll() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public T peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

}
