package lesson3.wildcard;

import java.io.Serializable;

public class Element<T extends Number, Y extends Number> {

        private T telement;
        private Y yelement;
        //static T value;

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

        public Boolean test(Element<T,Y> elementAnother){
            return true;
        }

        public Boolean lt(Element<? extends Double,? extends Double> elementAnother){
            return telement.doubleValue()<elementAnother.getTelement().doubleValue()
                    && yelement.doubleValue()<elementAnother.getYelement().doubleValue();
        }


}
