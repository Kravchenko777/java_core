package lesson1.dz;

public class RunClass {

    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("Имя1", 100);
        person[1] = new Person("Имя2", 200);
        person[2] = new Person("Имя3", 300);
        person[3] = new Person("Имя4", 400);
        Group group = new Group("группа1", person);

        Restoran restoran = new Restoran(250,350,410);
        String result = restoran.doIt(group);
        System.out.println(result);

    }
}
