package test05;

public class Student implements Comparable<Student> 
{
	private int studentId;
	private String studentName;
	private double studentScore;

	public Student(int studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}
		
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.studentScore > o.studentScore) {
			return -1;
		}else {
			return 1;
		}
	}
}




