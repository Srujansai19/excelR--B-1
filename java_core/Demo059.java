public class Demo059 {
    static void isPrime(int x){
        if(x<1) {
            System.out.println("Enter a positive number");
        }

        for(int i=2; i<x-1; i++){
            if(x%i==0){
                System.out.println(x+" is not a prime number");
                return;
            }
        }
        System.out.println(x+" is a prime number");
    }
    public static void main(String[] args) {
        int x = 26;
        isPrime(x);
    }
}