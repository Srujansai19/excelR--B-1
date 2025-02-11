
import java.util.Arrays;

public class Demo068 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(arr));

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Count of even index elements: "+count);
    }
}
