package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Example {

    List<ExampleObject> exampleObjects = new ArrayList<>();

    public Example(List<ExampleObject> exampleObjects) {
        this.exampleObjects = exampleObjects;
    }

    public List<ExampleObject> getExampleObjects() {
        return exampleObjects;
    }

    public void setExampleObjects(List<ExampleObject> exampleObjects) {
        this.exampleObjects = exampleObjects;
    }
}
