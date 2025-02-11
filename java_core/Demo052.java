public class Demo052 {
    static void armstrong(int x){
        int count=0;
        int num = x;
        while(x!=0){
            x = x/10;
            count++;
        }
        
        int sum =0;

        while(x!=0){
            int digit = x%10;
            sum = sum + (int)Math.pow(digit, count);
            x = x/10;
        }
        if(sum==x){
            System.out.println(num+" is an armstrong number");
        }


    }
    public static void main(String[] args) {
        int x = 153;
        armstrong(x);
        
    }
}
