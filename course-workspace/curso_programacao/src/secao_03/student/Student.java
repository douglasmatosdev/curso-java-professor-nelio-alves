package secao_03.student;

public class Student {

	public String name;
	double[] notes = { 0.0, 0.0, 0.0 };
	private double media = 60.00;

	public void checkStatus(double finalNote) {

		if (finalNote >= this.media) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS %n", this.media - finalNote);
		}
	}

	public double finalNote() {
		double total = 0.0;

		for (double note : notes) {
			total += note;
		}

		return total;
	}
}
