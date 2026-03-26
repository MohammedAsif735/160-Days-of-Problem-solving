public class pushZeroesToEnd {
    public static int PushZeroesToEnd(int[] arr){
        int size = arr.length;
        int[] temp = new  int[size];
        int j = 0;
        for(int i =0; i<size;i++){
            if(arr[i] != 0){
                temp[j++]  = arr[i];
            }
        }
        while(j < size){
            temp[j++] = 0;
        }
        for(int i=0;i<size;i++){
            arr[i] = temp[i];
        }
        return 0;
    }
    public static void main(String args[]){
        int[] arr = {2,0,3,1,0,6,2,0};
        PushZeroesToEnd(arr);
        for(int num : arr){
            System.out.print("   "+  num);
        }
    }
}
