package chapter14.generics.example2;

public class ParameterizedClass {

    public static void main(String[] args) {

        Info<Integer> integerInfo = new Info<>(54);
        int intValue = integerInfo.getValue();
        System.out.println(intValue);

        Info<Double> doubleInfo = new Info<>(32.0);
        Double doubleValue = doubleInfo.getValue();
        System.out.println(doubleValue);
    }
}

class Info <T extends Number> { // class Info <T extends Number  & if1 & if2>
    private T value; // T value cannot be static;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[{ " + value + " }]";
    }

    public T getValue() {
        return value;
    }

}

interface if1 {}
interface if2 {}
