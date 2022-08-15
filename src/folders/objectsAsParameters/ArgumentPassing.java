package folders.objectsAsParameters;

public class ArgumentPassing {

    int a;
    int b;

    ArgumentPassing(int num1, int num2) {
        a = num1;
        b = num2;
    }

    void method(ArgumentPassing obj) {
        obj.a = (obj.a * 2);
        obj.b = (obj.b * 2);
    }

    public static void main(String[] args) {

        ArgumentPassing object1 = new ArgumentPassing(3, 4);
        object1.method(object1);

        System.out.println(object1.a + " " + object1.b);

        ArgumentPassing object2 = new ArgumentPassing(5, 7);
        object2.method(object1);

        System.out.println(object2.a + " " + object2.b);
        System.out.println(object1.a + " " + object1.b);

        object1.method(object2);
        System.out.println(object1.a + " " + object1.a);
        System.out.println(object2.a + " " + object2.b);

    }
}
