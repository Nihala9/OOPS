import java.util.Scanner;

class Cpu {
    int price;

    class Processor {
        String no_of_cores, manufacturer;

        void display() {
            System.out.print("Processor Manufacturer: " + manufacturer + "\n");
            System.out.print("No. of cores of processor: " + no_of_cores + "\n");
        }
    }

    static class Ram {
        int memory;
        String manufacturer;

        void display() {
            System.out.print("RAM Memory: " + memory + "\n");
            System.out.print("RAM Manufacturer: " + manufacturer + "\n");
        }
    }

    void display() {
        System.out.print("Price: " + price + "\n");
    }
}

public class CpuInfo {
    public static void main(String args[]) {
        Cpu ncpu = new Cpu();
        Cpu.Processor processor = ncpu.new Processor(); 
        Cpu.Ram ram = new Cpu.Ram(); 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the processor manufacturer: ");
        processor.manufacturer = sc.next();

        System.out.print("Enter the no of cores of processor: ");
        processor.no_of_cores = sc.next();

        System.out.print("Enter the RAM memory size: ");
        ram.memory = sc.nextInt();

        System.out.print("Enter the RAM manufacturer: ");
        ram.manufacturer = sc.next();

        System.out.print("Enter the price: ");
        ncpu.price = sc.nextInt(); 

        System.out.println("\nInformation of processor and RAM: ");
        processor.display();
        ram.display();
        ncpu.display();
    }
}

