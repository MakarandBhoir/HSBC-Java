package test05;

public class InvalidStudentScore extends Exception {
	public InvalidStudentScore(double score) {
		super("Invalid Score = "+score);
	}
}
