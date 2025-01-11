import java.util.Scanner;

class TaxOnIncome {
    int HRA;
    int PF;
    int salary;

    public void calculateTax() {
        int deductions = HRA + PF;
        int TaxableIncome = salary - deductions;

        System.out.println("Your salary is: " + salary);
        System.out.println("Your deductions are: " + deductions);
        System.out.println("Taxable income is: " + TaxableIncome);

        if (TaxableIncome <= 0) {
            System.out.println("Please enter a valid salary");
        } else if (TaxableIncome < 500000) {
            double taxPayable = TaxableIncome * 0.10; 
            System.out.println("The tax Payable is: " + taxPayable);
        }
    }
}

public class demo022 {
    public static void main(String[] args) {
        TaxOnIncome t = new TaxOnIncome();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        t.salary = sc.nextInt();

        System.out.println("Enter the HRA: ");
        t.HRA = sc.nextInt();

        System.out.println("Enter the PF: ");
        t.PF = sc.nextInt();

        t.calculateTax(); 
    }
}