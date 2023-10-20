package q2;

public class Sort {
    // performs insertion sort
    public int[] sort(int arr[]) {
        int temp, j;
        if (arr == null || arr.length == 0) {
            System.out.println("Array is null or empty.");
            return null;
        }
        // iterates till the length of the array
        for (int i = 1; i < arr.length; i++) {
            // stores the element as temp
            temp = arr[i];
            // gets prev element
            j = i - 1;
            // if temp is smaller than the its previous elements than we move the element at
            // current index to right
            // loop continues until the condition doesnot get violated.
            while (j >= 0 && temp <= arr[j]) {
                // moves previous element to right
                arr[j + 1] = arr[j];
                // decrements j to go to element before it
                j = j - 1;
            }
            // adds temp to the correct postion
            arr[j + 1] = temp;
        }

        System.out.println("\nSorted array:");

        // used to print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\n");
        }
        return arr;
    }

}
