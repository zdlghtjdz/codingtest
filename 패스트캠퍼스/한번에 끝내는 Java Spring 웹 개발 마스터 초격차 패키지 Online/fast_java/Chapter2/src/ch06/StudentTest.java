package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();  //����Ʈ �����ڰ� ���� ������, ���������� ������ , ������.
		
		System.out.println(studentLee.showStudetInfo()); 
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudetInfo());
	
	}

}

