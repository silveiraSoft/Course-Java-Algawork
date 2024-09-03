import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        list.add(10); // Adds 10 to the list
        list.add(20);
        list.add(30);

        // Add an element at a specific index
        list.add(1, 15); // Adds 15 at index 1

        // Display the ArrayList
        System.out.println("ArrayList: " + list); // Output: [10, 15, 20, 30]

        // Get an element from the ArrayList
        int element = list.get(2); // Gets the element at index 2
        System.out.println("Element at index 2: " + element); // Output: 20

        // Remove an element from the ArrayList
        list.remove(1); // Removes the element at index 1

        // Display the ArrayList after removal
        System.out.println("ArrayList after removal: " + list); // Output: [10, 20, 30]

        // Check if the list contains a specific element
        boolean contains20 = list.contains(20);
        System.out.println("Contains 20? " + contains20); // Output: true

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of ArrayList: " + size); // Output: 3

        // Iterate through the ArrayList
        for (Integer num : list) {
            System.out.println("Element: " + num);
        }
        list.clear();
        System.out.println("ArrayList after clearing: " + list);
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Contains 20? " + list.contains(20));
        list.add(40);
        System.out.println("ArrayList: " + list);
        System.out.println("Index of 40: " + list.indexOf(40));
        System.out.println("Last index of 40: " + list.lastIndexOf(40));
        list.set(0, 50);
        System.out.println("ArrayList: " + list);
        System.out.println("Sublist: " + list.subList(0, 2));
        list.removeAll(list);
        System.out.println("ArrayList: " + list);
        System.out.println("Is the list empty? " + list.isEmpty());
        list.add(60);
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Contains 60? " + list.contains(60));
        System.out.println("Index of 60: " + list.indexOf(60));
        System.out.println("Last index of 60: " + list.lastIndexOf(60));
        list.addAll(Arrays.asList(70, 80, 90));
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Contains 80? " + list.contains(80));
        //#plese remove elementen in a possition of the list
        list.remove(1);
        System.out.println("ArrayList: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        
        List<Object> mixedList = new ArrayList<>();
        mixedList.add("Hello");
        mixedList.add(123);      // Integer
        mixedList.add(45.67);    // Double
        mixedList.add(true);     // Boolean

        for (Object item : mixedList) {
            System.out.println(item);
        }

        
    }
        
}
