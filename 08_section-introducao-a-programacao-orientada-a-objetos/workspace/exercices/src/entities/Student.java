package entities;

public class Student {
    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double finalGrade() {
        return note1 + note2 + note3;
    }

    public String message() {
        double note = finalGrade();
        if (note >= 60) {
            return String.format("FINAL GRADE = %.2f%nPASS%n", note);
        } else {
            double missingNote = 60 - note;
            return String.format("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS%n", note, missingNote);
        }
    }
}
