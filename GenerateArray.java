package q2;

import java.util.Random;

//used to generate random array
public class GenerateArray {

    public int[] Generate(int size) {
        // if the number is 0 or less then it we return null
        if (size <= 0) {
            return null;
        }
        // we create 2 random numbers generators A and B
        Random A = new Random(), B = new Random();
        // initialize an array of the passed size
        int arr[] = new int[size];
        // creates a new array
        for (int i = 0; i < size; i++) {
            // initializes each index with multiplication of 2 random numbers
            arr[i] = A.nextInt(100) * B.nextInt(100);
        }
        // print the unsorted array
        Print(arr);
        // returns the created array
        return arr;
    }

    // used to print the array
    public void Print(int arr[]) {
        System.out.println("\nUnsorted Array:");
        // loops through the array and prints the elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
