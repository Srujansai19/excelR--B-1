import java.util.Arrays;

public class Demo076 {
    static int secondMax(int[] arr){
        int max = 0;
        int secondMax = 0;

        for(int i:arr){
            if(i>max){
                secondMax = max;
                max = i;
            }
            else if(i>secondMax && i<max){
                secondMax = i;
            }
        }

        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {11,21,9,10,20};
        System.out.println(Arrays.toString(arr));
        System.out.println("Second maximum: "+secondMax(arr));
    }
}
