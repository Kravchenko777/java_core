package lesson4.compare;

import java.util.*;

public class ExampleMain {

    public static void main(String[] args) {
        ArrayList<Deposit> depositArrayList = new ArrayList<>();
        depositArrayList.add(new Deposit("deposit1",100));
        depositArrayList.add(new Deposit("deposit2",2));
        depositArrayList.add(new Deposit("deposit3",777));
        depositArrayList.add(new Deposit("deposit4",88));

        Collections.sort(depositArrayList);


        Comparator<Deposit_> deposit_comparator = new Comparator<Deposit_>() {
            @Override
            public int compare(Deposit_ o1, Deposit_ o2) {
                if (o2.getValue() > o1.getValue()) {
                    return 1;
                }
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                }
                return 0;
            }
        };

        TreeSet<Deposit_> deposit_treeSet = new TreeSet<>(deposit_comparator);
        deposit_treeSet.add(new Deposit_("deposit1",100));
        deposit_treeSet.add(new Deposit_("deposit2",2));
        deposit_treeSet.add(new Deposit_("deposit3",777));
        deposit_treeSet.add(new Deposit_("deposit4",88));



        System.out.println(depositArrayList);
        System.out.println(deposit_treeSet);





    }




}
