package lesson1.enums;

public class Class_name_6 {

    private String str1 ="123";
    public String str2="456";
    public static String str3="789";

    private class inner_class_name{
        private void test(){
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            testClass();
        }
    }

    private static class inner_class_name2{
        private void test(){
            //System.out.println(str1);
            //System.out.println(str2);
            System.out.println(str3);
            testClassStatic();
        }
    }

    public void testClass(){

    }

    public static void testClassStatic(){

    }
}
