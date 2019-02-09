import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {
		
		Student Adeleke = new Student(80, 1001);
		Student Damola = new Student(65, 1002);
		Student Fadeke = new Student(88, 1003);
		Student Irede = new Student(94, 1004);
		Student Ayobami = new Student(23, 1005);
		
		ArrayList<Student> studentData = new ArrayList<Student>();
		studentData.add(Adeleke);
		studentData.add(Damola);
		studentData.add(Fadeke);
		studentData.add(Irede);
		studentData.add(Ayobami);
		
		addRecord( studentData, 88, 1006);
		double studentAverage = averageRecord(studentData);
		
		for (Student ij : studentData)
			System.out.println("ij in studentData holds: " + ij.getStudentGrade());
		
		System.out.println("studentAverage is: " + studentAverage);

	}
	
	public static void addRecord ( ArrayList<Student> currentStudents, int studentGrade, int studentNumber ) {
		Student newStudent = new Student(studentGrade, studentNumber);
		currentStudents.add(newStudent);
	}
	
	public static double averageRecord( ArrayList<Student> currentStudents ) {
		double avg = 0.0;
		double sum = 0.0;
		for (Student student : currentStudents) 
			sum += student.getStudentGrade();
		
		avg = sum / currentStudents.size();
		
		return avg;
	}

}
