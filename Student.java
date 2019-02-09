public class Student {
	
	private int studentGrade;
	private int studentID;
	
	
	public Student() {
	}
	
	public Student(int studentGrade, int studentID) {
		super();
		this.studentGrade = studentGrade;
		this.studentID = studentID;
	}
	
	public int getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	@Override
	public String toString() {
		return "Student [studentGrade=" + studentGrade + ", studentID=" + studentID + "]";
	}
	
}
