import java.util.Scanner;

class AreaCalculator {

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();

        System.out.println("Choose shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle = " + obj.area(radius));
                break;

            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double breadth = sc.nextDouble();
                System.out.println("Area of Rectangle = " + obj.area(length, breadth));
                break;

            case 3:
                System.out.print("Enter base of triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = sc.nextDouble();
                System.out.println("Area of Triangle = " + obj.area(base, height, true));
                break;

            case 4:
                System.out.print("Enter side of square: ");
                int side = sc.nextInt();
                System.out.println("Area of Square = " + obj.area(side));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

