package chapter8.inheritance.box;

public class Main {
    public static void main(String[] args) {

        BoxWeight boxWeight = new BoxWeight(3, 4, 6, 7);
        BoxWeight boxWeight1 = new BoxWeight(boxWeight);

        System.out.println(boxWeight.volume());
        System.out.println(boxWeight1.volume());

        boxWeight = new BoxWeight();
        System.out.println(boxWeight.volume()); //displays constructor of chapter8.inheritance.box, constructor of boxWeight;
    }
}
