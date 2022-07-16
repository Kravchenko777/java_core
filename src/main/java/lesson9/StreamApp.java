package lesson9;

import com.github.javafaker.Faker;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApp {
    static class Person {
        enum Position {
            ENGINEER, DIRECTOR, MANAGER;
        }
        private String name;
        private int age;
        private Position position;
        private Integer salary;
        private Boolean sex;
        private List<Work> works;
        public Person(String name, int age, Position position) {
            this.name = name;
            this.age = age;
            this.position = position;
        }

        public Person(String name, int age, Position position, Integer salary, Boolean sex, List<Work> works) {
            this.name = name;
            this.age = age;
            this.position = position;
            this.salary = salary;
            this.sex = sex;
            this.works = works;
        }

        static class Work{
            String label;
            Integer value;

            public Work(String label, Integer value) {
                this.label = label;
                this.value = value;
            }
        }
    }
    private static void streamSimpleTask() {
        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Bob1", 35, Person.Position.MANAGER),
                new Person("Bob2", 44, Person.Position.DIRECTOR),
                new Person("Bob3", 25, Person.Position.ENGINEER),
                new Person("Bob4", 42, Person.Position.ENGINEER),
                new Person("Bob5", 55, Person.Position.MANAGER),
                new Person("Bob6", 19, Person.Position.MANAGER),
                new Person("Bob7", 33, Person.Position.ENGINEER),
                new Person("Bob8", 37, Person.Position.MANAGER)
        ));
        List<String> engineersNames = persons.stream()
                .filter(person -> person.position == Person.Position.ENGINEER)
                .sorted((o1, o2) -> o1.age - o2.age)
                .map(person -> person.name)
                .collect(Collectors.toList());
        System.out.println(engineersNames);
    }

    private static List<Person> getList(){
        List<Person> persons = new ArrayList<>();
        Faker faker = new Faker();
        Random random = new Random(20);
        Random randomPosition = new Random();
        Random randomSalary = new Random();
        for(int i =0; i<100;i++){
            Random randomWork = new Random();
            Random randomValue = new Random();
            List<Person.Work> works = new ArrayList<>();
            for(int j=0;j<randomWork.nextInt(4); j++){
                works.add(new Person.Work(faker.company().name(),randomValue.nextInt(10)));
            }

            Person person = new Person(faker.name().fullName(),random.nextInt(65),
                   Person.Position.values()[randomPosition.nextInt(2)], randomSalary.nextInt(1000),
                    faker.bool().bool(), works);
            persons.add(person);
        }



        return persons;
    }

    public static void main(String[] args) {
    //    StreamApp.streamSimpleTask();

        List<Person> personList = getList();
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Long count = personList.stream().filter(person -> {
            return person.works.size() == 0;
        } ).count();
        System.out.println(count);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        final Integer summ = 0;
        personList.stream().filter(person -> person.works.size() == 2).forEach(person -> {
            System.out.println(person.name + " " + person.salary);
        });
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Long countSkip = personList.stream().filter(person -> {
            return person.works.size() == 0;
        } ).skip(10).count();
        System.out.println(countSkip);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Long countdistinct= personList.stream().filter(person -> {
            return person.works.size() == 0;
        } ).distinct().count();
        System.out.println(countdistinct);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        personList.stream().filter(person -> {
            return person.works.size() == 1;
        }).flatMap(person -> person.works.stream()).forEach(works -> {
            System.out.println(works.label + " " + works.value);
        });
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println(personList.stream().map(person -> person.age).distinct().count());
        personList.stream().map(person -> person.name.toUpperCase()).forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        personList.stream().map(person -> person.name).peek(System.out::println).count();
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        personList.stream().map(person -> person.name.toUpperCase()).limit(10).forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        personList.stream().map(person -> person.name.toUpperCase()).limit(10).sorted().forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Optional<Person> optionalPerson = personList.stream().filter(person -> {
            return person.works.size() == 0;
        } ).findFirst();
        System.out.println(optionalPerson.get().name);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Optional<Person> optionalPersonAny = personList.stream().filter(person -> {
            return person.works.size() == 5;
        } ).findAny();
        if(optionalPersonAny.isPresent()) System.out.println(optionalPersonAny);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Person optionalPersonAny2 = personList.stream().filter(person -> {
            return person.works.size() == 5;
        } ).findAny().orElse(new Person("Bob1", 35, Person.Position.MANAGER));
        System.out.println(optionalPersonAny2.name);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        List<Person> personList1 = personList.stream().filter(person -> {
            return person.works.size() == 0;
        } ).collect(Collectors.toList());
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println(personList.stream().filter(person -> {
            return person.works.size() == 0;
        } ).anyMatch(person -> person.works.size()==1));

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Optional<Person> optionalPerson1 = personList.stream().max((person1,person2) -> person1.age - person2.age);
        if(optionalPerson1.isPresent()) System.out.println(optionalPerson1.get().age);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        System.out.println(personList.stream().map(person -> person.age).reduce((age1,age2) -> age1 + age2));

        System.out.println(personList.stream().mapToInt(person -> person.age).sum());

        System.out.println(personList.stream().mapToInt(person -> person.age).average());

        Map<Boolean, List<Person>> booleanPersonMap = personList.stream().collect(
                Collectors.partitioningBy(person-> person.sex==true));

        Map<Integer, List<Person>> integerListMap = personList.stream().collect(
                Collectors.groupingBy(person-> person.age));

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
    }
}
