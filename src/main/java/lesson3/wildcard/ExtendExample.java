package lesson3.wildcard;

public class ExtendExample {

    public static class Element<T extends Number, Y extends Number> {

        private T telement;
        private Y yelement;

        public Element(T valueT, Y valueY) {
            this.telement = valueT;
            this.yelement = valueY;
        }

        public T getTelement() {
            return telement;
        }

        public void setTelement(T telement) {
            this.telement = telement;
        }

        public Y getYelement() {
            return yelement;
        }

        public void setYelement(Y yelement) {
            this.yelement = yelement;
        }

        public Double getSumm() {
            Double result = (Double) telement.doubleValue() + yelement.doubleValue();
            System.out.println(result);
            return result;
        }

        public Boolean gt(Element<T,Y> elementAnother){
            return telement.doubleValue()>elementAnother.getTelement().doubleValue()
                    && yelement.doubleValue()>elementAnother.getYelement().doubleValue();
        }

        public Boolean lt(Element<? extends Double,? extends Double> elementAnother){
            return telement.doubleValue()<elementAnother.getTelement().doubleValue()
                    && yelement.doubleValue()<elementAnother.getYelement().doubleValue();
        }


    }

    public static void main(String[] args) {
        Element elementIntInt = new Element<Integer, Integer>(100, 200);
        elementIntInt.getSumm();

        new Element<Long, Integer>(100L, 200).getSumm();

        new Element<Double, Long>(Double.valueOf("100"), 200l).getSumm();

        System.out.println(elementIntInt.gt(new Element<Integer, Integer>(50, 70)));

       // System.out.println(elementIntInt.lt(new Element<Integer, Integer>(150, 270)));

        System.out.println(elementIntInt.gt(new Element<Double, Double>(50d, 70d)));
        System.out.println(elementIntInt.lt(new Element<Double, Double>(150d, 270d)));
    }
}
