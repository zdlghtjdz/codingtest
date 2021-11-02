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
			System.out.println("학생 " + studentName + "의 " + subject.SubjectName + 
					" 과목 성적은 " + subject.SubjectScore + "입니다.");
			total += subject.SubjectScore;
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
}
