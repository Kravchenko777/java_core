package lesson3;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.*;

public class LambdaExample {

    public static void main(String[] args) {

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Function<String, Integer> function3 = (str)->{
            Integer value = str.length();
            return value;
        };




        Function<String, Integer> function2 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length() + 100;
            }
        };

        System.out.println(function.apply("123"));

        Function<Double, Integer> function1 = new Function<Double, Integer>() {
            @Override
            public Integer apply(Double aDouble) {
                return aDouble.intValue();
            }
        };

        System.out.println(function1.apply(20D));


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

        Supplier<Date> supplier = new Supplier<Date>() {
            @Override
            public Date get() {
                return new Date();
            }
        };

        System.out.println(supplier.get());


        ArrayList<String> arrayList = new ArrayList<>(100);


    }
}
