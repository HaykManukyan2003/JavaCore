package chapter12.annotations.example1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class SomeClass {

    @MyAnnotation(str = "gg", val = 1)
    @CustomAnnotation
    public void meth(String string, int num) {

    }

}
