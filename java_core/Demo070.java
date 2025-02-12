import java.util.Arrays;

public class Demo070 {
    static void prime(int[] arr) {
        int n = arr.length;
        int[] primes = new int[n];
        int count = 0;  // Counter to track prime numbers

        for (int i : arr) {
            if (i <= 1) continue;  // Skip non-positive numbers
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {  // Check divisibility up to sqrt(i)
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[count++] = i;  // Store prime number
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(primes, count)));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        prime(arr);
    }
}
