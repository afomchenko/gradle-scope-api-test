package my.example;

import my.example.impl.MyClass;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

public class MyTestClass {

    @Test
    public void doTest(){
        new MyClass().doSomething();
        System.out.println(Pair.of("key", "value"));
    }
}
