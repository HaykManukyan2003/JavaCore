package folders.overloadingConstructor;

public class Pizza {

    public String bread;
    public String sauce;
    public String cheese;
    public String topping;

    Pizza(String bread, String sauce, String cheese) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;

    }

    Pizza(String bread, String sauce, String cheese, String topping) {

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }

    public static void main(String[] args) {

        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");
        Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozzerella");



    }
}
