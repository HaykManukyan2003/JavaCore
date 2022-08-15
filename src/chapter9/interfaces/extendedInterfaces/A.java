package chapter9.interfaces.extendedInterfaces;

interface A {
    void meth1();
    void meth2();
}

interface B extends A { // B now includes meth1() & meth2() ...and meth3();
    void meth3();
}

class MyClass implements B {

    @Override
    public void meth1() {
        System.out.println("implement meth1()");
    }
    @Override
    public void meth2() {
        System.out.println("implement meth2()");
    }
    @Override
    public void meth3() {
        System.out.println("implement meth3()");
    }

}

class IfExtend {
    public static void main(String[] args) {

        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}