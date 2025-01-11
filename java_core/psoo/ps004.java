class Client {
    
    private double basePay;
    private int hoursWorked;

    
    public Client(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    
    public Client() {
        this.basePay = 0.0;
        this.hoursWorked = 0;
    }

    
    public void computeSalary() {
        if (basePay < 8.00) {
            System.out.println("Error: Base pay is below the minimum wage of $8.00 per hour.");
            return;
        }

        if (hoursWorked > 60) {
            System.out.println("Error: Hours worked exceed the maximum limit of 60 hours per week.");
            return;
        }

        double totalPay;
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * basePay) + (overtimeHours * basePay * 1.5);
        }

        System.out.println("Total Pay: $" + String.format("%.2f", totalPay));
    }

}
public class ps004{
    public static void main(String[] args) {
        Client employee1 = new Client(7.50, 35);
        Client employee2 = new Client(8.20, 47);
        Client employee3 = new Client(10.00, 73);

        System.out.println("Employee 1:");
        employee1.computeSalary();

        System.out.println("\nEmployee 2:");
        employee2.computeSalary();

        System.out.println("\nEmployee 3:");
        employee3.computeSalary();
    }
}
