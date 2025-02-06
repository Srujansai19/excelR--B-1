import java.util.Scanner;

class Demo012{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //radius of circle
        System.out.println("Enter radius of the circle: ");
        double r = sc.nextDouble();
        double area = (r*r*3.14);

        System.out.println("Area of circle is: "+ area);
    }
}
