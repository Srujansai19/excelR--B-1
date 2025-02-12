public class Demo073 {
    static void duplicates(int[] arr){
        int n = arr.length;

        
        for(int i=0 ; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]) {
                    System.out.println("Duplicate elements: "+arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,10,20,30,30,20};
        duplicates(arr);
    }
}
