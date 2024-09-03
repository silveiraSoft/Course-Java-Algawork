public class ChartExample {
    
    //#public Static String reverse
    public static String reverse(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }

    public static String reverse2(String string) {
        char[] sb = string.toCharArray();
        //#implement reverse algorithms and save the result in the variable sb
        int left = 0, right = sb.length - 1;
        while (left < right) {
            char temp = sb[left];
            sb[left] = sb[right];
            sb[right] = temp;
            left++;
            right--;
        }
        
        return new String(sb);
    }
    
    public static void main(String[] args) {
        String string = "Hello, World!";
        System.out.println(reverse(string)); 

        System.out.println(reverse(string)); 
        
    }
}
