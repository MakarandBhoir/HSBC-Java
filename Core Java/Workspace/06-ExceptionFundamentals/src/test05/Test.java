package test05;

public class Test {
	
	public boolean checkScore(double score) throws InvalidStudentScore{
		if(score >=0 && score <= 100) {
			return true;
		}else {
			InvalidStudentScore ex = new InvalidStudentScore(score);
			throw ex;
		}
	}
	
	public static void main(String[] args) {
		double score = -50;
		try {
			new Test().checkScore(score);
			System.out.println("No Problem!! score entered correctly!");
		}catch(InvalidStudentScore ex) {
			System.out.println(ex.getMessage());
		}
	}
}
