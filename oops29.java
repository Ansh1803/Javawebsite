class Employee {
    private String employeeId;
    private String employeeName;
    private double employeeSalary;

    public void setEmployeeId(String id) {
        this.employeeId = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double salary) {
        this.employeeSalary = salary;
    }

    public String getFormattedSalary() {
        return String.format("$%.2f", employeeSalary);
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId("E123");
        emp.setEmployeeName("Alice");
        emp.setEmployeeSalary(75000.00);

        System.out.println("Employee ID: " + emp.getEmployeeId() + ", Name: " + emp.getEmployeeName() + ", Salary: " + emp.getFormattedSalary());
    }
}

/*
Output:
Employee ID: E123, Name: Alice, Salary: $75000.00
*/
