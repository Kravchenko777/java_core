package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SystemClass {

    public static void main(String[] args) throws IOException {

        System.out.println("Вывод сообщения");
        System.err.println("Вывод ошибки");

        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        do{
            c = (char) br.read();
            pw.println(c);
        }while (c !='q');

        String str;
        BufferedReader brString = new BufferedReader(new InputStreamReader(System.in));
        do{
            str =  brString.readLine();
            pw.println(str);
        }while (!str.equals("exit"));


    }
}
