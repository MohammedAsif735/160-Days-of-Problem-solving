public class secondLargest {
    public static int getSecondLargest(int[] arr) {
        // code here
        int largest = -1;
        int secLargest = -1;
        int size = arr.length;
        for(int i =0; i<size;i++){
           if(arr[i] > largest){
               largest = arr[i];
           }
        }
        for(int i=0;i<size;i++){
            if(arr[i] > secLargest && arr[i] != largest){
                secLargest = arr[i];
            }
        }
        return secLargest;
        
    }
    public static void main(String args[]){
        int[] arr = {12,35,1,10,34,1};
        System.out.println(getSecondLargest(arr));
    }
}