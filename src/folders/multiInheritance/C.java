package folders.multiInheritance;

class Box {
    private double width;
    private double height;
    private double depth;

    // construct clone of an object
    Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    public double volume() {
        return width * height * depth;
    }
}
