
import java.util.ArrayList;

public class majorityElement {
    public static ArrayList<Integer> findMajoriy(int[] arr){
        int  n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            int count  = 0;
            for(int j=i;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > n/3){
                if(res.size() == 0 || arr[i] != res.get(0)){
                    res.add(arr[i]);
                }
            }

            if(res.size() == 2){
                if(res.get(0) > res.get(1))
                    java.util.Collections.swap(res,0,1);
                break;
            }
        }
        return res;
    }
    public static void main(String args[]){
        int[] arr = {2,2,3,1,3,2,1,1};
        ArrayList<Integer> res = findMajoriy(arr);
        for(int el : res){
            System.out.print(el + " ");
        }
    }
}
