package chapter8.inheritance.dynamicMethodDispatch.example3;

class A {
    int a = 1;
    int aa = 2;

    void gg() {
        System.out.println("class A");
    }

}

class B extends A{
    int b = 3;
    int bb = 4;

    void gg() {
        System.out.println("class B");
    }

    void bMethod() {
        System.out.println("method B");
    }

}

class Test {
    public static void main(String[] args) {

        A obj1 = new A(); // can access (a, aa);
        B obj2 = new B(); // can access (a, aa, b, bb);
        A obj3 = new B(); // can access (a, aa);

        System.out.println(obj1.a + " " + obj1.aa);
        System.out.println(obj2.a + " " + obj2.aa + " " + obj2.b + " " + obj2.bb);
        System.out.println(obj3.a + " " + obj3.aa);

        obj1.gg(); // displays class A;
        obj2.gg(); // displays class B;
        obj3.gg(); // displays class B;  overrides method gg(); //does not have access to bMethod();

    }
}
