package lesson3;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExample {

    public static void main(String[] args) {

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length() + 100;
            }
        };

        System.out.println(function.apply("123"));


        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>100;
            }
        };

        System.out.println(predicate.test("abcd"));

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        };

        consumer.accept("123");

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return new Date().toString();
            }
        };

        System.out.println(supplier.get());


        ArrayList<String> arrayList = new ArrayList<>(100);

    }
}
