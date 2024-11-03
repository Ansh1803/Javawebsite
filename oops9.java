import java.time.LocalDate;
import java.time.Period;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int calculateYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Years of Service: " + calculateYearsOfService());
    }
}

public class EmployeeYearsOfServiceExample {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 60000, LocalDate.of(2015, 5, 20));
        emp.displayInfo();
    }
}

/*
Output:
Name: John, Salary: 60000.0, Years of Service: 9
*/
