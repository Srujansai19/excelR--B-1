public class Demo053 {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        else {
            return n*fact(n-1);
        }    
    }
    static void strong(int x){
        int num = x, sum=0;

        while(x!=0){
            int digit = x%10;
            sum = sum + fact(digit);
            x = x/10;
        }
        if(sum==num){
            System.out.println(num+" is a strong number");
        }
        else{
            System.out.println(num+" is not a strong number");
        }
    }

    public static void main(String[] args) {
        int x = 145;
        strong(x);
    }
}
