import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private static int rollNoCounter = 1;
    private int rollNo;
    private String name;
    private String studentClass;

    public Student(String name, String studentClass) {
        this.rollNo = rollNoCounter++;
        this.name = name;
        this.studentClass = studentClass;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Class: " + studentClass);
    }
}

public class StudentRollNoExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter class of student " + (i + 1) + ": ");
            String studentClass = scanner.nextLine();
            students.add(new Student(name, studentClass));
        }

        System.out.println("Student Information:");
        for (Student student : students) {
            student.displayInfo();
        }
        scanner.close();
    }
}

/*
(Example Input):
Enter name of student 1: Alice
Enter class of student 1: 10th Grade
...
(Example Output):
Roll No: 1, Name: Alice, Class: 10th Grade
Roll No: 2, Name: Bob, Class: 11th Grade
...
*/
