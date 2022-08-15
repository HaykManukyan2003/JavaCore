package folders.superExamples;

public class Hero extends Person {

    public String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String displayInfo() {
        return super.name + " " + super.age + " " + this.power;
    }



}
