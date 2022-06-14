package lesson3;

import java.util.ArrayList;

public class TestCollection {

    public static void main(String[] args) {

        String[] strArray = {"1","2","3","4"};

        for (String str:strArray){
            System.out.println("strArray value: " + str);
        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");

        int i = 0;
        for(String str:arrayList){
            if(i==2) break;
            System.out.println("arrayList value: " + str);
            i = i+1;
        }



    }
}
