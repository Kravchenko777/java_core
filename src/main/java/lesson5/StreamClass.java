package lesson5;

import java.io.*;
import java.util.Arrays;

public class StreamClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        };

        byte[] bytes = new String("Моя строка в байтах").getBytes();

        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
           /* byteArrayInputStream.read();
            byteArrayInputStream.read(new byte[10]);

            byte[] bytesAll = byteArrayInputStream.readAllBytes();
            byteArrayInputStream.read(new byte[10],1,5);*/

/*            byteArrayOutputStream.write(new byte[10]);
            byteArrayOutputStream.write(100);
            byteArrayOutputStream.write(new byte[10],5,3);
            byteArrayOutputStream.toByteArray();*/

            int x;
            while ((x = byteArrayInputStream.read()) != -1) {
                System.out.print(x + " ");
                byteArrayOutputStream.write(x);
            }

            byte[] arr = byteArrayOutputStream.toByteArray();


        }
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src/main/resources/demo.txt"));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src/main/resources/demo.txt"),8192);){

            for (int i = 0; i < 10000; i++) {
                bufferedOutputStream.write(i);
            }
            int x;
            while ((x = bufferedInputStream.read()) != -1) {
                System.out.print((char)x);
            }
        }
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/main/resources/demo2.txt"));
             DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/main/resources/demo2.txt"))){
            dataOutputStream.writeInt(128);
            dataOutputStream.writeLong(128L);
            dataOutputStream.writeUTF("строка");
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readUTF());
        };

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        byte[] bytesObject = null;
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
             ){

            RawClass rawClass = new RawClass("Строка", 100,500, true);
            objectOutputStream.writeObject(rawClass);
            bytesObject = byteArrayOutputStream.toByteArray();
            System.out.println("До сериализации: " + rawClass);
            System.out.println("После сериализации: " + Arrays.toString(bytesObject));

            try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytesObject);
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
                RawClass readObject = (RawClass) objectInputStream.readObject();
                System.out.println("Востановление: " + readObject);
            }

        };



        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        try (SequenceInputStream sequenceInputStream = new SequenceInputStream(new FileInputStream("src/main/resources/test.csv"),
                new FileInputStream("src/main/resources/test2.csv"));
             FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/demo3.txt")) {
            int x;
            while ((x = sequenceInputStream.read()) != -1) {
                fileOutputStream.write(x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }


}
