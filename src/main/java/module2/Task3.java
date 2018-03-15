package module2;

/**
 * Find if number belongs to the array using binary search algorithm (Hint: use bubble sort from previous task)
 */
public class Task3 {
    public static boolean binarSearch(int key, int[] arr, int min, int max) {
        Task2.bubbleSort(arr);
        int midl = ((max - min) / 2) + min;
        if (max < min) {
            return false;
        }
        if (arr[midl] < key) {
            return (binarSearch(key, arr, midl + 1, max));
        } else if (arr[midl] > key) {
            return (binarSearch(key, arr, min, midl - 1));
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 99, 58, 144, 2, 65, 8, 9, 10, 14};
        System.out.println(binarSearch(14, arr, 0, arr.length - 1));
    }
}

