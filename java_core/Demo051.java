public class Demo051 {
    static void isPalindrome(int x){
        
        int reverse = 0;
        int original = x;
        while(x!=0){
            int digit = x%10;

            reverse = reverse*10+digit;
            x = x/10;
        }
        if(original==reverse){
            System.out.println("The number is a palindrome");
        }
        else {
            System.out.println("The number is not a palindrome");
        }
    }
    public static void main(String[] args) {
        int x = 121;
        isPalindrome(x);
    }
}
