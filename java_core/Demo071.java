public class Demo071 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nReverse Array:");
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        int n = arr.length-1;
        for(int i=n; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
