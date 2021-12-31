import java.util.*;

//find the minimum/maximum element in an unsorted array
//place those elements in the sorted array
//O(N) = N^2

class SelectionSort {

    public static void selectionSort(int arr[], int length, int min) {
        if (min < length) {
            int temp = arr[min];
            int pos = -1;
            for (int i = min + 1; i < length; i++) {
                if (temp > arr[i]) {
                    temp = arr[i];
                    pos = i;
                }
            }

            if (pos != -1) {
                int replace = arr[min];
                arr[min] = temp;
                arr[pos] = replace;
            }
            selectionSort(arr, length, min + 1);
        }

        else {
            System.out.println("Selection Sort");
            for (int i = 0; i < length; i++)
                System.out.println(arr[i]);
            return;
        }
    }

}
