package lesson9;

import java.util.Comparator;
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

        Function<String, Integer> function2 = (str)-> str.length();

        System.out.println(function2.apply("1111111111"));

        Function<String, Integer> function3 = String::length;
        System.out.println(function3.apply("1111111111"));

        Function<String, Integer> function4 = Integer::new;

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


        Comparator<Integer> comparator = ((o1, o2) -> o1-o2);
        System.out.println(comparator.compare(100,77));


        methodExample(function);

        methodExample(str->{
            return str.length() +100;
        });

    }

    public static void methodExample(Function<String, Integer> function){
        function.apply("12313123123");
    }
}
