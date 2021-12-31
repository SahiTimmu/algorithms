import java.util.*;
/*
Every element is compared to all the left side elements and placed in a sorted order by swapping 
*/
class InsertionSort{

    public static void insertionSort(int arr[] , int length, int left){
        int j = left+1;
        if(j<length){
        for(int i=left;i>=0;){
            if(arr[j]<arr[i]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j=i;
            }
            i--;
        }

        left = left+1;
        insertionSort(arr, length, left);
    }

    else {
        System.out.println("Insertion Sort");
            for (int i = 0; i < length; i++) 
            System.out.println(arr[i]);
        return;
    }
}
}