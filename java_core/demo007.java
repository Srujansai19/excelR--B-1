import java.util.Scanner;
public class demo007 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String a = sc.nextLine();
        System.out.println("Enter your age: ");
        int b = sc.nextInt();
        System.out.println("Enter your Phone number:  ");
        Long c = sc.nextLong();
        //Printing Name, Age and Phone number
        System.out.println("Your name is: "+a);
        System.out.println("Your age is: "+b);
        System.out.println("Your Phone number is: "+c);
    }

    
}
