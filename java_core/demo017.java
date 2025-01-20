import java.util.Scanner;
public class demo017 {
    public static int addDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; 
            number = number / 10; 
        }
        
        return sum;
    }
    //sum of digits of a number
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            int result = addDigits(number);
            System.out.println("The sum of digits of " + number + " is: " + result);
        }
    }
}
