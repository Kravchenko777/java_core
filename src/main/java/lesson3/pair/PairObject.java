package lesson3.pair;

public class PairObject {

    private Object valueT;
    private Object valueU;

    public PairObject(Object valueT, Object valueU){
        this.valueT = valueT;
        this.valueU = valueU;
    }

    public void summ(){
        System.out.println("key: " +valueT.toString() + " value: " + valueU.toString());
    }

    public Integer getSumm(){
        return (Integer)valueT + (Integer)valueU;
    }

    public String getSummString(){
        return (String)valueT + (String)valueU;
    }

}
