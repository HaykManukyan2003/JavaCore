package chapter12.typeWrappers;

public class TypeWrappers {

    public static void main(String[] args) {

        Boolean value = Boolean.valueOf(true);
        Boolean value1 = Boolean.valueOf("121321");

        System.out.println(value);
        System.out.println(value1); //false;

        Character character = Character.valueOf('t');
        System.out.println(character);
        System.out.println(character.charValue());

        Integer integerObject = 100;
        int num = integerObject;
        System.out.println(num);
    }
}
