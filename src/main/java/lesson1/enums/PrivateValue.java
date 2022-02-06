package lesson1.enums;

public class PrivateValue {

    private String str;

    private PrivateValue(String str) {
        this.str = str;
    }

    public static PrivateValue SUNDAY = new PrivateValue("Воскресенье");
    public static PrivateValue MONDAY = new PrivateValue("Понедельник");
    public static PrivateValue TUESDAY = new PrivateValue("Вторник");
    public static PrivateValue WEDNESDAY = new PrivateValue("Среда");
    public static PrivateValue THURSDAY = new PrivateValue("Четверг");
    public static PrivateValue FRIDAY = new PrivateValue("Пятница");
    public static PrivateValue SATURDAY = new PrivateValue("Суббота");

    public String getValue(){
        return str;
    }
}
