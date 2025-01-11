import java.util.Scanner;
public class demo002 {
    public static void main(String[] args) {
        //greatest number of 3
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of First number: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of Second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of Third number: ");
        int c = sc.nextInt();

        if(a>b && a>c){ 
            System.out.println("a is greatest");
        }
        else if(a<b && b>c){
            System.out.println("b is greatest");
        }
         else{
            System.out.println("c is greatest");

        }
        
    }

    
}
