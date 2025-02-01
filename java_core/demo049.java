public class demo049 {
    void reverse(int x){
        int reverse =  0;

        while(x!=0){
            int digit = x%10;

            reverse = reverse * 10 + digit;
            x= x/10;
        }
        System.out.println("Reverse of "+x+" is: " + reverse);
    }
    public static void main(String[] args) {
        demo049 d = new demo049();
        int x = 341;
        d.reverse(x);
    }
}