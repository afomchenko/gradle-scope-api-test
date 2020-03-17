package my.example;

import my.example.impl.MyClass;
//import org.apache.commons.lang3.tuple.Pair;

public class MyApiClass {
    public void doSomething(){
        new MyClass().doSomething();
//        produces compile error
//        Pair.of("key", "value");
    }
}
