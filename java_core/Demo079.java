public class Demo079 {
    static void find(int[] arr, int search){
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]==search){
                System.out.println(search+" found at index "+i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int search = 30;
        find(arr, search);
    }
}
