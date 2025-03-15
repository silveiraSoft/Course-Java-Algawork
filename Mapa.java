import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Mapa 
 * https://chatgpt.com/share/06b38fd8-6199-4be2-aeba-bb85d4c4f06b
 */

enum Day { MONDAY, TUESDAY, WEDNESDAY }





 public class Mapa {
    public static void main(String[] args) {
        //#create a map
        Map<String, Integer> ages = new HashMap<>();
        Map<String, Integer> ages2 = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        System.out.println(ages.get("Alice"));
        System.out.println(ages.get("Bob"));
        System.out.println(ages.get("Charlie"));
        System.out.println(ages.get("David"));
        System.out.println(ages.getOrDefault("David", 0));
        System.out.println(ages.containsKey("Alice"));
        System.out.println(ages.containsValue(25));
        System.out.println(ages.size());
        ages.remove("Alice");
        System.out.println(ages.size());
        ages.clear();
        System.out.println(ages.size());
        System.out.println(ages.isEmpty());
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        for (String key : ages.keySet()) {
            System.out.println(key + ": " + ages.get(key));
        }
        for (Integer value : ages.values()) {
            System.out.println(value);
        }
        for (HashMap.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        ages.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        System.out.println(ages);
        System.out.println(ages.getClass());
        System.out.println(ages.hashCode());
        System.out.println(ages.toString());
        System.out.println(ages.equals(ages2));
        System.out.println(ages.isEmpty());
        System.out.println(ages.size());
        System.out.println(ages.containsKey("Alice"));
        System.out.println(ages.containsValue(25));
        System.out.println(ages.get("Alice"));
        System.out.println(ages.getOrDefault("David", 0));
        System.out.println(ages.remove("Alice"));
        System.out.println(ages.size());
        System.out.println(ages.isEmpty());
        System.out.println(ages.keySet());
        System.out.println(ages.values());
        System.out.println(ages.entrySet());
        System.out.println(ages.getClass());
        System.out.println(ages.hashCode());

        /**
         * HashMap
Definition: HashMap is a hash table-based implementation of the Map interface. It allows null values and one null key.

Characteristics:

Order: It does not guarantee any specific order of the elements. The order of keys can change when the map is modified (e.g., when a new key is added).
Performance: Provides constant-time performance for basic operations (like get() and put()) assuming the hash function disperses elements properly across the buckets.
Thread-Safety: Not thread-safe. If multiple threads access a HashMap concurrently, and at least one of the threads modifies it, external synchronization is needed.
Usage: Suitable for scenarios where order is not important, and you need fast access to data using a key.
         */
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);
        hashMap.put("apple", 4);

        System.out.println("****** HashMap****");
        hashMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });


        Map<String, Object> data = new HashMap<>();
        data.put("name", "John");
        data.put("age", 30);
        data.put("salary", 50000.50);

        System.out.println("Name: " + data.get("name"));
        System.out.println("Age: " + data.get("age"));
        System.out.println("Salary: " + data.get("salary"));


        // Creating a map of key-value pairs
        Map<String, Integer> ages1 = new HashMap<>();
        ages1.put("Alice", 25);
        ages1.put("Bob", 30);
        ages1.put("Charlie", 35);

        // Iterating over the map
        for (Map.Entry<String, Integer> entry : ages1.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

         /**
     * LinkedHashMap
Definition: LinkedHashMap extends HashMap and maintains a doubly-linked list of its entries. This linked list defines the iteration order, which is typically the order in which keys were inserted.

Characteristics:

Order: Maintains insertion order or access order (order in which entries were last accessed, from least-recently accessed to most-recently). It can be configured using a constructor parameter.
Performance: Slightly slower than HashMap due to the added overhead of maintaining the linked list, but still provides O(1) time complexity for get() and put() operations.
Thread-Safety: Not thread-safe. Requires external synchronization for concurrent access.
Usage: Useful when you need to maintain a predictable iteration order. For example, when you want to cache items with a least-recently-used (LRU) eviction policy.
     */
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple", 1);
        linkedHashMap.put("banana", 2);
        linkedHashMap.put("cherry", 3);

        System.out.println("****** LinkedHashMap****");
        linkedHashMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        /**
     * TreeMap
Definition: TreeMap is a Red-Black tree-based implementation of the NavigableMap interface. It orders its entries based on the natural ordering of its keys or by a specified Comparator provided at map creation time.

Characteristics:

Order: Maintains keys in sorted (ascending) order. The sorting is based on natural ordering (using Comparable) or a custom comparator.
Performance: Provides guaranteed log(n) time cost for the containsKey(), get(), put(), and remove() operations, as it is implemented using a balanced tree.
Thread-Safety: Not thread-safe. Requires external synchronization for concurrent access.
Usage: Suitable when you need a map that is always sorted and need fast access to the smallest and largest elements.
     */
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("cherry", 3);
        System.out.println("****** TreeMap****");
        treeMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        /**
         * Hashtable
Definition: Hashtable is a legacy class, synchronized version of HashMap. It does not allow null keys or values.

Characteristics:

Order: Does not guarantee any order of the elements, similar to HashMap.
Performance: Slower compared to HashMap because all methods are synchronized to make it thread-safe.
Thread-Safety: Thread-safe. All operations are synchronized, which makes it slower for single-threaded environments but safe for multi-threaded use without external synchronization.
Usage: Suitable when a thread-safe implementation is needed, and using Java's Concurrent collections (ConcurrentHashMap) is not an option.
         */
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("apple", 1);
        hashtable.put("banana", 2);
        hashtable.put("cherry", 3);
        System.out.println("****** Hashtable****");
        hashtable.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        
        

        /**
         * EnumMap
Definition: EnumMap is a specialized map implementation for use with enum type keys. It is internally represented as an array, making it very fast.

Characteristics:

Order: Maintains the natural order of the keys (the order in which enum constants are declared).
Performance: Very efficient, especially when used with small, fixed number of keys. It provides constant-time performance for basic operations.
Thread-Safety: Not thread-safe. Requires external synchronization for concurrent access.
Usage: Suitable when the keys are of an enumerated type. It is more efficient than other map implementations in this scenario.
         */

        

        Map<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.MONDAY, "Work");
        enumMap.put(Day.TUESDAY, "Gym");
        System.out.println("****** EnumMap****");
        enumMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        /**
         * 
Map Type	Order	Performance (Average)	Thread-Safety	Null Key/Values	Use Case
HashMap	No	O(1)	No	Yes	General-purpose, fast access
LinkedHashMap	Yes	O(1)	No	Yes	Maintain insertion/access order
TreeMap	Yes	O(log n)	No	No (key only)	Sorted order, navigable
Hashtable	No	O(1)	Yes	No	Legacy, synchronized, no nulls

         */

        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 25);
        students.put("Arly", 52);
        students.put("Arly", 60);
        for(String key: students.keySet()){
            System.out.println(key + ":" + students.get(key));
        }

        
        Map<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("banana", 2);
        treeMap1.put("apple", 1);
        treeMap1.put("cherry", 3);
        System.out.println("****** TreeMap****");
        treeMap1.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });


        Map<Integer,String> treeMap2 = new TreeMap<>();
        treeMap2.put(2, "a");
        treeMap2.put(1, "b");
        treeMap2.put(3, "3");
        System.out.println("****** TreeMap****");
        treeMap2.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    
    }
  
}
