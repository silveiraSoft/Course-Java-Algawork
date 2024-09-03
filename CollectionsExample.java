import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;


// Define the Student1 class
class Student1 implements Comparable<Student1>
{
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    // Override equals() to compare student1s by id and name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return id == student1.id;
    }

    // Override hashCode() to be consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    /*
    // Override equals() to compare student1s by id and name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return id == student1.id && Objects.equals(name, student1.name);
    }

    // Override hashCode() to be consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    */

    // Override toString() for easy printing
    @Override
    public String toString() {
        return "Student1{id=" + id + ", name=" + name + ", age=" + age + "}";
    }

    

    public int compareTo(Student1 o) {
        //return Integer.compare(this.age, o.age);
        return (this.age > o.age)?1:-1;
    }
        
    
}


public class CollectionsExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(36);
        numbers.add(27);
        numbers.add(12);

        // Iterating over the list
        for (int num : numbers) {
            System.out.println(num);
        }

        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);


         
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        
        
        //Comparator comparator = (o1, o2) -> o2.compareTo(o1);

        Collections.sort(numbers, comparator);
        System.out.println("Reverse sorted list: " + numbers);

        Comparator<Integer> comparator2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10)
                    return 1;
                return -1;    
            }
        };

        Collections.sort(numbers, comparator2);
        System.out.println("Sorted list by last digit: " + numbers);

       
         
        // Add student1s to List
        List<Student1> student1s = new ArrayList<>();
        
        student1s.add(new Student1(1, "Alice", 21)); 
        student1s.add(new Student1(2, "Bob", 12));
        student1s.add(new Student1(3, "Charlie", 18));
        student1s.add(new Student1(4, "Charlie", 20));
        student1s.add(new Student1(6, "Charlie", 15));
        
        // Print out the set of student1s
        for (Student1 student1 : student1s) {
            System.out.println(student1);
        }

        
        Comparator<Student1> comparator3 = new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                if(o1.getAge() > o2.getAge())
                    return 1;
                return -1;    
            }
        };
        

        Comparator<Student1> comparator4 = (o1, o2) -> 
            o1.getAge() > o2.getAge()?1:-1;

        Collections.sort(student1s, comparator3);
        System.out.println("Sorted student1 by age: " + student1s);

        Collections.sort(student1s);
        System.out.println("Sorted student1 by age less use comparator and implementing intefase Comparable in class Student1 and the methods compareTo: " + student1s);    
        
        Collections.sort(student1s, comparator3);
        System.out.println("Sorted student1 by age: " + student1s);

        System.out.println("Sorted student1 using comparator and lanbda expresion: " + student1s);



        /* 

        System.out.println("Size of the list: " + numbers.size());
        System.out.println("Is the list empty? " + numbers.isEmpty());
        System.out.println("Does the list contain 37? " + numbers.contains(37));
        System.out.println("Index of 12: " + numbers.indexOf(12));
        System.out.println("Last index of 12: " + numbers.lastIndexOf(12));
        System.out.println("Get element at index 1: " + numbers.get(1));
        System.out.println("Remove element at index 1: " + numbers.remove(1));
        System.out.println("List after removal: " + numbers);
        numbers.clear();
        System.out.println("List after clearing: " + numbers);
        System.out.println("Is the list empty? " + numbers.isEmpty());
        System.out.println("Size of the list: " + numbers.size());
        */
    
    }
}
