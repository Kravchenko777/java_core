package lesson1;

public class Class_name_2 extends Class_name_1 {

    static {
        System.out.println("Static block class2");
    }

    public Class_name_2(){
        super("test1",100);
        System.out.println("Constructor block class2");

    }

    public Class_name_2(String str){

    }

    @Override
    public String test(){
        return "Другое поведение " + super.test();
    }
}
