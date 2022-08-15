package chapter8.inheritance.subclassSupperclass.example2;

class SuperClass {

    public int i = 66;

    public int superClass_var;
    public int superClass_var2;

    SuperClass(int superClass_var, int superClass_var2) {
        this.superClass_var = superClass_var;
        this.superClass_var2 = superClass_var2;
    }

    SuperClass() {} //default constructor;

}

class SubClass extends SuperClass {

    public int i = 33;
    public int subClass_var;

    // when using custom constructor without super after extending another class,
    // the superclass should always have default constructor;
    SubClass(int superClass_var, int superClass_var2, int subClass_var) {
        this.superClass_var = superClass_var;
        this.superClass_var2 = superClass_var2;
        this.subClass_var = subClass_var;
    }

    public void showI() {
        System.out.println("superClass i = " + super.i + " subClass i = " + i);
    }

}

class Test {
    public static void main(String[] args) {

        SuperClass superClass = new SuperClass(3, 5);
        System.out.println("from superclass " + superClass.superClass_var + " " + superClass.superClass_var2);

        SubClass subClass = new SubClass(44, 65, 88);
        System.out.println("from subclass " + subClass.superClass_var + " " + subClass.superClass_var2);

        System.out.println("from superclass " + superClass.superClass_var + " " + superClass.superClass_var2);

        subClass.showI();
    }
}
