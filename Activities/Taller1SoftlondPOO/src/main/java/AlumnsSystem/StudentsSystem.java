package AlumnsSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentsSystem {
    private List<Student> students;

    public StudentsSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void assignNotes(int id, double note) {
        for (Student student : students) {
            if (student.getId()==id) {
                student.assignNotes(note);
                break;
            }
        }
    }

    public void showInformationStudent() {
        for (Student student : students) {
            System.out.println(student.toString());
            System.out.println("*******************************************************************************************");
        }
    }
}
