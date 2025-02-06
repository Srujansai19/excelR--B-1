public class Demo049 {
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
        Demo049 d = new Demo049();
        int x = 341;
        d.reverse(x);
    }
}
