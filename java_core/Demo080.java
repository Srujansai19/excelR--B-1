
import java.util.Arrays;

public class Demo080 {
    static void shift(int[] arr){
        int n = arr.length;
        int temp = arr[0];

        int[] result = new int[n];
        int idx = 0;
        for(int i=1; i<n; i++){
            result[idx]=arr[i];
            idx++;
        }
        result[idx] = temp;
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        shift(arr);
    }
}
