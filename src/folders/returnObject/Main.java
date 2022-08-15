package folders.returnObject;

public class Main {

    public static void main(String[] args) {

        ObjectReturn object1 = new ObjectReturn(3);
        ObjectReturn object2;

        object1.incrementByTen();

        System.out.println(object1.a);

        object2 = object1.incrementByTen();

        System.out.println("object1.a = " + object1.a);
        System.out.println("object2.a = " + object2.a);

        object1 = object1.incrementByTen();
        System.out.println(object1.a);
        System.out.println(object2.a);
    }
}
