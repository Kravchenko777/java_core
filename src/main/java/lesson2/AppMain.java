package lesson2;

public class AppMain {

    public static void main(String[] args) {
        //NullPointerException
        try {
            new MyTestClass().test("123");
        } catch (MyException e) {
            e.printStackTrace();
        }

//        String str = null;
//        str.length();


        //ArithmeticException
//        int a= 100;
//        int b=0;
//        a = a/b;
        //ArrayIndexOutOfBoundsException

/*        int[] myArray = new int[10];
        myArray[10] = 10;*/

        //ArrayStoreException

//        Object[] myArray = new Integer[10];
//        myArray[5] = "555";

        //NumberFormatException
     //   Integer integer = Integer.valueOf(new String("123ff132"));
        //ClassCastException


//        Object str = new String("ffff");
//        Integer integer3 = (Integer) str;

        //ClassNotFoundException
        try {
            Class.forName("myClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //
    }


}
