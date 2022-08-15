package chapter8.inheritance.subclassSupperclass.example1;

public class Running extends Shoe {

    public final double weight;

    Running(double weight, String brand, double size) {
        super(brand, size);
        this.weight = weight;
    }


}
