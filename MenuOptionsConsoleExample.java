import java.util.*;
import java.util.ArrayList;


class Product {
    private String sku;
    private String name;

    public Product(String sku, String name) {
        this.sku = sku;
        this.name = name;
    }

    public String getsku() {
        return sku;
    }

    public void setsku(String sku) {
        this.sku = sku;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [sku=" + sku + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sku == null) ? 0 : sku.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (sku == null) {
            if (other.sku != null)
                return false;
        } else if (!sku.equals(other.sku))
            return false;
        return true;
    }    
}

public class MenuOptionsConsoleExample {
    public static void main(String[] args) {
        // Create a new ArrayList
        
        Collection<Product> products = new ArrayList<>();

        System.out.println("####Product registration####");

        try(Scanner scanner = new Scanner(System.in)) {
            String continuar = "s";
            while("s".equalsIgnoreCase(continuar)) {
                System.out.println("Enter product sku:");
                String sku = scanner.next();
                System.out.println("Enter product name:");
                String productName = scanner.next();
                Product product = new Product(sku, productName);
                if(products.contains(product)){
                    System.out.println("Product already registered. Use other SKU!");
                } else {
                    products.add(product);
                    System.out.println("Product added.");
                }
                
                System.out.println("Do you want to continue? (s/n)");
                continuar = scanner.next();
            }

        }
        /* 
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter product name:");
                    String productName = scanner.next();
                    list.add(productName);
                    break;
                case 2:
                    System.out.println("Enter product name to remove:");
                    String removeProduct = scanner.next();
                    list.remove(removeProduct);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 3);
         */

        /* 
        Collection<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Iterate over the list using a for-each loop
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Remove an element from the list
        list.remove("Banana");

        // Iterate over the list again
        for (String fruit : list) {
            System.out.println(fruit);
        }
        */

    }
}
