package folders.multiInheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // construct clone of an object;
    BoxWeight(BoxWeight obj) {
        super(obj);
        weight = obj.weight;
    }

    // default constructor;
    BoxWeight() {
        super();
        weight = -1;
    }

    // constructor used when cube is created;
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }

}
