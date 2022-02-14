package lesson2;

import java.util.logging.Logger;

public class AppLogger {

    private static Logger logger = Logger.getLogger("AppLogger");

    public static void main(String[] args) throws MyException {
        MyTestClass myTestClass = new MyTestClass();
        myTestClass.test(null);

        try {
            myTestClass.test2();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e){
            logger.severe("Сообщение "+e.toString());
        }


        try {
            myTestClass.test3();
        } catch (Exception e) {
            logger.severe("Сообщение "+e.getMessage());
        } finally {
            System.out.println("Будет выполненно все равно");
        }
    }

}
