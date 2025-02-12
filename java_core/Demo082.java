
import java.util.Arrays;



public class Demo082 {
    static void copy(int[] arr){
        int n = arr.length;
        int[] result = new int[n];

        System.arraycopy(arr,0,result,0,n);
        System.out.println("Copied array: "+Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        copy(arr);
    }
}
