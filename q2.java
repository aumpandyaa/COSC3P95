package q2;

import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        // creates an object
        Sort s = new Sort();

        GenerateArray g = new GenerateArray();
        // Random number A that will be the size of array
        Random A = new Random();

        // generates 100 test cases
        for (int i = 0; i < 10; i++) {
            System.out.println("--------------------------------------------");
            System.out.println("Test Case: " + (i + 1));
            // generates random number between 0-25
            int n = A.nextInt(25);
            System.out.println("Number of elements in the array: " + n);
            // used to store the generated and sorted array
            int[] a = new int[n];
            int[] b = new int[n];
            // used to store the generated array
            a = g.Generate(n);
            // used to store the sorted array
            b = s.sort(a);
            // if sorted list is either null or 0 we print
            if (b == null || b.length == 0) {
                System.out.println("Array is null or empty.");
            } else {
                for (int j = 0; j < b.length - 1; j++) {
                    // Check if the element is greater than or equal to the next element
                    if (b[j] > b[j + 1]) {
                        throw new AssertionError("\nTest Fail: Array not sorted!");
                    } else if (j == (b.length - 2)) {
                        // if no errors are encountered we print pass
                        System.out.println("\nPass!");
                    }
                }
            }
            System.out.println("--------------------------------------------");

        }
    }
}