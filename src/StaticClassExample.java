public class StaticClassExample {

    StClass stClass = new StClass(16);

    private static class StClass {

        int a;

        public StClass(int a) {
            this.a = a;
        }
    }

    public static void main(String[] args) {
        StClass stClass1 = new StClass(3);
    }

    class GG extends StClass {

        public GG(int a) {
            super(a);
        }
    }
}
