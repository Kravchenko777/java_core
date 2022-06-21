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
        System.out.println("Ввод по символьно");
        System.out.print("Текст");
        do{
            c = (char) br.read();
            pw.print(c);
            pw.flush();
        }while (c !='q');

        String str;
        System.out.println("Ввод слова");
        BufferedReader brString = new BufferedReader(new InputStreamReader(System.in));
        do{
            str =  brString.readLine();
            pw.println(str);
        }while (!str.equals("exit"));


    }
}
