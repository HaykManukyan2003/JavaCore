package folders.overloadingConstructor;

public class Box {

    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) { this.width = width; this.height = height; this.depth = depth; }
    Box(double len) { width = depth = height = len; }
    Box() { width = -1; height = -1; depth = -1; }

    public double getVolume() { return height * depth * width; }

    public static void main(String[] args) {

        Box box1 = new Box(2, 3, 4);
        Box box2 = new Box(2);
        Box box3 = new Box();

        System.out.println(box1.getVolume());
        System.out.println(box2.getVolume());
        System.out.println(box3.getVolume());

    }
}
