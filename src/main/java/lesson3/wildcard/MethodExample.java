package lesson3.wildcard;

public class MethodExample {

    private double value;

    <T extends Number> MethodExample(T value){
        this.value = value.doubleValue();
    }

    public double getValue() {
        return value;
    }

    public static  <T extends Number, W extends Number> Double getSumm(T t, W w){
        return t.doubleValue()+w.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(getSumm(100,200));

        MethodExample methodExample = new MethodExample(100);
        System.out.println(methodExample.getValue());
    }
}
