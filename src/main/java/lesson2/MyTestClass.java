package lesson2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class MyTestClass {

    public void test(String str) throws MyException {
        if(str==null) throw new MyException("Что то пошло не так");
        //
    }

    public void test2() {
        throw new NullPointerException();
    }

    public void test3() throws Exception {
        throw new Exception("А почему бы и нет");
    }

    public void test4() throws Exception {
        try {
            System.exit(0);
        } finally {
            System.out.println("Попадем сюда?");
        }
    }

    public void test5() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(100);
        } finally {
            byteArrayOutputStream.close();
        }


        try(ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream()){
            byteArrayOutputStream2.write(100);
        }



    }


}
