package lesson9;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(function.apply("1111111111"));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>100;
            }
        };

        System.out.println(predicate.test("1111111111"));

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.length());
            }
        };

        consumer.accept("1111111111");

        Supplier<Date> supplier = new Supplier<Date>() {
            @Override
            public Date get() {
                return new Date();
            }
        };

        System.out.println(supplier.get());


    }
}
