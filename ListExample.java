import java.util.*;


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
    
}
