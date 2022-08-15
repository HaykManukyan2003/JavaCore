package folders.superExample;

class Vehicle {

    public int maxSpeed = 120;

    Vehicle() {
        System.out.println("blaaaaa");
    }
}

class Car extends Vehicle {

    public int maxSpeed = 100;

    public void displayMaxSpeed() { System.out.println(super.maxSpeed); }

    Car() {

        System.out.println("ggyo");
    }

}

class Main {

    public static void main(String[] args) {

        Car c = new Car();

    }
}
