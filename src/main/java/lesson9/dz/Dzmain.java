package lesson9.dz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Dzmain {

    public static void main(String[] args) {
        List<House> result = getListOfHouse(3,3);
        //1 задание
        result.stream().flatMap(house -> house.getRoomList().stream()).distinct().collect(Collectors.toList());
        result.stream().flatMap(house -> house.getRoomList().stream()).collect(Collectors.toSet());

        //2 задание
        result.stream().sorted((house1,house2) -> house1.getRoomList().size() - house2.getRoomList().size()).limit(3).collect(Collectors.toList());

        //3 задание
        Room paramRoom = new Room("room1");
        result.stream().filter(house -> house.getRoomList().contains(paramRoom)).collect(Collectors.toList());

        System.out.println();

    }

    private static List<House> getListOfHouse(int j, int m){
        ArrayList<House> result = new ArrayList<>();
        for (int i=0; i<j ;i++){
            ArrayList<Room> rooms = new ArrayList<>();
            for (int h=0; h<m ;h++){
                rooms.add(new Room("room"+h));
            }
            result.add(new House("house"+i, rooms));
        }
        return result;
    }
}
