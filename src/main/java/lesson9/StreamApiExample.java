package lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamApiExample {

    static ArrayList<String> stringArrayList = new ArrayList<>();


    public static void main(String[] args) {
        createList();

       List<Integer> result = stringArrayList.stream()
               .filter((str)->{
                    return str.length() > 100;
                })
               .map((str)-> str.length())
               .collect(Collectors.toList());

    }

    public static void createList(){

        Random random = new Random();
        for(int i =0;i<10000;i++){
            stringArrayList.add(String.valueOf(random.nextInt(1000)));
        }

    }
}
