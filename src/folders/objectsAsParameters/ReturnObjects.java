package folders.objectsAsParameters;

public class ReturnObjects {

    int a;

    ReturnObjects(int i) {
        a = i;
    }

    public ReturnObjects incrementByTen() {
        return new ReturnObjects(a + 10);
    }

    public static void main(String[] args) {

        ReturnObjects obj1 = new ReturnObjects(2);

        ReturnObjects obj2;

        obj2 = obj1.incrementByTen();

        System.out.println(obj1.a);

        System.out.println(obj2.a);

        obj2 = obj2.incrementByTen();

        System.out.println(obj2.a);

    }
}
