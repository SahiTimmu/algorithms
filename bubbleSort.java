import java.util.*;
/*compare adjacent elements 
swap them accordingly
O(N)= N^2*/

class BubbleSort {
    public static void bubbleSort(int arr[], int length) {

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}