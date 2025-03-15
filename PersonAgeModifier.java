import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class PersonAgeModifier {
    public static void main(String[] args) {
        List<Person1> people = createPersonList(5);
        
        System.out.println("Original list:");
        people.forEach(System.out::println);
        
        // Using stream to modify ages
        people.stream()
              .forEach(person -> person.setAge(person.getAge() + 3));
        
        System.out.println("\nModified list (ages increased by 3):");
        people.forEach(System.out::println);
    }

    public static List<Person1> createPersonList(int count) {
        List<Person1> people = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            String name = "Person " + (i + 1);
            int age = random.nextInt(83) + 18; // Random age between 18 and 100
            people.add(new Person1(name, age));
        }

        return people;
    }
}

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{name='" + name + "', age=" + age + "}";
    }
}

