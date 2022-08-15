class SingleObjectClass {

    private static String name;
    private static final SingleObjectClass object = new SingleObjectClass();

    private SingleObjectClass() { }

    public static SingleObjectClass getObject(String name) {
        SingleObjectClass.name = name;
        return object;
    }

    public String getName() {
        return name;
    }
}

class TestDemo {
    public static void main(String[] args) {
        SingleObjectClass object = SingleObjectClass.getObject("gg");
        System.out.println(object.getName());

        SingleObjectClass object2 = SingleObjectClass.getObject("ggYo");
        System.out.println(object2.getName());
    }
}
