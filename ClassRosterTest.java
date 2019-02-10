import java.util.ArrayList;

public class ClassRosterTest {

	public static void main(String[] args) {
		ArrayList<ClassRoster> studentList = new ArrayList<ClassRoster>();
		
		addRecord(studentList, "Derin Gbadebo", "A+", 001, 99);
		addRecord(studentList, "Derin Eluyemi", "B+", 002, 89);
		addRecord(studentList, "Derin Solanke", "A+", 003, 93);
		addRecord(studentList, "Derin Adebi", "C+", 004, 79);
		
		for (ClassRoster student : studentList ) 
			System.out.println("student.getStudentName() is: " + student.getStudentName());
		
		deleteRecord(studentList, 002);
		
		for (ClassRoster remainingStudent : studentList ) 
			System.out.println("remainingStudent.getStudentName() is: " + remainingStudent.getStudentName());
		
	}
	
	public static void addRecord(ArrayList<ClassRoster> studentList, String studentName, String letterGrade, int studentID, int finalGrade ) {
		ClassRoster newRecord = new ClassRoster(studentName, letterGrade, studentID, finalGrade );
		studentList.add(newRecord);
	}
	
	public static void deleteRecord(ArrayList<ClassRoster> studentList, int studentID ) {
		ClassRoster studentRecordToBeRemoved = new ClassRoster();
		for (ClassRoster studentRecord : studentList ) {
			if (studentID == studentRecord.getStudentID())
				studentRecordToBeRemoved = studentRecord;
			
		}
		studentList.remove(studentRecordToBeRemoved);
	}

}
