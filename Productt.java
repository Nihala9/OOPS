import java.util.Scanner;

class Product {
    int pcode, price;
    String pname;

    Product(int code, String name, int pr) {
        pcode = code;
        pname = name;
        price = pr;
    }
}

class Productt {
    public static void main(String args[]) {
        Product product1 = new Product(101, "Crayons", 45);

        int pcode = 1002;
        String pname = "Sketch pen";
        int price = 30;
        Product product2 = new Product(pcode, pname, price);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product code: ");
        pcode = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter product name: ");
        pname = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextInt();
        Product product3 = new Product(pcode, pname, price);

        System.out.println("\nProduct 1:");
        System.out.println("Product Code: " + product1.pcode);
        System.out.println("Product Name: " + product1.pname);
        System.out.println("Price: " + product1.price);

        System.out.println("\nProduct 2:");
        System.out.println("Product Code: " + product2.pcode);
        System.out.println("Product Name: " + product2.pname);
        System.out.println("Price: " + product2.price);

        System.out.println("\nProduct 3:");
        System.out.println("Product Code: " + product3.pcode);
        System.out.println("Product Name: " + product3.pname);
        System.out.println("Price: " + product3.price);

        System.out.println("\nProduct with the lowest price is:");
        if (product1.price < product2.price && product1.price < product3.price) {
            System.out.println("\nProduct Code: " + product1.pcode);
            System.out.println("Product Name: " + product1.pname);
            System.out.println("Price: " + product1.price);
        } else if (product2.price < product1.price && product2.price < product3.price) {
            System.out.println("\nProduct Code: " + product2.pcode);
            System.out.println("Product Name: " + product2.pname);
            System.out.println("Price: " + product2.price);
        } else {
            System.out.println("\nProduct Code: " + product3.pcode);
            System.out.println("Product Name: " + product3.pname);
            System.out.println("Price: " + product3.price);
        }
    }
}

