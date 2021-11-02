package ch06;

public class Student {

	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {
		
	} // constructor overloading
	
	public Student(int studentNumber, String studentName, int grade) {
		// 가독성을 위해 이름을 같게함. this 키워드 사용.
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		
	}
	
	public String showStudetInfo() {
		
		
		return studentName + "학생의 학번은 " + studentNumber + " 이고, " + grade + "학년 입니다.";
	}
}
