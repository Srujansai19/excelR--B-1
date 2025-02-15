public class Demo062 {
    static void printNumbers(int[] arr){
        if(arr==null){
            return;
        }

        int n = arr.length;
        int first = arr[0];
        int second = arr[1];
        int last = arr[n-1];

        System.out.println("First: "+first);
        System.out.println("Second: "+second);
        System.out.println("Last: "+last);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        printNumbers(arr);
    }
}