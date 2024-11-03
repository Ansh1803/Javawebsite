class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void calculateSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Developer", 50000);
        emp.displayInfo();
        emp.calculateSalary(10);
        emp.displayInfo();
    }
}

/*
Output:
Name: Alice, Job Title: Developer, Salary: 50000.0
Name: Alice, Job Title: Developer, Salary: 55000.0
*/
