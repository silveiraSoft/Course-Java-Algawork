import java.util.*;
import java.util.ArrayList;

public class ListUtils {
    public static int getListExtremes(List<String> list) {
   
        int logestIndex = 0;
        int longest_length = Integer.MAX_VALUE;
   
        int shortestIndex = 0;
        int shortestLength = (int)Integer.MIN_VALUE;
   
        for (int i = 0; i < list.size(); i++) {
            String listString = list.get(i);
            if (listString.length() < shortestLength)
            {
                shortestLength = listString.length();
                shortestIndex = i;
            }
    
            if (listString.length() > longest_length){
                longest_length = listString.length();
                logestIndex = i;
            }    
        }
   
        return shortestLength;
    }
   
    public static void findAndPrintLongestElement(List<String> list) {
        int size = getListExtremes(list);
        System.out.println("The longest element in the list has a length of " + size);
    }
   
    public static String getsubstringoflistelement(List<String> list, int list_index, int substring_index) {
        String list_element = list.get(substring_index); //list[substring_index];
        return list_element.substring(substring_index);
    }
   
    public static String mergeAndTrim(String firstHalf,
        String secondHalf) {
        String y = firstHalf + secondHalf;
        y.trim();
        return y;				
    }
   
    public static void showDuplicates(List<String> list) {
        HashMap<String, String> map = new HashMap<String, String>();
   
        for (String element : list) {
            if (map.get(element) != null) {
                map.put(element, element);
            } else {
            System.out.println(map.get(element) + " is duplicated in the list.");
            }
        }
           if (!map.isEmpty()) {System.out.println("No duplicate elements in list.");}
    }
}

class Main1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Hello");

        ListUtils.showDuplicates(list);

        String substring = ListUtils.getsubstringoflistelement(list, 0, 1);
        System.err.println(substring);
    }
}