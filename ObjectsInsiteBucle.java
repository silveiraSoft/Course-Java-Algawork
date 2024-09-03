class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }


}

public class ObjectsInsiteBucle {
    public static void main(String[] args) {
        
        //#Create the code to generate 100 pesons with random name and age
        Person[] people = new Person[100];
        Person person1 = new Person();
        for (int i = 0; i < 100; i++) {
            String name = "Name" + i;
            int age = (int) (Math.random() * 100);
            person1 = new Person(name, age);
            //person1.setAge(age);
            //person1.setName(name);

            //people[i] = new Person(name, age);
            people[i] = person1;
        }

        for(Person person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
        
    }
    
}
