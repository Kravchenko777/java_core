package lesson7;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* Презентация работы с библиотекой Jackson */
public class Demo {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = new Student("Ivan", 4.87);
        String jsonStudent = objectMapper.writeValueAsString(student);
        System.out.println(jsonStudent);
        simpleWriteJsonToFile();
        simpleWriteJsonAsString();
        simpleReadJsonFromString();
        try {
            readObjectWithUnknownProperties();
        } catch (Exception e){
            e.printStackTrace();
        }

        readValuesToList();
        navigatingByJsonAsNodeTree();
        useJsonCreatorAnnotation();
    }

    private static void simpleWriteJsonToFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("yellow", "Renault Logan");
        objectMapper.writeValue(new File("car.json"), car);
    }


    private static void simpleWriteJsonAsString() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        Car car = new Car("yellow", "Renault Logan");
        System.out.println(objectMapper.writeValueAsString(car));
    }

    private static void simpleReadJsonFromString() throws JsonProcessingException {
        String jsonString = "{ \"color\" : \"white\", \"type\" : \"Volga\" }";
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = objectMapper.readValue(jsonString, Car.class);
        System.out.println(car);
    }

    private static void readObjectWithUnknownProperties() throws com.fasterxml.jackson.core.JsonProcessingException {
        String jsonString = "{ \"color\" : \"white\", \"type\" : \"Volga\", \"year\" :\"1970\" }";
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = objectMapper.readValue(jsonString, Car.class);
        System.out.println(car);
    }

    private static void readValuesToList() throws com.fasterxml.jackson.core.JsonProcessingException {
        String carsList = "[{\"color\":\"red\", \"type\":\"BMW\"}," +
                " {\"color\":\"black\", \"type\":\"lada priora\"}]";
        ObjectMapper objectMapper = new ObjectMapper();
        List<Car> carList = objectMapper.readValue(carsList, new TypeReference<List<Car>>() {});
        System.out.println(carsList);
    }

    private static void navigatingByJsonAsNodeTree() throws JsonProcessingException {
        String jsonString = "{\"name\":\"Ivan\", \"education\": " +
                "{\"school\": \"School #52\", \"university\": " +
                "{\"degree\": \"master\", \"name\": \"NAME\"}}}";

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode universityName = objectMapper.readTree(jsonString).at("/education/university/name");
        System.out.println(universityName.asText());
    }

    private static void useJsonCreatorAnnotation() throws JsonProcessingException {
        String jsonPerson = "{ \"age\" : 30, \"firstName\" : \"Vsevolod\" }";
        ObjectMapper objectMapper = new ObjectMapper();
        Person p = objectMapper.readValue(jsonPerson, Person.class);
        System.out.println(p);
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "MyCar")
class Car {
    private String color;

    private String type;

//    @JsonProperty(value = "model")
//    private String type;

    @JsonIgnore
    private boolean isActive;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }

    // Показать студентам поведение при десериализации в класс без конструктора по умолчанию
    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

class Person {
    private int age;
    private String name;

    @JsonCreator
    public Person(@JsonProperty("age") int age, @JsonProperty("firstName") String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Student {
    private String name;
    private double averageMark;

    @JsonGetter("name")
    public String getStudentName() {
        return name;
    }

    @JsonSetter("name")
    public void setStudentName(String name) {
        this.name = name;
    }

    @JsonGetter("averageMark")
    public double getAvgMark() {
        return averageMark;
    }

    @JsonSetter("averageMark")
    public void setAvgMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Student(String name, double averageMark) {
        this.name = name;
        this.averageMark = averageMark;
    }

    public Student(){

    }
}
