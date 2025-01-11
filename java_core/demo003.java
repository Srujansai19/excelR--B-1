import java.util.Scanner;
public class demo003 {
    public static void main(String[] args) {
        //Greatest of 2 numbers
        
        Scanner sc = new Scanner(System.in);
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
