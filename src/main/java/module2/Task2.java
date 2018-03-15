package module2;

/**
 * By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.
 */

public class Task2 {
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i != 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 78, 9, 0, 15, 8, 7, 19, 6, 2};
        bubbleSort(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
