import java.util.*;

class Bubblesort {
    public static <T extends Comparable<T>> T[] bsort(T arr[], int limit) {
        int i, j;
        for (i = 0; i < limit - 1; i++) {
            for (j = 0; j < limit - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

public class Bsort {
    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter number of elements:");
        n = sc.nextInt(); 

        String s[] = new String[n];
        System.out.println("\nEnter elements:");
        for (i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        Bubblesort.bsort(s, n);

        System.out.println("Elements after sorting:");
        for (i = 0; i < n; i++) { 
            System.out.println(s[i]);
        }

        sc.close(); 
    }
}
