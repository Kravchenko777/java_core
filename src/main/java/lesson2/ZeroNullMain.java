package lesson2;

public class ZeroNullMain {

    public static void main(String[] args) {

        Integer result = 0;
        Integer a = 0;
        Integer b = null;

        try{
            result = b/a;
        } catch (NullPointerException | ArithmeticException ae){
            for(StackTraceElement stack : ae.getStackTrace()){
                System.out.println(stack.toString());
            }
            result = 100;
        }

        System.out.println(result);
    }

}
