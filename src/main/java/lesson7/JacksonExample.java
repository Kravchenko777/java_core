package lesson7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonExample {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<String> values = List.of("123","456","789");
        List<ExampleObject> exampleObjects = new ArrayList<>();
        ExampleObject exampleObject1 = new ExampleObject("name1","surname1",22,true,LocalDate.now().minusYears(22),values);
        ExampleObject exampleObject2 = new ExampleObject("name2","surname2",32,false,LocalDate.now().minusYears(10),values);
        ExampleObject exampleObject3 = new ExampleObject("name3","surname3",17,true,LocalDate.now().minusYears(4),values);


        exampleObjects.add(exampleObject1);
        exampleObjects.add(exampleObject2);
        exampleObjects.add(exampleObject3);
        Example example = new Example(exampleObjects);

        String json = mapper.writeValueAsString(example);
        System.out.println(json);
    }
}
