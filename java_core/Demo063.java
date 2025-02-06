
public class Demo063 {
    static void sum(int[] arr){
        if(arr==null){
            return;
        }

        int n = arr.length;

        int first = arr[0];
        int last = arr[n-1];

        int sum = first+last;

        System.out.println("Sum: "+sum);
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        
        sum(arr);
    }
}
