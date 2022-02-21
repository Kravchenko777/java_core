package lesson3.wildcard;

public class BoxWithNumbersDemoApp {
    public static void main(String args[]) {
        BoxWithNumbers<Integer> intBoxWithNumbers1 = new BoxWithNumbers<>(1, 2, 3, 4, 5);
        BoxWithNumbers<Integer> intBoxWithNumbers2 = new BoxWithNumbers<>(2, 1, 3, 4, 5);
        BoxWithNumbers<Double> doubleBoxWithNumbers = new BoxWithNumbers<>(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(intBoxWithNumbers1.sameAvg(intBoxWithNumbers2)); // Так работает
       // System.out.println(intBoxWithNumbers1.sameAvg(doubleBoxWithNumbers)); // Ошибка
        // (T = Integer) != (T = Double)
    }


}



