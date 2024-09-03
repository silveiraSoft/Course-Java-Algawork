import java.util.*;

// Define the Student class
class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    // Override equals() to compare students by id and name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    // Override hashCode() to be consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    /*
    // Override equals() to compare students by id and name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
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
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        System.out.println("Set: " + set);

        set.remove("three");
        System.out.println("Set after removing 'three': " + set);

        System.out.println("Set contains 'two': " + set.contains("two"));

        System.out.println("Set size: " + set.size());

        set.clear();
        System.out.println("Set after clearing: " + set);

        /***************** */
         // Using HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate, will not be added

        System.out.println("HashSet: " + hashSet); // Output: [Banana, Apple, Orange] (order may vary)

        // Using LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Apple"); // Duplicate, will not be added

        System.out.println("LinkedHashSet: " + linkedHashSet); // Output: [Apple, Banana, Orange] (insertion order)

        // Using TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Apple"); // Duplicate, will not be added

        System.out.println("TreeSet: " + treeSet); // Output: [Apple, Banana, Orange] (sorted order)

        //#print the values of treeset using iterator
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
        /*Output:
        Apple
        Banana
        Orange
        */

        Collection<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(62);
        treeSet2.add(54);
        treeSet2.add(82);
        treeSet2.add(21); // Duplicate, will not be added
        treeSet2.add(21); // Duplicate, will not be added

        System.out.println("TreeSet: " + treeSet2); // Output: [Apple, Banana, Orange] (sorted order)
        
        Iterator<Integer> iterator = treeSet2.iterator();

        //#Print the values of treeSet2 using the iterator methods
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
         * Set of students
         */
        // Create a Set of Student objects
        Set<Student> studentSet = new HashSet<>();

        // Add students to the set
        studentSet.add(new Student(1, "Alice"));
        studentSet.add(new Student(2, "Bob"));
        studentSet.add(new Student(3, "Charlie"));
        studentSet.add(new Student(3, "Charlie"));
        studentSet.add(new Student(4, "Charlie"));

        // Print out the set of students
        for (Student student : studentSet) {
            System.out.println(student);
        }

        System.out.println("Set size: " + studentSet.size());
        System.out.println("Set contains Bob: " + studentSet.contains(new Student(2, "Bob")));
        studentSet.remove(new Student(3, "Charlie"));
        System.out.println("Set after removing Charlie: " + studentSet);
        studentSet.clear();
        System.out.println("Set after clearing: " + studentSet);
        System.out.println("Set is empty: " + studentSet.isEmpty());
        System.out.println("Set size: " + studentSet.size());
        studentSet.add(new Student(1, "Alice"));
        System.out.println("Set: " + studentSet);
        System.out.println("Set size: " + studentSet.size());
        System.out.println("Set contains Alice: " + studentSet.contains(new Student(1, "Alice")));
        System.out.println("Set size: " + studentSet.size());
        System.out.println("Set contains Bob: " + studentSet.contains(new Student(2, "Bob")));
        System.out.println("Set size: " + studentSet.size());
        System.out.println("Set contains Charlie: " + studentSet.contains(new Student(3, "Charlie")));
        System.out.println("Set size: " + studentSet.size());
        System.out.println("Set contains David: " + studentSet.contains(new Student(4, "David")));
        System.out.println("Set size: " + studentSet.size());
        

        

        // Creating a set of strings
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Iterating over the set
        for (String name : names) {
            System.out.println(name);
        }

        
    }
}
