import java.util.Scanner;

class Fibonnaci {
    void fib(int n) {
        System.out.println("Fibonacci Series for " + n + " terms: ");
        if (n <= 0) {
            return;
        }
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
//Fibonnaci series 20
public class demo020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int numTerms = sc.nextInt();
        Fibonnaci f = new Fibonnaci();
        f.fib(numTerms); 
        sc.close(); 
    }
}
