
import java.util.Arrays;

public class Demo077 {
    static void copy(int[] arr){
        int n= arr.length;
        int[] arr1 = new int[n];
        
        System.arraycopy(arr, 0, arr1, 0, n);
        
        // for(int i=0;i<n;i++){
        //     arr1[i]=arr[i];
        // }
        
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        copy(arr);
    }
}
