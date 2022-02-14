package lesson3.pair;

public class Pair <T,U>{

    private T valueT;
    private U valueU;

    public Pair(T valueT, U valueU){
        this.valueT = valueT;
        this.valueU = valueU;
    }

    public void summ(){
        System.out.println("key: " +valueT.toString() + " value: " + valueU.toString());
    }

    public T getValueT(){
        return valueT;
    }
}
