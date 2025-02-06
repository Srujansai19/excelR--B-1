public class Demo045 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println("a value before swapping is: "+a);
        System.out.println("b value before swapping is: "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a value after swapping is: "+a);
        System.out.println("b value after swapping is: "+b);
    } 
}
