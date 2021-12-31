class MergeSort{

    /*
    break the array into smaller chunks
    then create subarrays to merge them together by sorting
    O(N) = Nlog(N)
    */

    public static void mergeSort(int[] arr, int left, int right, int length){

        if(left < right){
            int mid = (right+left)/2;

            mergeSort(arr, left, mid, length);
            mergeSort(arr, mid+1, right, length);

            mergeBoth(arr, left, right, mid, length);
        }
        else{

            System.out.println("Merge Sort");
            for (int i = 0; i < length; i++)
            System.out.println(arr[i]);
            return;
        }

    }

    public static void mergeBoth(int[] arr, int left, int right, int mid, int length){

        int leftLength = mid - left +1;
        int rightLength = right - mid;

        int[] leftSubArray = new int[leftLength]; //creating subarray
        int[] rightSubArray = new int[rightLength]; //creating subarray

        for(int i=0;i<leftLength;i++){
            leftSubArray[i] = arr[left + i];
        }

        for(int j=0; j<rightLength; j++){
            rightSubArray[j] = arr[mid + 1 + j];
        }

        int k = left;
        int i=0;
        int j=0;

        while(i<leftLength && j<rightLength){

            if(leftSubArray[i]<=rightSubArray[j]){
                arr[k] = leftSubArray[i];
                i++;
            }

            else{

                arr[k] = rightSubArray[j];
                j++;
            }

            k++;
        }

        while(i<leftLength){
            arr[k] = leftSubArray[i];
            i++;
            k++;
        }

        while(j<rightLength){
            arr[k] = rightSubArray[j];
            j++;
            k++;
        }
    }
        
}
