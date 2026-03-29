public class NextPermutation {
    public static void nextPermutation(int[] arr){
        int n = arr.length; 
        int pivot = -1;
        //finding pivot index
        for(int i=n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
            pivot = i;
            break;
            }
        }

        // if not found pivot
        // reverse the whole array
        if(pivot == -1){
            reverse(arr, 0, n-1);
            return;
        }

        //find smallest number greater than pivot
        for(int i=n-1;i>pivot;i--){
            if(arr[i] > arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        //reverse the elements from pivot + 1
        reverse(arr, pivot+1, n-1);
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start++, end--);
        }
    }
    //swap elements 
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]){
        int[] arr = {2,4,1,7,5,0};
        nextPermutation(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
