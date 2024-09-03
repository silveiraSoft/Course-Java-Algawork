class Person {
    private String name;
    private int age;

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

//create a class Student that extends Person



public class ForUse {
    public static void main(String[] args) {
        //#Create the code to generate 100 pesons with random name and age
        Person[][] people = new Person[100][];
        for (int i = 0; i < 100; i++) {
            String name = "Name" + i;
            int age = (int) (Math.random() * 10);
            people[i] = new Person[age];
            for (int j=0;j<people[i].length;j++) {
                people[i][j] = new Person(name, age);
            }
        }

        for(Person peoples[] : people) {
            for(Person person1 : peoples) {
                System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
            }
        }
    }
}
