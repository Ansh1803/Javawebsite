import java.util.ArrayList;

class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Grade: " + grade + ", Courses: " + courses);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("Alice", "10th Grade");
        student.addCourse("Math");
        student.addCourse("Science");
        student.displayInfo();

        student.removeCourse("Math");
        student.displayInfo();
    }
}

/*
Output:
Name: Alice, Grade: 10th Grade, Courses: [Math, Science]
Name: Alice, Grade: 10th Grade, Courses: [Science]
*/
