package folders.multiInheritance;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(2, 3, 4);
        Box box2 = new Box(box);

        BoxWeight gg = new BoxWeight();

    }
}
