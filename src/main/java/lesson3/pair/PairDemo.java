package lesson3.pair;

public class PairDemo {

    public static void main(String[] args) {
        new PairString("key", "value").summ();

        Pair<String,String> strPair = new Pair("key", "value");
        strPair.summ();

        new PairInteger(100, 200).summ();

        new Pair(100, 200).summ();

        Pair<String, Integer> pair = new Pair<>("123",123);
        pair.setValueT("555");
        pair.test(new Pair<String,Integer>("",123));


        new Pair<PairString,PairInteger>(new PairString("1","2"), new PairInteger(1,2)).summ();


    }
}
