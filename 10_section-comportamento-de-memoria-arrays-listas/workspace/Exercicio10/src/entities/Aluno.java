package entities;

public class Aluno {
    private String name;

    private final Double[] notes = new Double[2];

    public Aluno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double[] getNotes() {
        return notes;
    }

    public void setNotes(int semester, double note) {
        this.notes[semester] = note;
    }

    public double getAverage() {
        double sum = 0.0;

        for (double note : this.notes) {
            sum += note;
        }

        return sum / notes.length;
    }
}
