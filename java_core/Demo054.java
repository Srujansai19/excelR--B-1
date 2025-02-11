class  Overloading{
    int add(int x1, int x2){
        return x1+x2;
    }
    double add(double x1,double x2){
        return x1+x2;
    }

    int add(int x1, int x2,int x3){
        return x1+x2+x3;
        
    }
}
public class Demo054 {
    public static void main(String[] args) {
        Overloading l  =new Overloading();

        System.out.println("Addition of two integers: "+l.add(12,12));
        System.out.println("Addition of two doublea: "+l.add(12.5,12));
        System.out.println("Addition of three integers: "+l.add(12,12,12));
    }
}
