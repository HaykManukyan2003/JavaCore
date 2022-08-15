package chapter7.keywordStatic;

public class StaticBlock {

    public static int a;
    public static int b;
    public int c;

    //initialize static block;
    static {
        a = -3;
        b = -5;
    }

    //static methods;
    public static int useStaticVariables() {
        return a * b; //both a and b are static;
        // cannot return a * c, because c is not static;
        // static methods cannot access non-static variables;
    }

    public static void staticMethod1() {
        System.out.println("this is static method 1");
        int number = useStaticVariables();
        System.out.println(number);
    }

    public static void staticMethod2() {
        System.out.println("this is static method 2");
        staticMethod1(); //calls another static method directly;
        // nonStaticMethod();  static methods cannot directly call non-static methods;
    }

    public void nonStaticMethod() {
        System.out.println("this method is not static");
        staticMethod1();
        staticMethod2();
        // non-static methods can call static methods;
    }


}

class StaticTest{

    public static void testMethod() {
        StaticBlock.staticMethod1();
        //when calling a static method from another class,
        //we should write the name of the class dot name of the method;
    }

    public static void main(String[] args) {

        testMethod();

        StaticBlock.staticMethod1();
        StaticBlock.staticMethod2();

        StaticBlock.a = 44;

        StaticBlock obj = new StaticBlock();
        obj.nonStaticMethod();

    }
}
