import java.util.Scanner;
public class Demo002 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of First number: ");
            int a = sc.nextInt();
            System.out.println("Enter the value of Second number: ");
            int b = sc.nextInt();

            if(a>b){ 
                System.out.println(a+" is greatest");
            }
            else{
                System.out.println(b+" is greatest");
            }
        }
        
    }

    
}
