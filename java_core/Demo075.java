public class Demo075 {
    static void max(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is " + max);
    }
    public static void main(String[] args) {
        int[] arr = {21,3,1,5,22};
        max(arr);
    }
}
