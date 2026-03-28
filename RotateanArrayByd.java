public class RotateanArrayByd {
    static void rotateArr(int[] arr, int d){
        int n = arr.length;
        d%=n;
        reverse(arr, 0, d-1);

        reverse(arr, d, n-1);

        reverse(arr, 0, n-1);
    }
    public static void reverse(int[] arr, int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int d = 2;

        rotateArr(arr,d);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
