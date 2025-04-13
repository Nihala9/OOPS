import java.util.Scanner; 

class LinearSearch {  
    public static void main(String args[]) {  
        int size, searchElement, i;
        boolean found = false;  

        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter the number of elements in the array:");
        size = sc.nextInt();

        int[] arr = new int[size];  

        System.out.println("Enter the elements of the array:");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();  
        }

        System.out.println("Enter the element to be searched:");
        searchElement = sc.nextInt();

        for (i = 0; i < size; i++) {
            if (arr[i] == searchElement) {  
                found = true;  
                break;  
            }
        }

        if (found) {
            System.out.println("Element is found");
        } else {
            System.out.println("Element is not found");
        }

        sc.close();  
    }
}

