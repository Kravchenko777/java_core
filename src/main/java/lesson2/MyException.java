package lesson2;

public class MyException extends Exception{

    public MyException(String error){
        super(error);
    }

    @Override
    public String toString() {
        return "MyException{}";
    }
}
