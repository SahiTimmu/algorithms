
import java.util.*;

public class app {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Please enter the size of the array");
        int length = s.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.println("Enter the values for the array:" + i + ":");
            arr[i] = s.nextInt();
        }

        BubbleSort.bubbleSort(arr, length);
        SelectionSort.selectionSort(arr, length, 0);
        InsertionSort.insertionSort(arr, length, 0);
        MergeSort.mergeSort(arr, 0, length, length);
        QuickSort.quickSorting(arr, 0, length - 1);

        System.out.println("Quick Sort");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}
