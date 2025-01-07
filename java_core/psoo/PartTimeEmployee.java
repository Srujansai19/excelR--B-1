class Employee1 {
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public Employee1() {
        this.id = 1;
        this.firstName = "Srujan";
        this.lastName = "sai";
        this.address = "Hyd";
    }

    public Employee1(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getId() {
        return this.id;
    }

    public String getAddress() {
        return this.address;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}



public class PartTimeEmployee extends Employee1{
    private int hoursWorked;
    private double amountPerHour;

    public PartTimeEmployee() {
        super();
        this.hoursWorked = 5;
        this.amountPerHour = 10.0;
    }

    public PartTimeEmployee(int id, String firstName, String lastName, String address, int hoursWorked, double amountPerHour) {
        super(id, firstName, lastName, address); 
        this.hoursWorked = hoursWorked;
        this.amountPerHour = amountPerHour;
    }

    public double computeSal() {
        return this.hoursWorked * this.amountPerHour;
    }

    public void showDetails() {
        System.out.println("Employee ID: " + this.getId());
        System.out.println("Full Name: " + this.getFullName());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Hours Worked: " + this.hoursWorked);
        System.out.println("Amount Per Hour: " + this.amountPerHour);
        System.out.println("Salary: " + this.computeSal());
    }

    public static void main(String[] args){
        PartTimeEmployee emp = new PartTimeEmployee();
        emp.showDetails();
    }
}