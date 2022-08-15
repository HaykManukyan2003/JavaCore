package chapter8.inheritance.box;

public class Box {

    private final double width;
    private final double height;
    private final double depth;

    Box(Box ob) { //construct clone of an object;
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double width, double height, double depth){ //when all dimensions specified;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() { //when no dimension specified;
        System.out.println("constructor of Box");
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) { //when cube is created;
        width = height = depth = len;
    }

    public double volume() { //compute and return volume;
        return width * height * depth;
    }
}

class BoxWeight extends Box{

    public double weight; //weight of chapter8.inheritance.box;

    BoxWeight(double width, double height, double depth, double weight) { //when all dimensions specified;
        super(width, height, depth);
        this.weight = weight;
    }

    //construct clone of an object;
    //for example, BoxWeight bw = new BoxWeight(3, 4, 6, 7);  BoxWeight bw1 = new BoxWeight(bw);

    BoxWeight(BoxWeight obj) {
        super(obj);
        weight = obj.weight;
    }

    //default constructor;
    BoxWeight() {
        super(); // Call to 'super()' must be first statement in constructor body
        System.out.println("constructor of Box Weight");
        weight = -1;
    }

    //when cube is constructed;
    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }
}

class Shipment extends BoxWeight {
    double cost;

    //construct clone of an object;
    Shipment(Shipment obj) {
        super(obj);
        cost = obj.cost;
    }
}

class ColorBox extends Box {
    public int color; //color of chapter8.inheritance.box;

    ColorBox(double width, double height, double depth, int color) {
        super(width, height, depth);
        this.color = color;
    }
}
