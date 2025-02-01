public class Demo055 {
    static void squareSum(int x){
        int sum = 0;

        while(x!=0){
            int digit = x%10;
            sum = sum + (digit*digit);
            x = x/10;
        }
        System.out.println("Sum of square of digits in "+x+" is: "+sum);
    }

    public static void main(String[] args) {
        int x = 28;
        squareSum(x);
    }
}