package chapter12.enums;

public enum Car {

    BMW(3500),
    MERCEDES(5600),
    FORD(7000);

    private final int price;

    private Car(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

class testEnums {

    public static void main(String[] args) {

        for(Car car : Car.values()) {
            System.out.println(car.ordinal());
            System.out.println(car.getPrice());
        }

        Car car;
        car = Car.MERCEDES;
        int result = car.compareTo(Car.BMW);
        System.out.println(result);
        result = car.compareTo(Car.FORD);
        System.out.println(result);
    }
}
