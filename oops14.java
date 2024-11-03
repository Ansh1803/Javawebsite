import java.util.ArrayList;

class School {
    private ArrayList<String> students = new ArrayList<>();
    private ArrayList<String> teachers = new ArrayList<>();

    public void addStudent(String student) {
        students.add(student);
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
    }

    public void displayInfo() {
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
    }
}

public class SchoolExample {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent("Alice");
        school.addTeacher("Mr. Smith");
        school.displayInfo();
    }
}

/*
Output:
Students: [Alice]
Teachers: [Mr. Smith]
*/
