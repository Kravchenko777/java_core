package lesson3.wildcard;

import java.util.ArrayList;
import java.util.List;

public class SuperExample {

    static List<? extends Number> foo;
/*
    static List<? extends Number> foo = new ArrayList<Number>();  // Number "extends" Number (in this context)
    static List<? extends Number> foo = new ArrayList<Integer>(); // Integer extends Number
    static List<? extends Number> foo = new ArrayList<Double>();  // Double extends Number

*/

    static List<? super Integer> foo_;

    /*
    List<? super Integer> foo_ = new ArrayList<Integer>();  // Integer is a "superclass" of Integer (in this context)
    List<? super Integer> foo_ = new ArrayList<Number>();   // Number is a superclass of Integer
    List<? super Integer> foo_ = new ArrayList<Object>();   // Object is a superclass of Integer

     */

    public static <T> Object getFirst(List<? super T> list) {
        return list.get(0);
    }

    public static void main(String[] args) {
        foo = new ArrayList<>();
        //foo.add(Integer.valueOf(100));
        foo_ = new ArrayList<>();
        foo_.add(100);
        getFirst(foo_);
        //foo_.add(new Object());

        //get T from List<? extends T>
        //add U to from List<? super U>

    }


}
