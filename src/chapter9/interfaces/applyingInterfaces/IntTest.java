package chapter9.interfaces.applyingInterfaces;

class IntTest {

    public static void main(String[] args) {

        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        for (int k = 0; k < 5; k++) myStack1.push(k);
        for (int l = 0; l < 16; l++) myStack2.push(l);

        System.out.println("folders.stack in myStack1:");
        for (int k = 0; k < 5; k++) System.out.print(myStack1.pop() + " ");

        System.out.println();

        System.out.println("folders.stack in myStack2");
        for (int l = 0; l < 16; l++) System.out.print(myStack2.pop() + " ");

        int num = myStack2.pop();
        System.out.println(num); // prints "folders.stack underflow" and returns 0;
    }
}
