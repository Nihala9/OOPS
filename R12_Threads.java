import java.util.Scanner;

class Multiplication extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

class PrimeNumbers extends Thread {
    int n;

    PrimeNumbers(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("First " + n + " prime numbers:");
        int count = 0;
        int num = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}

public class Threads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        scanner.close();

        Multiplication tableThread = new Multiplication();
        PrimeNumbers primeThread = new PrimeNumbers(n);

        tableThread.start();
        primeThread.start();
    }
}
