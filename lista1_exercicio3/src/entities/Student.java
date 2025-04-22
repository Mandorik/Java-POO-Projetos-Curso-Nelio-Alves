package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	
	public double grading(){
		return grade1 + grade2 + grade3;
	}
	
	public double passedOrFailed() {
		
		double missingGrade = 60.00 - grading();
		
		if (grading() > 60.00) {
			return 0.0;
		} else {
			return missingGrade;
		}
	}
	
}
