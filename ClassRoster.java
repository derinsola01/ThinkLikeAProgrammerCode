
public class ClassRoster {

	public ClassRoster() {
	}
	
	public ClassRoster(String studentName, String letterGrade, int studentID, int finalGrade) {
		super();
		this.studentName = studentName;
		this.letterGrade = letterGrade;
		this.studentID = studentID;
		this.finalGrade = finalGrade;
	}

	private String studentName;
	private String letterGrade;
	private int studentID;
	private int finalGrade;
	
	
	public String getLetterGrade() {
		return letterGrade;
	}
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getFinalGrade() {
		return finalGrade;
	}
	public void setFinalGrade(int finalGrade) {
		this.finalGrade = finalGrade;
	}
	
//	public ClassRoster getStudentRecord (int suppliedID) {
//		if (suppliedID == getStudentID()) {
//			
//		} else
//			return null;
//		return null;
//	}

	@Override
	public String toString() {
		return "ClassRoster [studentName=" + studentName + ", letterGrade=" + letterGrade + ", studentID=" + studentID
				+ ", finalGrade=" + finalGrade + "]";
	}

}
