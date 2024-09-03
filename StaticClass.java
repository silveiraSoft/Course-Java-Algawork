class OuterClass {
    static int outerStatic = 10;

    static class NestedStaticClass {
        void display() {
            System.out.println("Outer static variable: " + outerStatic);
        }
    }
}

class OuterClass1 {
    private int outerStatic = 20;

    class NestedStaticClass {
        void display() {
            System.out.println("Outer static variable: " + outerStatic);
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        OuterClass.NestedStaticClass nested = new OuterClass.NestedStaticClass();
        nested.display(); // Output: Outer static variable: 10
        OuterClass1.NestedStaticClass nested1 = new OuterClass1().new NestedStaticClass();
        nested1.display(); // Output: Outer static variable: 10
    }
}
