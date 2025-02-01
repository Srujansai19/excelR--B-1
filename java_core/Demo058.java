public class Demo058 {
    public static void main(String[] args) {
        int x = 14;

        System.out.print("Factors of "+x+" are: ");
        for(int i=1; i<=x; i++){
            if(x%i==0){
                System.out.print(i+" ");
            }
        }

    }
}