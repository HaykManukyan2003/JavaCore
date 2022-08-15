package folders.multiInheritance;

public class Shipment extends BoxWeight {
    double cost;

    // constructor when all parameters are specified;
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // construct clone of an object;
    Shipment(Shipment obj) {
        super(obj);
        cost = obj.cost;
    }



}
