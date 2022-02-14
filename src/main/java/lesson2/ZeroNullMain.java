package lesson2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ZeroNullMain {

    public static void main(String[] args) throws IOException {

        Integer result = 0;
        Integer a = 100;
        Integer b = 1000;

        try{
            result = b/a;
        } catch (NullPointerException | ArithmeticException ae){
            ae.printStackTrace();
            for(StackTraceElement stack : ae.getStackTrace()){
                System.out.println(stack.toString());
            }
            result = 100;
        }

        System.out.println(result);

        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader("12312323"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

        try(BufferedReader br1 = new BufferedReader(new FileReader("12312323"))){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

}
