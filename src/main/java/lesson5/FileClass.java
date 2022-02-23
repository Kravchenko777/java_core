package lesson5;

import java.io.File;

public class FileClass {

    public static void main(String[] args) {
        File fileCSV = new File("src/main/resources/test.csv");

        System.out.println(fileCSV.getName());
        System.out.println(fileCSV.exists());
        System.out.println(fileCSV.isDirectory());


        File directoryCSV = new File("src/main/resources");

        System.out.println(directoryCSV.getName());
        System.out.println(directoryCSV.exists());
        System.out.println(directoryCSV.isDirectory());

        for (String str: directoryCSV.list()){
            System.out.println("file name: " + str);
        }


    }
}
