import java.util.Scanner;
class demo016 {
    public static void main(String[] args) {
        //string reverser
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String: ");
            String str = sc.nextLine();

                    
                    String reversed = new StringBuilder(str).reverse().toString();
            
                    if (str.equals(reversed)) {
                        System.out.println("The string \"" + str + "\" is a palindrome.");
                    } else {
                        System.out.println("The string \"" + str + "\" is not a palindrome.");
                    }
        }
            }
}
