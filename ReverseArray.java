public class ReverseArray {
    public static void reverseArray(int[] arr){
        int n = arr.length-1;
        System.out.println(" Initial array elements: ");
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]);
        }
        System.out.println("\nReverse Array elements: ");
        for(int i=n; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);
    }
}
