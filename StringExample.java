public class StringExample {
    
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a+b;
        System.out.println(c);
        System.out.println(String.format("%s - %s", a, b));
        
        Long l =4L;
        System.out.println(String.format("%s - %d", a, l));
            
    }
}
