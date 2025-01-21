import java.util.Scanner;

class demo019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i+ "-fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println(i+ "-fizz");
            } else if (i % 5 == 0) {
                System.out.println(i+"-buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}