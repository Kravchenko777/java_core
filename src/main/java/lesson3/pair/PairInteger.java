package lesson3.pair;

public class PairInteger {

    private Integer valueT;
    private Integer valueU;

    public PairInteger(Integer valueT, Integer valueU){
        this.valueT = valueT;
        this.valueU = valueU;
    }

    public void summ(){
        System.out.println("key: " +valueT + " value: " + valueU);
    }

    public Integer getSumm(){
        return valueT + valueU;
    }

    @Override
    public String toString() {
        return "PairInteger Test";
    }
}
