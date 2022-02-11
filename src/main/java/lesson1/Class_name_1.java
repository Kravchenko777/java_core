package lesson1;

import java.time.LocalDate;

public class Class_name_1 {

    private String value_name_1;
    private Integer value_name_2;
    public LocalDate value_name_3;
    public static String value_name_4 = "null_value";


    static {
        System.out.println("Static block class1");
        System.out.println("value_name_4: "+ value_name_4);
        value_name_4 = "Class_name_1_class_name";
        System.out.println("value_name_4: "+ value_name_4);
    }

    public Class_name_1(String value_name_1, Integer value_name_2){
        System.out.println("Constructor block class1");
        this.value_name_1 = value_name_1;
        this.value_name_2 = value_name_2;
        this.value_name_3 = LocalDate.now();
    }

    public Class_name_1(){}

    public String getValue_name_1() {
        return value_name_1;
    }



    public Integer getValue_name_2() {
        return value_name_2;
    }

    public void setValue_name_2(Integer value_name_2) {
        this.value_name_2 = value_name_2;
    }

    public LocalDate getValue_name_3() {
        return value_name_3;
    }

    public void setValue_name_3(LocalDate value_name_3) {
        this.value_name_3 = value_name_3;
    }


    public String test(){
        return this.toString();
    }

}
