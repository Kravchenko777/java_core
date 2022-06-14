package lesson3.wildcard;

public class ExtendExample {

   public static void main(String[] args) {
        Element<Integer, Integer> elementIntInt = new Element<>(100, 200);
        elementIntInt.getSumm();

        new Element<Long, Integer>(100L, 200).getSumm();

        new Element<Double, Long>(Double.valueOf("100"), 200L).getSumm();

        System.out.println(elementIntInt.gt(new Element<Integer, Integer>(50, 70)));

        //System.out.println(elementIntInt.lt(new Element<Integer, Integer>(150, 270)));
        //System.out.println(elementIntInt.gt(new Element<Double, Double>(50d, 70d)));
        System.out.println(elementIntInt.lt(new Element<Double, Double>(150d, 270d)));

        Element<Short, Double> elementDoubleDouble = new Element<>((short) 1, 70d);

        //elementIntInt.test(elementDoubleDouble);
    }
}
