package lesson9;

import java.util.function.Function;

public class FunctionTest implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
