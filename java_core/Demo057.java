public class Demo057 {
    static void sumOfFirstAndLast(int x){
        int last = x%10;

        int first=x;
        while(first>=10){
            first /= 10;
        }
        System.out.println(first);
        
        int sum = first+last;
        System.out.println("Sum of first and last digits of "+x+" is: "+sum);
    }
    public static void main(String[] args) {
        int x = 422;
        sumOfFirstAndLast(x);
    }
}