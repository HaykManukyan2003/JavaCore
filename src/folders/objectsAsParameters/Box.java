package folders.objectsAsParameters;

public class Box {

    private double width;
    private double height;
    private double depth;

    Box(double width, double height, double depth) { this.width = width; this.height = height; this.depth = depth; }
    Box(Box obj) { width = obj.width; height = obj.height; depth = obj.depth; }

    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }
    public void setDepth(double depth) { this.depth = depth; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public double getDepth() { return depth; }

    public void getFullInfo() { System.out.println(width + " " + height + " " + depth); }

    public static void main(String[] args) {

        Box box1 = new Box(2, 3, 4);
        Box box2 = new Box(box1);

        box2.getFullInfo();

        box1.setDepth(32);

        box1.getFullInfo();
        box2.getFullInfo();

    }
}
