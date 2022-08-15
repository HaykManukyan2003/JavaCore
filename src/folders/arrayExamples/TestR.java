package folders.arrayExamples;

public class TestR {

    private int a;
    private int b;

    public void setA(int a) { this.a = a; }
    public void setB(int b) { this.b = b; }

    public int getA() { return a; }
    public int getB() { return b; }

    TestR(int a, int b) {

        this.a = a;
        this.b = b;

    }

    public TestR returnObject() {
        return new TestR(a + 3, b * 2);
    }

    public static void main(String[] args) {

        TestR ob = new TestR(3, 7);
        TestR ob2;

        ob2 = ob.returnObject();

        System.out.println(ob.getA() + " " + ob.getB());
        System.out.println(ob2.getA() + " " + ob2.getB());

        //int[]array = {3, 4, 5, 6};
        ReturnExample.giveValues(4, 5, 21, 3, 4, 5);
    }
}
