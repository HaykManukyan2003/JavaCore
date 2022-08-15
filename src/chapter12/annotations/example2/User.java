package chapter12.annotations.example2;

import java.lang.reflect.Constructor;

public class User {

    private String name;
    private String surname;

    private User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private User() {
        // default constructor;
    }

    public static void main(String[] args) {

        User user = new User("gg", "yo");
        Class<? extends User> classInfo = user.getClass();

        Constructor<?>[] constructors = classInfo.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

    }
}
