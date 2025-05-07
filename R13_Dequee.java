import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Dequee {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Display elements in deque");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter element to add to the back: ");
                    String backElement = scanner.nextLine();
                    deque.addLast(backElement);
                    break;
                case "2":
                    if (!deque.isEmpty()) {
                        String removedFront = deque.removeFirst();
                        System.out.println("Removed from front: " + removedFront);
                    } else {
                        System.out.println("Deque is empty, nothing to remove from front.");
                    }
                    break;
                case "3":
                    System.out.println("Elements in deque: " + deque);
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }
}
