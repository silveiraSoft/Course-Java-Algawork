import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        System.out.println(nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        for(int n: nums) {
            System.out.println(n);
        };

        nums.forEach(n -> System.out.println(n));

        Stream<Integer> stream = nums.stream();
        stream.forEach(n -> System.out.println(n));

        nums.stream().forEach(n -> System.out.println(n));
        nums.stream().forEach(System.out::println);
        nums.parallelStream().forEach(System.out::println);
        nums.parallelStream().forEachOrdered(System.out::println);
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        nums.stream().filter(n -> n % 2 == 0).distinct().forEach(System.out::println);
        nums.stream().filter(n -> n % 2 == 0).distinct().sorted().forEach(System.out::println);
        double average = nums.stream().filter(n -> n % 2 == 0).distinct().sorted().mapToInt(n -> n).average().getAsDouble();
        System.out.println("Average: " + average);
        int sum = nums.stream().filter(n -> n % 2 == 0).distinct().sorted().mapToInt(n -> n).sum();
        System.out.println("Sum: " + sum);
        int min = nums.stream().filter(n -> n % 2 == 0).distinct().sorted().mapToInt(n -> n).min().getAsInt();
        System.out.println("Min: " + min);
        int max = nums.stream().filter(n -> n % 2 == 0).distinct().sorted().mapToInt(n -> n).max().getAsInt();
        System.out.println("Max: " + max);
        long count = nums.stream().filter(n -> n % 2 == 0).distinct().sorted().mapToInt(n -> n).count();
        System.out.println("Count: " + count);
        boolean anyMatch = nums.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Any match: " + anyMatch);
        boolean allMatch = nums.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All match: " + allMatch);
        boolean noneMatch = nums.stream().noneMatch(n -> n % 2 == 0);
        System.out.println("None match: " + noneMatch);
        nums.stream().forEach(System.out::println);
        
        int result = nums.stream().reduce(0, (total, e) -> total + e);
        System.out.println("Result: " + result);
        int result2 = nums.stream().reduce(0, Integer::sum);
        System.out.println("Result2: " + result2);
        int result3 = nums.stream().reduce(0, (total, e) -> total + e * e);
        System.out.println("Result3: " + result3);
        int result4 = nums.stream().reduce(0, (total, e) -> total + e * e, Integer::sum);
        System.out.println("Result4: " + result4);
        int result5 = nums.parallelStream().reduce(0, (total, e) -> total + e * e, Integer::sum);
        System.out.println("Result5: " + result5);
        int result6 = nums.parallelStream().reduce(0, (total, e) -> total + e * e, (total1, total2) -> total1 + total2);
        System.out.println("Result6: " + result6);
        //int result7 = nums.parallelStream().reduce(0, (total, e) -> total + e * e, (total1, total2) -> total1 + total2, Integer::sum);
        //System.out.println("Result7: " + result7);
        //int result8 = nums.parallelStream().reduce(0, (total, e) -> total + e * e, (total1, total2) -> total1 + total2, (total1, total2) -> total1 + total2);
        //System.out.println("Result8: " + result8);

        int result10 = nums.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n*2).reduce(0, (c,e)-> c+e);
        System.out.println("Result10: " + result10);




    }
    
}
