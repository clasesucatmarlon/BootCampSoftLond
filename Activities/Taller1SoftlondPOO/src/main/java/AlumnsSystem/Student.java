package AlumnsSystem;

import java.util.ArrayList;

public class Student {
    public static int countID = 1;
    public int id;
    private String name;
    private double age;
    private ArrayList<Double> notes;

    public Student(String name, double age) {
        this.id = countID++;
        this.name = name;
        this.age = age;
        this.notes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "STUDENT = { " +
                "id = " + id +
                ", name = " + name +
                ", age = " + age +
                ", notes = " + notes +
                ", average = " + getAverageStudent() +
                " }";
    }

    public void assignNotes (double note) {
        notes.add(note);
    }

    public double getAverageStudent () {
        if (notes.isEmpty()) {
            return 0;
        }
        double acumNotes = 0;
        for (double note : notes) {
            acumNotes += note;
        }
        return acumNotes / notes.size();
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }


}
