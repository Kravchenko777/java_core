package lesson9;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExample {

    public static void main(String[] args) {
        Function<String, Integer> function = (str)->{
            return str.length();
        };

        System.out.println(function.apply("1111111111"));

        Predicate<String> predicate = (str)->{
            return str.length() > 100;
        };

        System.out.println(predicate.test("1111111111"));

        Consumer<String> consumer = (str)->{
            System.out.println(str.length());
        };

        consumer.accept("1111111111");

        Supplier<Date> supplier = () -> new Date();

        System.out.println(supplier.get());
    }
}
