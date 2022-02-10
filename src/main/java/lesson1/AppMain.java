package lesson1;

import lesson1.enums.EnumValue;
import lesson1.enums.PrivateValue;
import lesson1.interfaces.Class_name_3_;
import lesson1.interfaces.Interface_name;

import java.util.Arrays;

public class AppMain {

    public static void main(String[] args) {
        //Демонстрация вызова конструкторов и статических блоков
        // Class_name_1 class_name_1 = new Class_name_2();

        //Демонстрация передачи параметров по значению
/*        Class_name_4 class_name_4 = new Class_name_4();
        int i = 0;
        System.out.println("до вызова: "+ class_name_4.toString());
        System.out.println(i +" из main до вызова метода");

        getNewValue(i,class_name_4);

        System.out.println(i +" из main после вызова метода");
        System.out.println("после вызова: "+ class_name_4.toString());
        getNewValue(class_name_4);
        System.out.println("после вызова 2: "+ class_name_4.toString());*/

        //Демонстрация сравнения для строк
/*        String str1="123";
        String str2 = "123";
        String str3 = new String("123");
        System.out.println("Сравнение строк ==" +(str1==str2) +" " +(str1==str3));
        System.out.println("Сравнение строк equals " +(str1.equals(str2)) +" " +(str1.equals(str3)));*/
        //Полиморфизм
//        Class_name_1 class_name_1 = new Class_name_1("str",0);
//        Class_name_1 class_name_1_ = new Class_name_2();
//        System.out.println("1: " + class_name_1.test());
//        System.out.println("2: " + class_name_1_.test());

        //интерфейсы
/*                Interface_name interface_name = new Class_name_3();
        Interface_name interface_name_ = new Class_name_3_();
        interface_name.test();
        interface_name_.test();*/

        //перечисления
/*        PrivateValue privateValue = PrivateValue.FRIDAY;
        System.out.println(privateValue.getValue());

        switch (EnumValue.THURSDAY) {
            case FRIDAY:
                System.out.println("Результат 1");
                break;
            case MONDAY:
                System.out.println("Результат 2");
                break;

            default:
                System.out.println("Нет результата");
        }

                EnumValue sunday = EnumValue.valueOf("SUNDAY");
                System.out.println(sunday.getTitle());

                System.out.println(Arrays.toString(EnumValue.values()));*/



    }

    public static void getNewValue(int i,Class_name_4 class_name){
        i=i+10;
        System.out.println(i +" из метода");
        class_name.setValue1("новое значение");
    }

    public static void getNewValue(Class_name_4 class_name) {
        class_name = new Class_name_4();
        System.out.println("вызов 2: " + class_name.toString());
    }
}
