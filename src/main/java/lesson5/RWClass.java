package lesson5;

import java.io.*;

public class RWClass {

    public static void main(String[] args) {

        Reader reader = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {

            }
        };

        Writer writer = new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {

            }

            @Override
            public void flush() throws IOException {

            }

            @Override
            public void close() throws IOException {

            }
        };


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/demo4.txt"))) {
            for (int i = 0; i < 20; i++) {
                bufferedWriter.write("It is my String № " + i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/demo4.txt"))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("src/main/resources/demo4.txt", "r")) {
            for(int i=10;i<50;i++){
                randomAccessFile.seek(i);
                System.out.print((char) randomAccessFile.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

