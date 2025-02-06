
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

public class Demo060 {
    public static void main(String[] args) {
        Fibonnaci f = new Fibonnaci();

        f.fib(20); 
    }
}
