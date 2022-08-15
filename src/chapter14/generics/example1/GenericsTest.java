package chapter14.generics.example1;

public class GenericsTest {

    public static void main(String[] args) {

        Printer<Integer> integerPrinter = new Printer<>(23);
        integerPrinter.print();

        Printer<Double> doublePrinter = new Printer<>(300.000);
        doublePrinter.print();



    }
}
