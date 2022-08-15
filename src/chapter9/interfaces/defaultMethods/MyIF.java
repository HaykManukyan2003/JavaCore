package chapter9.interfaces.defaultMethods;

public interface MyIF {

    int getNumber();

    default String getString() {
        return "Default String";
    }

}

class MyIfImp implements MyIF {

    @Override
    public int getNumber() {
        return 100;
    }

}

class MyIfImp2 implements MyIF {

    @Override
    public int getNumber() {
        return 200;
    }

    @Override
    public String getString() {
        return "this is override default method";
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIfImp obj = new MyIfImp();

        System.out.println(obj.getNumber());
        System.out.println(obj.getString());

        MyIfImp2 obj2 = new MyIfImp2();

        System.out.println(obj2.getString());
    }
}
