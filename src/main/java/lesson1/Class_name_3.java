package lesson1;

import lesson1.interfaces.Interface_name;

import java.util.Objects;

public class Class_name_3 implements Interface_name {

    private String value_name_1;

    public String getValue_name_1() {
        return value_name_1;
    }

    public void setValue_name_1(String value_name_1) {
        this.value_name_1 = value_name_1;
    }

    @Override
    public void test() {
        System.out.println("Test");
    }

    @Override
    public Boolean test(Boolean value) {
        return value;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class_name_3 that = (Class_name_3) o;
        return Objects.equals(value_name_1, that.value_name_1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value_name_1);
    }
}
