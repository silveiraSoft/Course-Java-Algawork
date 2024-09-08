import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class ListExample {

    public static void main(String[] args) {  
        List<Integer> nums = Arrays.asList(4,5,7,2);
        List<String> names = Arrays.asList("John", "Jane", "Bob");
        List<Double> salaries = Arrays.asList(5000.0, 6000.0, 7000.0);
        System.out.println(nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        for(int n: nums) {
            System.out.println(n);
        };

        nums.forEach(n -> System.out.println(n));
         
    }

    List list1 = Arrays.asList(4, 5, 7, 2);
    List list2 = Arrays.asList("John", "Jane", "Bob");
    List list3 = Arrays.asList(5000.0, 6000.0, 7000.0);
    List<Object> list5 = new ArrayList<Object>();
    List<Object> list4 = Arrays.asList(list1, list2, list3);
    List<Object> list6 = Arrays.asList(list1, list2, list3, list5);
    List<Object> list7 = new ArrayList<Object>();
    //Iterate through the lists and print their elements.
    public static void printList(List<Object> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void printListStream(List<Object> list) {
        list.stream().forEach(System.out::println);
    }

    
    public static List<Object> convertStreamToList(List<Object> list) {
        return list.stream().collect(Collectors.toList());
    }

    public static List<Object> convertStreamToList(Object[] array) {
        return Arrays.stream(array).collect(Collectors.toList());
    }
    //create a funtion that insert all object element of array into a list using addAll
    public static List<Object> insertAll(Object[] array) {
        List<Object> list = new ArrayList<Object>();
        list.addAll(Arrays.asList(array));
        return list;
    }   
}
