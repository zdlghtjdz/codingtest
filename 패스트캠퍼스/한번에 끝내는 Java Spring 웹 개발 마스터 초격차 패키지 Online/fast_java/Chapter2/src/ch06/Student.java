package ch06;

public class Student {

	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {
		
	} // constructor overloading
	
	public Student(int studentNumber, String studentName, int grade) {
		// �������� ���� �̸��� ������. this Ű���� ���.
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		
	}
	
	public String showStudetInfo() {
		
		
		return studentName + "�л��� �й��� " + studentNumber + " �̰�, " + grade + "�г� �Դϴ�.";
	}
}
