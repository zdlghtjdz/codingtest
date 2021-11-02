package ch24;

import java.util.ArrayList;

public class Student {
	
	
	public String studentName;
	public int studentNumber;
	
	public ArrayList<Subject> studentSubjectArray = new ArrayList<>();

	public Student(int studentNumber, String studentName) {
		
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	}
	
	public void addSubject(String SubjectName, int SubjectScore) {
		studentSubjectArray.add(new Subject(SubjectScore, SubjectName));
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		
		for(Subject subject : studentSubjectArray) {
			if(subject == null) {
				break;
			}
			System.out.println("�л� " + studentName + "�� " + subject.SubjectName + 
					" ���� ������ " + subject.SubjectScore + "�Դϴ�.");
			total += subject.SubjectScore;
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + " �Դϴ�.");
	}
}
