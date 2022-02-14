package lesson2;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        System.out.println(getValue().isPresent());
        if(getValue().isPresent()) getValue().get();
    }

    public static Optional<String> getValue(){
        String value = null;
        try {
            if (value.getBytes().length != 0) return Optional.of(value);
            else return Optional.of("123");

        } catch (NullPointerException e){
            return Optional.empty();
        }
    }
}
