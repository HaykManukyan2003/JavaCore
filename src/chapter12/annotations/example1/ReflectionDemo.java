package chapter12.annotations.example1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDemo {

    public static void main(String[] args) throws NoSuchMethodException {

        SomeClass someClass = new SomeClass();

        Class<?> aClass = someClass.getClass();
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        SomeClass someClass1 = new SomeClass();
        Class<? extends SomeClass> aClass1 = someClass1.getClass();

        Method meth = aClass1.getMethod("meth", String.class, int.class);
        MyAnnotation myAnnotation = meth.getDeclaredAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.str() + " " + myAnnotation.val());
        System.out.println(myAnnotation);

        SomeClass someClass2 = new SomeClass();
        Annotation[] annotations = someClass2.getClass().getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

    }
}
