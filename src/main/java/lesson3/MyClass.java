package lesson3;

import java.util.function.Function;

public class MyClass implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
