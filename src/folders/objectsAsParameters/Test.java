package folders.objectsAsParameters;

public class Test {

    int a;
    int b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    public boolean equalTo(Test o) {
        return o.a == a && o.b == b;
    }

    public static void main(String[] args) {

        Test obj1 = new Test(2, 3);
        Test obj2 = new Test(2, 3);
        Test obj3 = new Test(2, 4);

        System.out.println(obj1.equalTo(obj2));
        System.out.println(obj1.equalTo(obj3));

    }
}
