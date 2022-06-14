package lesson3.pair;

public class Pair <T,U>{

    private T valueT;
    private U valueU;

    public Pair(T valueT, U valueU){
        this.valueT = valueT;
        this.valueU = valueU;
    }

    public void test(){
        System.out.println("Что то");
    }

    public void summ(){
        System.out.println("key: " +valueT.toString() + " value: " + valueU.toString());
    }

    public T getValueT(){
        return valueT;
    }

    public void setValueT(T valueT) {
        this.valueT = valueT;
    }

    public U getValueU() {
        return valueU;
    }

    public void setValueU(U valueU) {
        this.valueU = valueU;
    }

    public Boolean test(Pair<T,U> pair){
        return true;
    }
}
