package lesson5;

import java.io.*;

public class FileClass {

    public static void main(String[] args) throws IOException {
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
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        for (String str: directoryCSV.list((file,name)->{
            return name.contains("test");
        })
        ){
            System.out.println("file name: " + str);
        }


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        FileInputStream fi = null;
        try {
            fi = new FileInputStream(fileCSV);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fi.close();
        }


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        int i;
        File resultCSV = new File("src/main/resources/result.csv");
        FileInputStream fileInputStream = new FileInputStream(fileCSV);
        try (fileInputStream;
             FileOutputStream fileOutputStream = new FileOutputStream(resultCSV);){

            do {
                i = fileInputStream.read();
                System.out.println((char) i);
                fileOutputStream.write(i);
            } while (i!=-1);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
