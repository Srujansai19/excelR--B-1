import java.util.Arrays;

class SortArray {
    void sort(int[] arr){
        if(arr==null){   
        return ;
        }
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<(n); j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
public class Demo074{
    public static void main(String[] args) {
        int[] arr = {2,1,4,1,5,3,6};
        SortArray s = new SortArray();
        s.sort(arr);
    }
}