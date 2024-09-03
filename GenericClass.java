class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("John", 30);
        System.out.println("Name: " + pair.getFirst() + ", Age: " + pair.getSecond());
    }
}
