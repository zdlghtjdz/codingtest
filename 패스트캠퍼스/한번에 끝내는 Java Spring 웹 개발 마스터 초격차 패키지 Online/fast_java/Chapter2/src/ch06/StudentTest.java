package ch06;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();  //디폴트 생성자가 없기 때문에, 생성해주지 않으면 , 에러남.
		
		System.out.println(studentLee.showStudetInfo()); 
		
		Student studentKim = new Student(123456, "Kim", 3);
		System.out.println(studentKim.showStudetInfo());
	
	}

}

