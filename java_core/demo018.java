import java.util.Scanner;

class MinToYear{
    void years(int min){

        int y = min/(365*24*60);
        System.out.println("Years: "+y);
    }
}
public class demo018 {
    //Minutes to years conversion
    public static void main(String[] args) {
        MinToYear m = new MinToYear();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int min = sc.nextInt();
        m.years(min);
}
}
