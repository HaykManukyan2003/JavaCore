package chapter9.interfaces.interfaceExample;

interface WaterBottleInterface {

    public static final String color = "white";
    public void fillUp();
    public void pourUp();

    void calc(int num);

    default void method1() {
        System.out.println("water bottle interface method");
    }

}

interface gg{

    void calc(int number);

    static int getDefaultNumber() {
        return 0;
    }

    void fillUp();

    default void method1() {
        System.out.println("gg interface method");
    }

}

abstract class AbstractBottle extends Bottle3 {
    void ggYo() {
        System.out.println("gg");
    }
}

class Bottle2 implements WaterBottleInterface, gg {

    @Override
    public void fillUp() {
        System.out.println("filled up, ggs");
    }

    @Override
    public void pourUp() {
        System.out.println("poured up, ggs");
    }

    @Override
    public void calc(int num) {

    }

    @Override
    public void method1() {
        WaterBottleInterface.super.method1();
    }

}

abstract class Bottle3 implements WaterBottleInterface {
    // if class does not fully implement the Interface methods, class should be declared abstract;
    @Override
    public void fillUp() {

    }

    @Override
    public void pourUp() {

    }

}

class F {
    public interface InnerInterface {
         boolean isNotNegative(int num);
    }
}


public class Bottle implements WaterBottleInterface, gg, F.InnerInterface {



    @Override
    public void fillUp() {
        System.out.println("the bottle is filled up");
    }  //all implemented methods should be public;

    @Override
    public void pourUp() {
        System.out.println("the bottle is pouredUp");
    }

    @Override
    public void calc(int num) {
        System.out.println("num is " + num);
    }

    @Override
    public void method1() {
        WaterBottleInterface.super.method1();
    }

    public void notAnInterfaceMethod() {
        System.out.println("not an interface method");
    }

    @Override
    public boolean isNotNegative(int num) {
        return num >= 0;
    }

    public static void main(String[] args) {

        Bottle bottle1 = new Bottle();
        bottle1.fillUp();
        bottle1.pourUp();
        System.out.println(color);

        bottle1.fillUp();

        WaterBottleInterface c = new Bottle(); // creating an object with interface reference;
        // c has access to methods fillUp() and pourUp(), but not to notAnInterfaceMethod() which is in Bottle class;

        WaterBottleInterface bottle2 = new Bottle2();


        c.fillUp();
        bottle2.fillUp();

        //c = bottle2;

        c.fillUp();
        bottle2.fillUp();

        c.calc(3);

        c = bottle2;

        c.calc(3);
        bottle2.calc(7);

        bottle2.pourUp();
        c.pourUp();

        F.InnerInterface innerInterface = new Bottle();
        if (innerInterface.isNotNegative(3)) System.out.println("displayed");
        if (innerInterface.isNotNegative(-3)) System.out.println("not displayed"); //does not display;

        // innerInterface has access to only isNotNegative();

        Bottle bottle5 = new Bottle();
        bottle5.method1();

        int defaultNum = gg.getDefaultNumber();
        System.out.println(defaultNum);

        Bottle2 b22 = new Bottle2();
        b22.calc(4);

    }


}
