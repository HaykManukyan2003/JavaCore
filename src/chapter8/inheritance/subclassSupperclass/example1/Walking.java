package chapter8.inheritance.subclassSupperclass.example1;

import chapter8.inheritance.subclassSupperclass.example1.Shoe;

public class Walking extends Shoe {

    public final boolean goreTex;

    Walking(boolean goreTex, String brand, double size) {
        super(brand, size);
        this.goreTex = goreTex;
    }
}
