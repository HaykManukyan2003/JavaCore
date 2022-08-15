package chapter8.inheritance.dynamicMethodDispatch.example2;

class Figure {

    public double dim1;
    public double dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area() {
        System.out.println("Area for figure is undefined.");
        return 0;
    }

}

class Rectangle extends Figure {

    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    //override area for rectangle;
    public double area() {
        System.out.println("Inside area of rectangle.");
        return dim1 * dim2;
    }

}

class Triangle extends Figure {

    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    //override area for right triangle;
    public double area() {
        System.out.println("Inside area for Triangle.");
        return dim1 * dim2 / 2;
    }

}

class FindAreas {

    public static void main(String[] args) {

        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);

        Figure figureReference;

        figureReference = rectangle;
        System.out.println("area is " + figureReference.area());

        figureReference = triangle;
        System.out.println("area is " + figureReference.area());

        figureReference = figure;
        System.out.println("area is " + figureReference.area());


    }
}
