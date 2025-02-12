public class Demo081 {
    static void leader(int[] arr){
        int n = arr.length;
        int leader = arr[n-1];
        System.out.println(leader+" is a leader");
        
        for(int i=n-2; i>=0; i--){
            if(arr[i]>leader){
                leader = arr[i];
                System.out.println(leader+" is a leader");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={11,9,20,14,17,14};
        leader(arr);
    }
}
