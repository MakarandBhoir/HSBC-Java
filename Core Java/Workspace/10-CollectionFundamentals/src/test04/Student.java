package test04;

public class Student {
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
	public int hashCode() {
		return 29 * studentId;
	}
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		if(student.studentId == this.studentId &&
				student.studentName.equals(this.studentName) &&
				student.studentScore == this.studentScore) {
			return true;
		}
		return false;
	}
		
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
}
