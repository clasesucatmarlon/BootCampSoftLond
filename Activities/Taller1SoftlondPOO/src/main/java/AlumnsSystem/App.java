package AlumnsSystem;

public class App {
    public static void main(String[] args) {
        StudentsSystem system = new StudentsSystem();


        // Created new Students
        Student student1 = new Student("Marlon1", 50);
        Student student2 = new Student("Marlon2", 20);
        Student student3 = new Student("Marlon3", 30);


        // Add students at system
        system.addStudent(student1);
        system.addStudent(student2);
        system.addStudent(student3);


        // Add note for each student for ID
        system.assignNotes(1, 10);
        system.assignNotes(1, 12);
        system.assignNotes(2, 05);
        system.assignNotes(2, 11);
        system.assignNotes(3, 16);
        system.assignNotes(3, 19);


        // Print students information
        system.showInformationStudent();
    }

}
