import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ObjectClass {
    public static void main(String[] args) {
        Object[] data = new Object[3];
        data[0] = "John";  // String
        data[1] = 30;      // Integer (auto-boxed)
        data[2] = 50000.50; // Double (auto-boxed)

        String name = (String) data[0];
        int age = (int) data[1];
        double salary = (double) data[2];

        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);

        Map<String, Object> data1 = new HashMap<>();
        data1.put("name", "John");
        data1.put("age", 30);
        data1.put("salary", 50000.50);

        System.out.println("Name: " + data1.get("name"));
        System.out.println("Age: " + data1.get("age"));
        System.out.println("Salary: " + data1.get("salary"));

        List<Object> mixedList = new ArrayList<>();
        mixedList.add("Hello");
        mixedList.add(123);      // Integer
        mixedList.add(45.67);    // Double
        mixedList.add(true);     // Boolean

        for (Object item : mixedList) {
            System.out.println(item);
        }

        printObject("Hello, World!");
        printObject(42);
        printObject(3.14159);

        Object myObject = "This is a String";

        if (myObject instanceof String) {
            String myString = (String) myObject;
            System.out.println("String length: " + myString.length());
        }


        log("This is a string");
        log(100);
        log(99.99);
        
    } 

    static void printObject(Object obj) {
        System.out.println("Object value: " + obj);
    }

    public static void log(Object data) {
        System.out.println("Logging: " + data.toString());
    }
}
