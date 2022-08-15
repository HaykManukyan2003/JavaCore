package chapter7.nestedAndInnerClasses;

class Outer {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner { // this is an inner class

        public int inner_x = 3;
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.test();


    }
}
