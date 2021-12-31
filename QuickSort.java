import java.util.*;

class QuickSort {

    public static int quickSort(int[] arr, int start, int end) {
        int pivotIndex = start;
        int i = pivotIndex + 1;
        int piv = arr[pivotIndex];
        for (int j = pivotIndex + 1; j <= end; j++) {
            if (arr[j] < piv) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, pivotIndex, i - 1);
        return i - 1;
    }

    public static void quickSorting(int[] arr, int left, int right) {
        if (left < right) {

            int pivotal = quickSort(arr, left, right);
            quickSorting(arr, left, pivotal - 1);
            quickSorting(arr, pivotal + 1, right);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}